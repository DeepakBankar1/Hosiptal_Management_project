import './App.css';
import React from "react";
import { Route, Routes } from "react-router";
import Login from "./Component/Loginform1";
import Admin from "./Component/Admin";
import Register from './Component/Registerition';
//import MainMenu from "./Component/MainMenu";
import Landing from "./Component/Landing";
import 'react-toastify/dist/ReactToastify.css';
import DoctorRegister from './Component/DoctorRegister';
import StaffRegister from './Component/StaffRegister';
import DoctorHome from './HomePage/DoctorHome';
import StaffHome from './HomePage/StaffHome';
import ViewDoctor from './Component/ViewDoctor';
import ViewStaff from './Component/ViewStaff';
import ViewPatient from './Component/ViewPatient';
import PatientHome from './HomePage/PatientHome';
import Bedsavailbility from './Component/AdmitPatient';
import ViewBeds from './Component/ViewBeds';
import BedBooked from './Component/BedBooked';
import SearchDoctor from './Component/SearchDoctor';
import UpdateDoctor from './UpdateDoctor';
function App() {
  return (
    <div className="App">
     {/*<h1><span className='text-danger'><b>+</b></span><span className="text-info">Meditrina</span></h1><h3 className="text-success">Hospital</h3>*/}
  
     <nav>


     </nav>
     <Routes>
     {/*<Route  path="*" element={<MainMenu/>} exact/>*/}
     <Route path="*" element={<Landing/>} exact></Route>
     <Route path="/login" element={<Login/>}/>
     <Route path="/Admin" element={<Admin/>}/>
     <Route path="/patientregister" element={<Register/>}/>
     <Route path="/Doctorregister" element={<DoctorRegister/>}/>
     <Route path="/StaffRegister" element={<StaffRegister/>}/>
     <Route path ="/doctorhome" element={<DoctorHome/>}/>
     <Route path="/staffhome" element={<StaffHome/>} />
     <Route path="/viewdoctor" element={<ViewDoctor/>}/>
     <Route path="/viewstaff" element={<ViewStaff/>}/>
     <Route path="/viewpatient" element={<ViewPatient/>}/>
     <Route path="/patienthome" element={<PatientHome/>}/>
     <Route path="/bedsavailbility" element={<Bedsavailbility/>}/>
     <Route path="/viewbeds" element={<ViewBeds/>}/>
     <Route path="/BedBooked" element={<BedBooked/>}/>
     <Route path='/SearchDoctor' element={<SearchDoctor/>}/>
     <Route path='/UpdateDoctor' element={<UpdateDoctor/>}/>
     </Routes>
    
    
      </div>
  );
}
export default App;
