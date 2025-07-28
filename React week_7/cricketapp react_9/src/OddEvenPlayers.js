
import React from 'react';

const players = ['Jack', 'Michael', 'John', 'Ann', 'Elisabeth', 'Sachin', 'Dhoni', 'Virat', 'Jadeja', 'Raina'];

const OddEvenPlayers = () => {
  const oddPlayers = players.filter((_, index) => index % 2 !== 0);
  const evenPlayers = players.filter((_, index) => index % 2 === 0);

  return (
    <div>
      <h2>List of Players in Odd Position</h2>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>Mr. {player}</li>
        ))}
      </ul>

      <h2>List of Players in Even Position</h2>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
};

export default OddEvenPlayers;
