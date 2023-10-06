import React from "react";
import { useParams } from "react-router-dom";

function About (){
    let params = useParams();
    return(
       <div>
            <h1>{params.name}</h1>
       </div>
    )
}
export default About;