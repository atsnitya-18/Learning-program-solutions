
import React from "react";
import "./App.css"; 

function OfficeList() {
  const officeSpaces = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
      image:
        "https://images.pexels.com/photos/37347/office-sitting-room-executive-sitting.jpg"
    },
    {
      name: "SmartWorks",
      rent: 65000,
      address: "Bangalore",
      image:
        "https://images.pexels.com/photos/3182759/pexels-photo-3182759.jpeg"
    },
    {
      name: "Innov8",
      rent: 40000,
      address: "Hyderabad",
      image:
        "https://images.pexels.com/photos/2451567/pexels-photo-2451567.jpeg"
    }
  ];

  return (
    <div>
      <h1>Office Space, at Affordable Range</h1>
      {officeSpaces.map((office, index) => {
        const rentColor = office.rent <= 60000 ? "textRed" : "textGreen";
        return (
          <div key={index} className="office-box">
            <img
              src={office.image}
              alt="Office Space"
              width="250"
              height="200"
            />
            <h2>Name: {office.name}</h2>
            <h3 className={rentColor}>Rent: Rs. {office.rent}</h3>
            <h3>Address: {office.address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default OfficeList;
