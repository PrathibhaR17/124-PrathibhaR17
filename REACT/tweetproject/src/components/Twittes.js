import React from "react";
import CreateTweet from "./CreateTweet";
import Posts from "./Posts";
import Profile from "./Profile";

const Twittes = () => {
  return (
    <div className="posts">
      {/* <div className="posts__home">Home</div> */}
      <Profile />
      <CreateTweet />
      <Posts />
      {/* <Posts />
      <Posts /> */}
    </div>
  );
};

export default Twittes;