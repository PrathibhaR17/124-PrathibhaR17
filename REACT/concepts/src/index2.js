// calculator with Button and state

class Calculator extends React.Component{
    constructor(props){
      super(props);
      this.state={ a: '10', b: '5', result: '' };
      this.AddHandler = this.AddHandler.bind(this);
      this.SubHandler = this.SubHandler.bind(this);
      this.MultiHandler = this.MultiHandler.bind(this);
      this.DivHandler = this.DivHandler.bind(this);
    }
  AddHandler(){
    this.setState({ result: parseInt(this.state.a) + parseInt(this.state.b) })
  }
  SubHandler(){
    this.setState({ result: parseInt(this.state.a) - parseInt(this.state.b) })
  }
  MultiHandler(){
    this.setState({ result: parseInt(this.state.a) * parseInt(this.state.b) })
  }
  DivHandler(){
    this.setState({ result: parseInt(this.state.a) / parseInt(this.state.b) })
  }
  render() {
    return(
      <div>
        <h1>Calculation of 2 numbers is : {this.state.result}</h1>

        <button onClick={()=>{this.AddHandler()}} >Addition</button>
        <br/><br/>

        <button onClick={()=>{this.SubHandler()}} >Substraction</button>
        <br/><br/>
        
        <button onClick={()=>{this.MultiHandler()}} >Multiplication</button>
        <br/><br/>
        
        <button onClick={()=>{this.DivHandler()}} >Division</button>
        <br/><br/>
      </div>
    );
  }
}
ReactDOM.render
(  
    <Calculator/> ,
  document.getElementById('root')
);