import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import  { useState } from 'react';
import { render } from '@testing-library/react';


function MySingUpWithHook(props) {

  const [inputField, setInputField] = useState({
    name: '',
    email: '',
    password:''
  })

  const inputsHandler = (e) => {
    setInputField({ [e.target.name]: e.target.value })
  }

  const submitButton = () => {
    // alert(inputField.email)
    alert("Successfull")
  }

  return (
    <div>
       <h2> Login Form</h2>
       <div class="col-md-6">
        <label for="inputEmail4" class="form-label">Name</label>
        <input name="name" type="text" class="form-control" id="inputEmail4" onChange={inputsHandler} value={inputField.name} />
      </div>
      <div class="col-md-6">
        <label for="inputEmail4" class="form-label">Email</label>
        <input name="email" type="email" class="form-control" id="inputEmail4" onChange={inputsHandler} value={inputField.email} />
      </div>
      <div class="col-md-6">
        <label for="inputPassword4" class="form-label">Password</label>
        <input name="name" type="password" class="form-control" id="inputPassword4" onChange={inputsHandler} value={inputField.password} />
      </div>
      <br/>
      <button onClick={submitButton}>Submit Now</button>
    </div>
  )
}

ReactDOM.render(
  <MySingUpWithHook />,
  document.getElementById('root')
);




// 2.Caluculator
// function MyCalculatorWithHook(props){

//   const[first,setFirst] = useState(props.a);
//   const[second,setSecond] = useState(props.b);
//   const[Add,setAdd] = useState(0);
//   const[Sub,setSub] = useState(0);
//   const[Mul,setMul] = useState(0);
//   const[Div,setDiv] = useState(0);

//   const handleAdd = () =>{
//     setAdd(parseInt(first)+parseInt(second));
    
//   }
//   const handleSub = () =>{
//     setSub(parseInt(first)-parseInt(second));
    
//   }
//   const handleMul = () =>{
//     setMul(parseInt(first)*parseInt(second));
    
//   }
//   const handleDiv = () =>{
//     setDiv(parseInt(first)/parseInt(second));
    
//   }

//   return(
//     <div>
//       <h2>Enter values: </h2>
//       <input type="text" value={first} onChange={e => setFirst(+e.target.value)}  /> <br/> <br/>
//       <input type="text"  value={second}  onChange={e => setSecond(+e.target.value)}  />
//       <p>Addition of {first} and {second} is {Add}</p>
//       <button onClick={handleAdd}>Add</button>
//       <p>Subtraction of {first} and {second} is {Sub}</p>
//       <button onClick={handleSub}>sub</button>
//       <p>Multiplication of {first} and {second} is {Mul}</p>
//       <button onClick={handleMul}>Mul</button>
//       <p>Division of {first} and {second} is {Div}</p>
//       <button onClick={handleDiv}>Div</button>
//     </div>
//   );

// }

// ReactDOM.render(  
//   <MyCalculatorWithHook  /> ,
// document.getElementById('root')
// );















// class SignupForm extends React.Component{
//   constructor(props){
//     super(props);
//     this.state = {fname:'',lname:'',emailid:'',password:'',contactno:''};
//     this.handleChange = this.handleChange.bind(this);
//     this.handleSubmit = this.handleSubmit.bind(this);
//   }

//   handleChange(event){
//     //this.setState({value: event.target.value});
//     const target = event.target;
//     const value = target.name === "pass" ? target.text: target.value;
//     const name = target.name;

//     console.log(name +" "+ value);
//     this.setState({[name]:value});
//   }

//   handleSubmit(event){
//     alert('submit? '+"Name"+" "+this.state.fname+"   "+this.state.lname+"   "+"Email "+ this.state.emailid +"   "+"Password"+this.state.password+"   "+"Contactno"+this.state.contactno);
//     event.preventDefault();
//   }


//   render(){
//     return(
//       // <form onSubmit={this.handleSubmit}>
//       //   <h1>   SignupForm  </h1>
        
//       //   <label>
//       //    First Name: 
//       //     <input name="fname" type="text" value={this.state.fname} onChange={this.handleChange}/>
//       //   </label><br></br>
//       //   <label>
//       //     Last Name: 
//       //     <input name="lname" type="text" value={this.state.lname} onChange={this.handleChange}/>
//       //   </label><br></br>
//       //   <label>
//       //     Email ID:
//       //     <input name="emailid" type="text" value={this.state.emailid} onChange={this.handleChange}/>
//       //   </label><br></br>
//       //   <label>
//       //     Password:
//       //     <input name="password" type="number" value={this.state.password} onChange={this.handleChange}/>
//       //   </label><br></br>
//       //   <label>
//       //     Contactno:
//       //     <input name="contactno" type="value" value={this.state.contactno} onChange={this.handleChange}/>
//       //   </label><br></br>
//       //   <input type="submit" value="Submit" />
//       // </form>
//     );
//   }
// }


// function MyBorder(props){
//   return(
//     <div   className={'MyBorder MyBorder-'+ props.color}>
//       {props.children}
//     </div>
//   );
// }

// function MyDialogBox(){
//   return(
//     <div>
//       <MyBorder color="thistle">
//         <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
//         <p className='MyDialog-message'>This is content from First Dialog Box.</p>
//       </MyBorder>
//       <MyBorder color="burlywood">
//         <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
//         <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
//         <p className='MyDialog-message'>This is content from First Dialog Box.</p>
//       </MyBorder>
//       <MyBorder color="teal">
//         <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
//         <p className='MyDialog-message'>This is content from First Dialog Box.</p>
//       </MyBorder>
//     </div>
//   );
// }


// ReactDOM.render(  
//   <MyDialogBox /> ,
// document.getElementById('root')
// );









// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
