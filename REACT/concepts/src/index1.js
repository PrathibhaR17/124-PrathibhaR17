import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);





// function Addition(props){
//   let result = parseInt(props.a) + parseInt(props.b);
//   return <h1>Addition of {props.a} and {props.b} is {result}</h1>
// }

// ReactDOM.render(  
//     <Addition a="10" b="20"/> ,
//   document.getElementById('root')
// );






// function Calculation(props)
// {
//   let result =parseInt(props.a)+parseInt(props.b);
//   let result1 =parseInt(props.a)-parseInt(props.b);
//   let result2 =parseInt(props.a)*parseInt(props.b);
//   let result3 =parseInt(props.a)/parseInt(props.b);
//   return <h1>Calculation of {props.a} and {props.b}  add = {result} sub ={result1} mul = {result2} div = {result3}</h1>
// }

// ReactDOM.render(
//   <React.StrictMode>
//     <Calculation a="10" b="20" />
//   </React.StrictMode>,
//   document.getElementById('root')
// );

// function Grading(props){
//   let Mathematics = parseInt(props.a);
//   let Science = parseInt(props.b);
//   let Kannada = parseInt(props.c);
//   return <h2> Grading,Marks obtained in Maths is {Mathematics} <br></br> Marks obtained in Science is {Science} <br></br> Marks obtained in Kannada is {Kannada}</h2>
// }

// ReactDOM.render(
//   <Grading a="90" b="86" c="98"/>,
//   document.getElementById('root')
// );



function Calc(props){
  let p=parseInt(props.a);
  let q=parseInt(props.b);
  let r=parseInt(props.c);
  let result = (p + q + r)/3;
  if (result>90){
  return <h1> marks scored {props.a}, {props.b} and  {props.c} - A grade </h1>
} else if (result>80){
  return <h1> marks scored {props.a}, {props.b} and  {props.c} - B grade </h1>
} else if (result>70){
  return <h1> marks scored {props.a}, {props.b} and  {props.c} - c grade </h1>
} else{ 
  return <h1> marks scored {props.a}, {props.b} and  {props.c} - Fail </h1> }
}
ReactDOM.render(<Calc a="98" b="90" c="90"/>  , document.getElementById('root'));


////////


class Calculation extends React.Component{
  constructor(props){
    super(props);
    this.a=parseInt("10");
    this.b=parseInt("10");
  }
  render(){
{
  return <div>
  <h1>Addition = {this.a+this.b}</h1> 
  <h1>Subtraction = {this.a-this.b}</h1> 
  <h1>Multiplication = {this.a*this.b}</h1> 
  <h1>Division = {this.a/this.b}</h1> 
  </div>
}
}
}

ReactDOM.render(
    <Calculation />,
  document.getElementById('root')
);



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
