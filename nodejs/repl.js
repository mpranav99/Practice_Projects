const repl = require("repl") // this is to laod up the cli of node thru the js file

const local = repl.start()

local.on('exit', ()=>{
    console.log("Someone exited")
    process.exit()
}) // this creates a callback fnc to xecute code on exiting the cli
