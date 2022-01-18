import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

// ReactDOM.render(
//   <React.StrictMode>
//     <App />
//   </React.StrictMode>,
//   document.getElementById('root')
// );

class SignupForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = { fname: '', lname: '', mail: '', pwd: '', Dob: '' , city: '', isPass: true, phoneno: ''};
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    //this.setState({value: event.target.value});
    const target = event.target;
    const value = target.name === "isPass" ? target.checked : target.value;
    const name = target.name;

    console.log(name + " " + value);
    this.setState({ [name]: value });
  }

  handleSubmit(event) {
    alert('Are you sure you want to submit ? ' + this.state.fname + " " + this.state.lname + " " + this.state.Dob);
    event.preventDefault();
  }


  render() {
    return (
    

      <div>
        <h1>Sign Up</h1> <br />
        <form class="row g-3" onSubmit={this.handleSubmit}>
          <div class="row">
            <div class="col">
            <label for="inputEmail4" class="form-label">First Name</label>
              <input name="fname" type="text" class="form-control" placeholder="First name" aria-label="First name"value={this.state.stname} onChange={this.handleChange} />
            </div>
            <div class="col">
            <label for="inputEmail4" class="form-label">Last Name</label>
              <input name="lname" type="text" class="form-control" placeholder="Last name" aria-label="Last name" value={this.state.lname} onChange={this.handleChange} />
            </div>
            </div>
          <div class="col-md-6">
            <label for="inputEmail4" class="form-label">Email</label>
            <input name="mail" type="email" class="form-control" id="inputEmail4" value={this.state.stemail} onChange={this.handleChange}/>
          </div>
          <div class="col-md-6">
            <label for="inputPassword4" class="form-label">Password</label>
            <input name="pwd" type="password" class="form-control" id="inputPassword4" value={this.state.pwd} onChange={this.handleChange} />
          </div>
          <div class="col-md-6">
            <label for="inputDob" class="form-label">DOB</label>
            <input name="Dob" type="Date" class="form-control" id="input" value={this.state.Dob} onChange={this.handleChange} />
          </div>
          <div class="col-md-6">
            <label for="inputCity" class="form-label">City</label>
            <input name="city" type="text" class="form-control" id="inputCity" value={this.state.city} onChange={this.handleChange} />
          </div>
         
          <div class="col-md-2">
            <label for="inputNum" class="form-label">Phone No</label>
            <input name="phoneno" type="number" class="form-control" id="inputZip" value={this.state.noOfAttempts} onChange={this.handleChange} />
          </div>
          <div class="col-12">
            <div class="form-check">
              <input name="isPass" class="form-check-input" type="checkbox" id="gridCheck" checked={this.state.isPass} onChange={this.handleChange} />
              <label class="form-check-label" for="gridCheck">
                Check me out
              </label>
            </div>
          </div>
          <div class="col-12">
            <button type="submit" class="btn btn-primary">Sign in</button>
          </div>
        </form>
      </div>
    );
  }
}



ReactDOM.render(  
  <SignupForm /> ,
document.getElementById('root')
);



















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
