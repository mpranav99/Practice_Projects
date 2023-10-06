const express = require("express")
var app = express();
const router = express.Router()
const multer = require("multer");
const upload = multer({dest:"./public/uploads"})

const port  = 5001; 
//Built-In middleware
app.use(express.json());
app.use(express.urlencoded({extended: true}));

app.listen(port,()=>{
    console.log(`Server started at port ${port}`);
})


//Application-level middleware
const loggerMiddleware = (req,res,next)=>{
    console.log(`${new Date()} --- Request [${req.method}]  ${req.url}`)
    next();
}

app.use(loggerMiddleware)

//Router level middleware
const fakeAuth = (req,res,next)=>{
    const authStatus = true;
    if(authStatus){
        console.log("Authorization successful", authStatus)
        next();
    }else{
        res.status(401);
        throw new Error("User not authorized");
    }
}
router.use(fakeAuth)
const getUsers = (req,res)=>{
    res.json({"message" : "Get All USers"});
    
}
const createUser = (req,res)=>{
    console.log("Request Body: " ,req.body)

    res.json({"message" : "Create  a USer"});

}
router.route("/").get(getUsers).post(createUser);
app.use("/api/users",router)

//Error level middleware
const errorlevelmiddleware = (err,req,res,next)=>{
    const statusCode = res.statusCode ? res.statusCode : 500; 
    res.status(statusCode)
    switch(statusCode){
        case 401 : res.json({title : "Unauthorized", message: err.message })
                    break;
        case 404 : res.json({title : "User Not Found", message: err.message })
                    break;
        case 500 : res.json({title : "Server Not Found", message: err.message })
                    break;
        default : break;
    }
    next();
}

app.use(errorlevelmiddleware);

//third-party middleware
app.post("/upload",upload.single("image"),(req,res,next)=>{
    console.log(req.file,req.body)
    res.send(req.body);
},(err,req,res)=>{
    res.status(400).send({err:err.message})
})

app.all("*",(req,res,next)=>{
    res.status(400).send({message: "Route Not Found"})
})