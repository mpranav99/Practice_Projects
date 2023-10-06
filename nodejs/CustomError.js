class CustomError extends Error{
    constructor(message){
        super(message);
        console.log("this is custom-error")
    }
}

module.exports = {CustomError};