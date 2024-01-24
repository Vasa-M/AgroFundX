import React, { useState, useRef } from 'react';
import back from "../assets/images/paddy.jpeg";
import '../assets/css/Navbar.css';
import { AppBar } from '@mui/material';
import ButtonAppBar from '../components/Navbar';

function Home() {
  
  const boxStyle = {
    display: 'flex',
    justifyContent: 'space-between',
    margin: '30px',
  };

  return (
    <div>
    <ButtonAppBar/>
    <div id="img" style={{ backgroundColor: "green", backgroundImage: `url(${back})` }} data-overlay="5">
      <div id="box" style={boxStyle}>
        <div className="box1">
          <div className="home">
            <h1 id="heading">WHO WE ARE</h1>
            <marquee
              direction="up"
              height="250px" scrollamount="3" id="heading">
              AGROFUNDX is India`s apex development bank, established in 1982 under an Act 
              of Parliament to promote sustainable and equitable agriculture and rural 
              development. In its journey of more than four decades, the premier development 
              financial institution has transformed lives in Indian villages through agri-finance, 
              infrastructure development, banking technology, promotion of microfinance and 
              rural entrepreneurship through SHGs & JLGs and more. It continues to aid in nation
              building through participative financial and non-financial interventions, 
              innovations, technology and institutional development in rural areas.
              <br></br><br></br>
              The knowledge of our asset managers and economists will satisfy even 
              the most demanding customer. Experienced specialists and partners with an impeccable 
              reputation help our clients achieve their goals, implement large infrastructure, 
              industrial and energy projects virtually anywhere in the world.
            </marquee>
          </div>
        </div>
        <div className="box2">
          <div className="home">
            <h1 id="heading">Vision</h1>
            <marquee
              direction="up"
              height="80px" scrollamount="3" id="heading">
              <br></br><br></br>
              Promoting Agri-Business by encouraging institutional and private sector 
              investments and linkages to ensure the empowerment of all farmers in the country.
            </marquee>
            <h1 id="heading">Mission</h1>
            <marquee
              direction="up"
              height="50px" scrollamount="3" id="heading">
              <br></br><br></br>
              To link small farmers to technology as well as to the markets in 
              association with private, corporate or cooperative sector and if necessary, by providing backward and forward linkages.
            </marquee>
          </div>
        </div>
      </div>
    </div>
    </div>
  );
}

export default Home;
