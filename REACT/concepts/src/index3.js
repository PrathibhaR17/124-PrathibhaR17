///grade
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
