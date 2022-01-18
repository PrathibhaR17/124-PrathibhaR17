

class Calculation extends React.Component{
  constructor(props){
    super(props);
    this.a=parseInt("10");
    this.b=parseInt("10");
    this.state = {isOn : true};    
    this.Addition = this.Addition.bind(this);
    this.Subtraction = this.Subtraction.bind(this);
     this.Multiplication = this.Multiplication.bind(this);
     this.Division= this.Division.bind(this);

  }


  
  Addition(){
    let result = parseInt(this.a)+parseInt(this.b);
    alert (result);
  }
  Subtraction(){
    
    let result1 = parseInt(this.a)-parseInt(this.b);
    alert (result1);
  }
  Multiplication(){
    
    let result2 = parseInt(this.a)*parseInt(this.b);
    alert (result2);
  }
  Division(){
    
    let result3 = parseInt(this.a)/parseInt(this.b);
    alert (result3);
  }
  
  

  render(){
    const output = this.state.isOn;
    console.log(output);

  return <div>
     <button onClick={this.Addition}>Add</button>
     <h1>This is result {output.toString()}</h1>

  <button onClick={this.Subtraction}>Sub</button>
  <h1>Subtraction = {this.a-this.b}</h1> 
   <button onClick={this.Multiplication}>Mul</button> 
  <h1>Multiplication = {this.a*this.b}</h1>
   <button onClick={this.Division}>Div</button> 
  <h1>Division = {this.a/this.b}</h1> 
  </div>
}
}


ReactDOM.render(
    <Calculation />,
  document.getElementById('root')
);
