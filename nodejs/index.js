require("dotenv").config()// this is for loading the env variables into js file

// console.log("Hello")
// console.log("Hey welcome to tutorial")
// console.log("Thanks")
// process.exit(0)
// process.exitCode = 0
// console.log("hi my name is " + process.env.NAME)

// const {data} = require("./car")
// const {car1} = data;
// console.log(car1)

const {car2, car1} = require("./car")
console.log(JSON.stringify(car2,null,2))
console.log(JSON.stringify(car1,undefined,3))