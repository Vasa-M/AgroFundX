import React from "react";
import { TextField } from "@mui/material";
import '../assets/css/FarmerLogin.css';
import back from "../assets/images/farmer.png";
function FarmerLogin() {
    return ( <>
   <div id="img"style={{backgroundColor:"green",backgroundImage: `url(${back})`}} data-overlay="5">
    <div>

    <div className="parent">
         <div className="sign">
            <center><div className="login"><h1 className="lo">Welcome Farmer 🌾</h1></div></center>

            <div id="log">
            <a id="a" href="/farmerlogin">FARMER</a> 
            <a id="a" href="/adminlogin">ADMIN</a> 
            </div>

            <div className="fo">
            <center>
            <TextField id="standard-basic" label="Email" variant="standard" />
            <br></br>
            <div className="pass">
            <TextField id="standard-basic" label="Password" variant="standard" />
            </div>
            <div className="but">
            <div className="but1">
            <button className="but2">Sign in</button>
            </div>
            <p>Don't Have an Account?</p>
            <a href="/farmersignup" id="link-button">Sign Up</a>
            </div>
            </center>
            </div>  
         </div>
    </div>
    </div>
   </div>
    </> );
}

export default FarmerLogin;