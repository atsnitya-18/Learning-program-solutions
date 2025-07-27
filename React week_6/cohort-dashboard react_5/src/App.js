import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    { name: 'React May Batch', trainer: 'Amit', status: 'ongoing' },
    { name: 'Java April Batch', trainer: 'Seema', status: 'completed' }
  ];

  return (
    <div>
      {cohorts.map((c, index) => (
        <CohortDetails key={index} cohort={c} />
      ))}
    </div>
  );
}

export default App;
