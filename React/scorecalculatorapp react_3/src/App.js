import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore 
        name="Nitya"
        school="Palakol High School"
        total={430}
        goal={5}
      />
    </div>
  );
}

export default App;
