
import React from 'react';

const players = ['Jack', 'Michael', 'John', 'Ann', 'Elisabeth', 'Sachin', 'Dhoni', 'Virat', 'Jadeja', 'Raina'];
const t20Players = ['Virat', 'Rohit', 'Surya'];
const ranjiPlayers = ['Jadeja', 'Ashwin', 'Pujara'];

const PlayerOperations = () => {

  const oddPlayers = players.filter((_, index) => index % 2 !== 0);
  const evenPlayers = players.filter((_, index) => index % 2 === 0);

  
  const allPlayers = [...t20Players, ...ranjiPlayers];

  return (
    <div>
      {/* Odd Position Players */}
      <h2>List of Players in Odd Positions</h2>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={`odd-${index}`}>Mr. {player}</li>
        ))}
      </ul>

      {/* Even Position Players */}
      <h2>List of Players in Even Positions</h2>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={`even-${index}`}>Mr. {player}</li>
        ))}
      </ul>

      {/* Merged Array */}
      <h2>Merged List of T20 and Ranji Players</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={`merged-${index}`}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default PlayerOperations;
