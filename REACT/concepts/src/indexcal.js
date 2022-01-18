/////////CALCULATOR
class Calculator extends React.Component
{
  constructor()
  {
    super();
    this.handlerCal = this.handlerCal.bind(this);
    
    this.state={
      x:"",
      y:"",
      calcu:"",
      answer:"",
    }
  }
  handlerCal(calcu)
  {
    var answer;
    var x= document.getElementById("x").value;
    var y=document.getElementById("y").value;
    x=parseInt(x);
    y=parseInt(y);
    switch(calcu)
    {
      case "+":answer=x+y;
              break;
      case "-":answer=x-y;
              break;
      case "*":answer=x*y;
                break;
      case "/":answer=x/y;
                break;
    }
   this.setState(({
      x:x,
      y:y,
      answer:answer,
      calcu:calcu
   }));
  }  

  render()
  {
    return(
    <>
    <h1> Enter values</h1>
   <table>
     <h4>Value1</h4>
   <tr> <input  id="x" type="text" defaultValue={this.state.x}/></tr>
   <h4>Value2</h4>
   <tr> <input  id="y" type="text" defaultValue={this.state.y}/></tr>
   <tr><button id="inr" onClick={()=>this.handlerCal("+")} >add(+)</button></tr>
   <button id="inr" onClick={()=>this.handlerCal("-")} >sub(-)</button>
  <tr> <button id="inr" onClick={()=>this.handlerCal("*")} >mul(*)</button></tr>
   <button id="inr" onClick={()=>this.handlerCal("/")} >div(/)</button>
     <tr>
   <h1>{this.state.x} {this.state.calcu} {this.state.y} output= {this.state.answer} </h1>
   </tr>
   
   
   </table>
  
</>
    )
  }
}

ReactDOM.render(  
 < Calculator/>,
  
document.getElementById('root')
);

