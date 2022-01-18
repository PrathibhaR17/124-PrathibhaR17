import React from "react";
import {
  FaRegCheckCircle,
  FaComment,
  FaRegChartBar,
  FaHeart,
  FaLeaf,
} from "react-icons/fa";
const Posts = () => {
  return (
    <div className="postss">
      <div className="postss__first">
        <div className="posts_first_img">
          {/* <img src="/images/HD2.jpg" alt="profile img" />
        </div>
        <div className="posts_first_name"> */}
          <strong>Arjun</strong> <FaRegCheckCircle className="verify" />
        </div>
        <div className="posts_first_username">
          @parth#3 <span>6k</span>
        </div>
      </div>
      <div className="postss__details">
        <div className="postss_details_msg">
        Everything will be ok
        </div>
        <div className="postss_details_img">
          <img src="/images/HD1.jpg" alt="post"  width="500px" height="500px"/>
        </div>
        <div className="reactions">
          <span>
            <FaComment className="re" /> 55
          </span>
          <span>
            <FaRegChartBar className="re" /> 6
          </span>
          <span>
            <FaHeart className="re" /> 10K
          </span>
          <span>
            <FaLeaf className="re" /> 300
          </span>
        </div>
      </div>
    </div>
  );
};

export default Posts;