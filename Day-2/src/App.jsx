import {BrowserRouter as Router,Route,Routes} from "react-router-dom";
import Home from "./pages/Home";
import About from "./pages/About";
import FarmerLogin from "./components/FarmerLogin";
import FarmerSignUp from "./components/FarmerSignUp";
import AdminLogin from "./components/AdminLogin";
import Profile from "./components/Profile";
import FarmerHome from "./pages/FarmerHome";
import AdminHome from "./pages/AdminHome";
import ContactUs from "./pages/ContactUs";
import Footer from "./components/Footer";
import SideNav from "./components/SideNav";
import ApplyLoan_page1 from "./components/ApplyLoan_page1";
import ApplyLoan_page2 from "./components/ApplyLoan_page2";
import AppliedLoans from "./components/AppliedLoans";
import LoanDetails from "./components/LoanDetails";
import Chart from "./components/Dashboard";
import TrackLoan from "./components/TrackLoan";
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
        <Route path="/contact" element={<ContactUs/>}/>
        <Route path="/footer" element={<Footer/>}/>
        <Route path="/sidenav" element={<SideNav/>}/>
        <Route path="/applyloan1" element={<ApplyLoan_page1/>}/>
        <Route path="/applyloan2" element={<ApplyLoan_page2/>}/>
        <Route path="/appliedloans" element={<AppliedLoans/>}/> 
        <Route path="/loandetails" element={<LoanDetails/>}/>
        <Route path="/chart" element={<Chart/>}/>
        <Route path="/trackloan" element={<TrackLoan/>}/>
      </Routes>
    </Router>
   );
}

export default App;