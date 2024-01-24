import {BrowserRouter as Router,Route,Routes} from "react-router-dom";
import Home from "./pages/Home";
import About from "./pages/About";
import Navbar from "./components/Navbar";
import FarmerLogin from "./components/FarmerLogin";
import FarmerSignUp from "./components/FarmerSignUp";
import AdminLogin from "./components/AdminLogin";
import Profile from "./components/Profile";
import FarmerHome from "./pages/FarmerHome";
import AdminHome from "./pages/AdminHome";
function App() {
  return ( 
    <Router>
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/about" element={<About/>}/>
        <Route path="/farmerlogin" element={<FarmerLogin/>}/>
        <Route path="/farmersignup" element={<FarmerSignUp/>}/>
        <Route path="/adminlogin" element={<AdminLogin/>}/>
        <Route path="/profile" element={<Profile/>}/>
        <Route path="/farmerhome" element={<FarmerHome/>}/>
        <Route path="/adminhome" element={<AdminHome/>}/>
      </Routes>
    </Router>
   );
}

export default App;