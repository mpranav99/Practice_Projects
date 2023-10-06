import React from 'react';
import formCss from './form.css'
import Counter from './components/classState';
import Form from './components/form';
import Count from './components/hookCounter';
import Hello from './hello'
import MyComponent from './Welcome'
import Parent from './components/ParentComponent';
import MyForm from './form';
import Header from './header'
import Home from './home'
import About from './about'
import { BrowserRouter, Routes, Route, Link} from 'react-router-dom'; 

function App() {
  return (
    
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Header />}>
            <Route path="home/:name" element={<Home />}/>
            <Route path="about" element={<About />}/>
            {/* <Route path="contact" element={<ContactUs />}/> */}
         </Route>
               
                {/* <Route path = "/contact" element = {<ContactUs/>} /> */}
        </Routes>
    </BrowserRouter> 
      {/* <MyComponent name='Pranav'/> */}
      {/* <Counter/> */}
      {/* <Count></Count> */}
      {/* <MyForm></MyForm> */}
      {/* <Parent></Parent> */}
    </div>
  );
}

export default App;
