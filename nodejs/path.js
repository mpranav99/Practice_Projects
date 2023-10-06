const path = require("path")

const filePath = "C:\Users\pranav.m01\Documents\nodejs\files\sample.txt"
// const sample = "sample.txt";
// console.log(path.dirname(filePath))
// console.log(__dirname)

// console.log(path.join(__dirname, sample))

// fs : 
const fs = require("fs")
// //async way of file system read
// fs.readFile(path.join(__dirname,"files","sample.txt"),"utf-8",(err,data)=>{
//     if(err) throw new Error(err);
//     console.log(data)
// });

// try{
//     const data = fs.readFileSync(path.join(__dirname,"files","sample.txt"))
//     console.log(data)
// }catch(err){
//     throw new Error(err)
// }

// fileread using promise
const fsPromise = require("fs").promises

// const data = async () => {
// try {
//     const data = await fsPromise.readFile(path.join(__dirname,"files","sample.txt"),"utf-8")
//     console.log("FS:PROMISE ",data)
// }catch(err){
//     console.log(err)
// }
// }
// data()

// writing into a file: 
const textPath = path.join(__dirname, "files", "text.txt");
const content = "This is some sample content!!"

// fs.writeFile(textPath, content, (err)=>{
//     if(err) throw new Error(err)
//     console.log("Content written successfully!!")
//     fs.readFile(textPath, "utf-8", (err,data)=>{
//         if(err) throw new Error(err)
//         console.log(data)
//     })
// })

// writing and appending and reading can all be done best using promises than the above way
// we can use the below way to implement multiple file oprns using promises: 

const doFileOprns = async ()=>{
    try{
        await fsPromise.writeFile(textPath,content)
        await fsPromise.appendFile(textPath , "I have appended this data")
        await fsPromise.writeFile(textPath,"\n I m adding this using write oprn at the end of file",{
            flag : "a+"
        })
        await fsPromise.writeFile(textPath,"\n renaming the file ",{
            flag : "a+"
        })
        fsPromise.rename(textPath, path.join(__dirname,"files","newText.txt"))
        const data = await fsPromise.readFile(textPath)
        console.log(data.toString())
    }catch(err){
        throw new Error(err)
    }
}

doFileOprns()