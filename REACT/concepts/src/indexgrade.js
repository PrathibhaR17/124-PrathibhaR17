class Grade extends React.Component
{
  constructor()
  {
    super();
    this.handler = this.handler.bind(this);
    this.state={
      x:"",
      y:"",
      z:"",
      grade:"",
    }
  }
  handler()
  {
    var grade;
    var x= document.getElementById("x").value;
    var y=document.getElementById("y").value;
    var z=document.getElementById("z").value;
    x=parseInt(x);
    y=parseInt(y);
    z=parseInt(z);
    var result=((x+y+z)/3);
   if(result>=90 && result<=100)
   {
     grade="A";
   }else if(result>=80 && result<90)
   {
     grade = "B";
   }else if(result>=60 && result<80)
   {
     grade="C"
   }else{
     grade="Fail"
   }
   this.setState(({
      x:x,
      y:y,
    
      grade:grade,
   }));
   console.log(grade);
   console.log(result);
  }  

  render()
  {
    return(
    <>
   <table>
     <tr>
   
   </tr>
   <tr> <input  id="x" type="text" defaultValue={this.state.x}/></tr>
   <tr> <input  id="y" type="text" defaultValue={this.state.y}/></tr>
   <tr> <input  id="z" type="text" defaultValue={this.state.z}/></tr>
   </table>
   <button id="calculate" onClick={this.handler}>grade</button>
   <h1>grd= {this.state.grade} </h1>
    </>
    );
  }
}

ReactDOM.render(
  <Grade />,
  document.getElementById("root")
)



