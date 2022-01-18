import React from 'react';
import {
    FaCalendar,
    FaMapMarkerAlt,
    FaCheckCircle,
  } from "react-icons/fa";
export default function Profile(props) {
    return (
        <header className="block row center">
            <div className='main'>
                <div className='section2'>
                    <h3>Arjun <i class="fas fa-check-circle blue"></i></h3>
                    <p>52 Tweets</p>
                    <img src='images/HD3.jpg' alt='cover photo' width="100%" height="300px" /> <br />
                    <img src='images/HD2.jpg' alt='cover photo' width="180px" height="180px" id="profilepic" />
                    <div className="create__btn followbtn">
                        <a href="" onClick={"<Post />"} >Follow</a>
                    </div>
                    <div className="posts_first_name">
                        <strong>Arjun<i class="fas fa-check-circle blue"></i></strong>
                    </div>
                    
                    <div className="posts_first_username">
                        @parth#3
                    </div>
                    <div>
                        <h5>A, D, P </h5>
                        <div className="posts_first_username">
                            <span>
                            <FaMapMarkerAlt className='m' />Bengaluru
                            &nbsp;
                                <FaCalendar className='m' /> Joined September 2009</span>
                        </div>
                    </div>
                    <div>
                        <h6><strong>65</strong>Following 
                        &nbsp;
                             <span><strong>17.08K</strong>Followers</span></h6>
                    </div>
                </div>
            </div>
        </header>
    );
}