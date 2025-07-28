import React from 'react';

const courses = [
  { id: 1, name: "Angular", date: "4/5/2025" },
  { id: 2, name: "React", date: "6/3/2025" },
];

const CourseDetails = () => {
  return (
    <div style={{ borderLeft: '2px solid green', padding: '10px' }}>
      <h1>Course Details</h1>
      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;
