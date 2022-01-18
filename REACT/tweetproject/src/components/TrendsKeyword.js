import React from "react";

const TrendsKeyword = () => {
  const [state, setState] = React.useState([
    {
      id: 1,
      country: "Trend in India",
      keyword: " Vikrant Rona ",
      totalKeywords: "20M",
    },
    {
      id: 2,
      country: "Trend in India",
      keyword: "Badava Rascal",
      totalKeywords: "500k",
    },
    {
      id: 3,
      country: "Trend in India",
      keyword: "Radhe Shyam",
      totalKeywords: "200k",
    },
    {
      id: 4,
      country: "Trend in India",
      keyword: "#777Charlie #LifeOfCharlie #RakshitShetty",
      totalKeywords: "5M",
    },
    {
      id: 5,
      country: "Trend in India",
      keyword: "Gajanana And Gang - Official Trailer",
      totalKeywords: "20000",
    },
  ]);
  return (
    <div className="keywords">
      <div className="key">
        <div className="keyword__heading">
          <h4>Trends for you</h4>
        </div>
        {state.map((keyword) => (
          <div key={keyword.id}>
            <div className="country">{keyword.country}</div>
            <div className="keyword__name">
              <strong>{keyword.keyword}</strong>
            </div>
            <div className="keyword__tweets">{keyword.totalKeywords}</div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default TrendsKeyword;
