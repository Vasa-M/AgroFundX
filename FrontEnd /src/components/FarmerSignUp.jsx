import React from "react";
import { TextField } from "@mui/material";
import '../assets/css/FarmerLogin.css';
import back from "../assets/images/farmer.png";
import ButtonAppBar from "./Navbar";
function FarmerSignUp() {
    return ( 
        <>
        <div>
        <ButtonAppBar/>
   <div id="img"style={{backgroundColor:"green",backgroundImage: `url(${back})`}} data-overlay="5">
    <div>
    <div className="parent">
         <div className="sign">
            <center><div className="login"><h1 className="lo">Welcome Farmer 🌾</h1></div></center>
            <div className="fo">
                <center>
            <TextField id="standard-basic" label="Name" variant="standard" />
            <br></br>
            <br></br>
            <TextField id="standard-basic" label="Email" variant="standard" />
            <br></br>
            <br></br>
            <TextField id="standard-basic" label="Phone" variant="standard" />
            <br></br>
            <br></br>
            <TextField id="standard-basic" label="Password" variant="standard" />
            <div className="but">
            <div className="but1">
            <button className="but2">Sign Up</button>
            </div>
            <p>Already Have an Account?</p>
            <a href="/farmerlogin" id="link-button">Sign In</a>
            </div>
            </center>
            </div>  
         </div>
    </div>
    </div>
    </div>
    </div>
    </>
     );
}

export default FarmerSignUp;