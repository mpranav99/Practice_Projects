const readline = require("readline") //  this enables us read data thru user and give approp output
const prompt = require("prompt-sync")()

const rl = readline.createInterface({
    input : process.stdin,
    output: process.stdout,
})

// rl.question('What is your name?', name =>{
//     console.log(`hi ${name}`)
//     rl.close()
// })
// another way/ alternative is to use promts which saves us from writing callbacks!!
const name = prompt("what is your name?");
console.log(name)