import React from 'react';
import { Link, Outlet} from 'react-router-dom';
import { useParams } from "react-router-dom";

function MyHome() {
    let params = useParams();
    return (
        <div >
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">React-Team</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href='#'>Home </a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/profile">Profile </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>                    
                    
                    </ul>
                    <nav class="navbar navbar-light " style={{marginLeft:"800px"}}>
                        <span class="navbar-text">
                           Signed in as: {params.name}
                        </span>
                    </nav>
    
                </div>
            </nav>
    
        </div>
      
    )

    }
export default MyHome