//Example of async using a practical example :
// console.log("Start operation")

// const fn = (ms) => {
//     const getTime = new Date().getTime()
//     console.log("operation in progress")
//     while(new Date().getTime() < getTime+ms){
//         console.log("operation wihin block")
//     }   
//     console.log("operation ended")
// }
// fn(1000)
// console.log("do something else")
// this above code blocks the rest of the oprns to be executed until while loop isnt terminated
// CAllbcacks : 
function sample(cb){
    setTimeout(()=>{
        cb(null, "This is data from server"),0 })
}

function sample2(){
    setTimeout(()=>console.log("This is an async task exec!!"),0)
}

sample((err,data)=>{
    if(err) throw err
    console.log(data)
})

