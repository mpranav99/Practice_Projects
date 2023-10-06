// console.log(process.argv.splice(2)[0]); // use process.argv to read in the arguments from command line
const minimist = require("minimist")

// process.argv.forEach((val , index)=>{
//     console.log(`${val} ${index}`)
// })

const argNew = minimist(process.argv.splice(2))
console.log(argNew.name);