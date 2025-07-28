import React from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const showBooks = true;
  const showCourses = true;

  return (
    <div style={{ display: "flex", justifyContent: "space-around" }}>
      {showBooks && <BookDetails />}

      {true ? <BlogDetails /> : null}

      {showCourses ? (
        <CourseDetails />
      ) : (
        <h4>No Courses Available</h4>
      )}
    </div>
  );
}

export default App;
