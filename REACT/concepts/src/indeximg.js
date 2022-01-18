
class MyProject extends React.Component{

    constructor(props){
      super(props);  
      this.state = {isOn : true};    
      this.myHandler = this.myHandler.bind(this);
    }
  
    myHandler(){
      this.setState( i => (
        {isOn: !i.isOn}
      ));
    }
  
    render(){
      const output = this.state.isOn;
      console.log(output);
      return (
        <div>
        {/* <h1>This is result {output}</h1> */}
        <h1>Click on image to toggle</h1>
        <button onClick={this.myHandler}>{this.state.isOn ? <img src="pic1.png" width="500px" height="500px"/>:<img src="pic2.jpg"  width="500px" height="500px"/>}</button>
        </div>
      );
    }
  }
  
  ReactDOM.render(  
    <MyProject/> ,
  document.getElementById('root')
  );