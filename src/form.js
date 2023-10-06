import React from 'react';
import {useState} from 'react';
import "bootstrap/dist/css/bootstrap.min.css";
import { Link, Navigate, Outlet, useNavigate} from 'react-router-dom';

function MyForm(){

        const navigate = useNavigate();
        const [username,setUsername] = useState('')
        const [password,setPassword] = useState('')
        const [success,setSuccess] = useState('')
        const [error,setError]= useState('')
        const handleSubmit = (event) => {
            event.preventDefault()
            if(username===""||password==="") {
                setError("Enter username and password")
                setSuccess("")
            }
            else {
                setSuccess("Login successful")
                setError("")
               navigatePAge()
            }
          
            
        }
        
        const navigatePAge= ()=> {
          navigate('/home/'+username)
        }
        
      return (
        <>
          <div className="container" style={{marginTop:"20px"}}>
          <h1 style={{marginTop:"10px",backgroundColor:"lightblue",width:"100%"}}>
            Hello There! Welcome to our Page
            </h1>
            <p style={{color:'green',}}>To continue please Login...</p>
            <br></br>
            <form onSubmit={handleSubmit}>
              <div className="form-group">
                <label htmlFor="name">Username:</label>
                <input
                  style={{ width: "40%",marginTop:"10px" }}
                  type="text"
                  id="name"
                  value={username}
                  onChange={(event)=>setUsername(event.target.value)}
                  className="form-control"
                  placeholder="Enter Name"
                />
              </div>
              <div className="form-group" style={{marginTop:"10px" }}>
                <label htmlFor="pwd" >Password:</label>
                <input
                  style={{ width: "40%",marginTop:"10px" }}
                  type="password"
                  id="pwd"
                  value={password}
                  onChange={(event)=>setPassword(event.target.value)}
                  className="form-control"
                  placeholder="Enter password"
                />
              </div>
              <br></br>
  
              <button type="submit" className="btn btn-success">
                Login
              </button>
              {success?<div className="text-success">{success}</div>:null}
              {error?<div className="text-danger">{error}</div>:null}
            </form>
            
          </div>
        </>
      );
    };

export default MyForm;