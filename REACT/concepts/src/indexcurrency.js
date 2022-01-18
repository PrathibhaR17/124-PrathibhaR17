
class CurrencyCalculator extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {
     value:"",
      v : "",
      result:""
    };
    this.rupeeHandler = this.rupeeHandler.bind(this);
    this.yenHandler = this. yenHandler.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
   
  }
  handleChange(event){
    this.setState({value: event.target.value})
   
  }
  rupeeHandler(event)
  {
    this.setState(
      {v: "Rupees"}
    );
    this.setState(
      {result: this.state.value*74.52}
     );
    

  }
  yenHandler(event)
  {
    this.setState(
      {v: " Yen"}
    );
    this.setState(
      {result: this.state.value*115.81}
     );
    
    
  }
  handleSubmit(event){
    alert(this.state.value+"D"+ this.state.result+ this.state.v);
    event.preventDefault();
   
  }

  render()
  {const val=this.state.value;
    return(    <fieldset> <legend>Enter the amount :</legend>
      <form onSubmit={this.handleSubmit}>
        <lable>   
        <input type="text" value={val} onChange={this.handleChange} /> <br></br> <br></br>
        </lable><button onClick={this.rupeeHandler}>Rupees</button>
    <button onClick={this.yenHandler}>Yen</button>
     </form></fieldset> 
    );
  }
}


ReactDOM.render(
  <CurrencyCalculator />,
  document.getElementById("root")
);