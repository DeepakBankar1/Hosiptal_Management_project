import React, { Component ,useState,render} from 'react';
import { useNavigate } from 'react-router-dom';
import './Landing.css';
//import { NavLink } from 'react-router-dom';
import Carousel from 'react-bootstrap/Carousel';
//import React, { useState } from 'react';

const Landing = () =>{
    const navigate = useNavigate();



    return (
        <div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container-fluid">
          <a class="navbar-brand" href="Landing.js">Meditrina Hospital</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="Admin.js">Admin</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="Loginform1.js">Login</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="Registerition.js">Sign up</a>
              </li>
              {/*<li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"/></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
    </li>*/}
            </ul>
          </div>
        </div>
      </nav>
      
      </div>

       
    );
}



{/*function Scroll() {
  const [index, setIndex] = useState(0);

  const handleSelect = (selectedIndex, e) => {
    setIndex(selectedIndex);
  };

  return (
    <Carousel activeIndex={index} onSelect={handleSelect}>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="pat.jpg"
          alt="First slide"
        />
        <Carousel.Caption>
          <h3>First slide label</h3>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="holder.js/800x400?text=Second slide&bg=282c34"
          alt="Second slide"
        />

        <Carousel.Caption>
          <h3>Second slide label</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="holder.js/800x400?text=Third slide&bg=20232a"
          alt="Third slide"
        />

        <Carousel.Caption>
          <h3>Third slide label</h3>
          <p>
            Praesent commodo cursus magna, vel scelerisque nisl consectetur.
          </p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
}

render(<Scroll/>);*/}


export default Landing;