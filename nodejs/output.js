// we can use % symbol to fomat var to certain types while passing it to command line/console
// %s -> string 
// %d -> number 
// %o -> object 
// %i -> integer

// console.log("Hey my name is %s and my age is %d", 'Pranav' , 23);

//to render stacktrace while debugging we can use : 
// const func1 = ()=> console.trace()
// const func2 = ()=> func1()

// func2();

// to check the time consumed by a function we can do: 
// const sum = ()=> { console.log(`the sum of 2 and 3 is : ${2 + 3}`)}
// const mul = ()=> { console.log(`the product of 2 and 3 is : ${2 * 3}`)}

// const measureTime = ()=>{
//     console.time("sum()");
//     sum();
//     console.timeEnd("sum()");
//     console.time("mul()");
//     mul();
//     console.timeEnd("mul()");
// }
// measureTime();

// add a progress bar 
const ProgressBar = require("progress")
const bar = new ProgressBar("downloading [:bar] :rate/bps :percent :etas",{
    total:10,
})

const timer = setInterval(()=>{
    bar.tick();
    if(bar.complete){
        clearInterval(timer)
    }
},100)
//to add styling into console messages we can use chalk : 
const chalk = require("chalk")
console.log(chalk.red("This is progressBar:"))