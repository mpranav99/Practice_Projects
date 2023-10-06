// function sample(){
//     return new Promise((resolve,reject)=>{
//         if(true)
//             resolve("The process is in progress")
//         else{
//             reject("The process is destroyed")
//         }
//     })
// }
// //nesting of promises
// sample()
// .then((val)=>{
//     console.log(val)
//     return("Task2")
// }).then((val)=>{
//     console.log(val)
// }).catch((err)=>{
//     console.log(err)
// })


// we can also call multiple promises simultaneously
const makeApiCall = (time)=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("The api is called in " + time)
        },time)
    })
}
const muiltiApiCall = [makeApiCall(1000), makeApiCall(2000),makeApiCall(500)]
// Promise.all(muiltiApiCall).then((values)=>{
//     console.log(values)
// })

async function check() {
   for(let api of muiltiApiCall){
    console.log(await api)
   }
}
check()
