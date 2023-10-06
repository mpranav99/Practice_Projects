const prompt = require("prompt-sync")()

const  userLogin = () => {
    let username = prompt("What is your name")
    let  password = prompt("Please enter password!")

    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Authentication in progress")
            if(username!=="" && password !== ""){
                resolve("Authentication successful")
            }
            else{
                reject("Authentication failed")
            }            
        },1000)
       
    })
}

function goToHomePage(userAuthSatus){
    return Promise.resolve(`Go to homepage as , ${userAuthSatus}` )
}

// userLogin().then((response)=>{
//     console.log(response)
//     return goToHomePage(response)
// }).then((authStatus)=>{
//     console.log(authStatus)
// }).catch((err)=>{
//     console.log(err)    
// })

// the same above issue can be dealt with asyc-await in a more cleaner code prospect 

async function checkForAuthentication(){
    try{
        const response = await userLogin()
        console.log(response)
        const userAuthStatus = await goToHomePage(response);
        console.log(userAuthStatus)
    }catch(err){
        console.log(err)
    }
   
}
checkForAuthentication()