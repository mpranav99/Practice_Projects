//handling error

const error = new Error("Something went wrong");
// console.log(error.message)
// throw new Error("This is an error!")

const {CustomError} = require("./CustomError")
// throw new CustomError("This is a new Custom Error!!")

//try catch exception

// try{
//     doSomething()
// }catch(e){
//     console.log("An error occured")
//     console.log(e)
// }

function doSomething() {
    const data = fetch("localhost:300/api")
    // console.log("Hi this is myFunction")
    return "Thanks"
}

//Uncaught exception 
// process.on("uncaughtException", (err) => {
//     console.log("An uncaught exception occured")
//     console.log(err)
// })

// doSomething()

// exception catching thru promises
// const promise = new Promise((resolve,reject)=>{
//     if(true){
//         resolve(doSomething())
//     }
//     else{
//         reject(doSomething())
//     }
// })

// promise.then((val)=>{
//     console.log(val)
// }).catch((e)=>{
//     console.log("Error caught")
//     console.log(e)
// })

//async- await exception: 

const myFunction = async ()=> {
    try {
        await doSomething();
    }catch(e){
    
        throw new CustomError(e.message)
    }
}
myFunction()