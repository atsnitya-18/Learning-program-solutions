import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  loadPosts = () => {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        const postObjects = data.map(
          (post) => new Post(post.id, post.title, post.body)
        );
        this.setState({ posts: postObjects });
      })
      .catch((error) => {
        console.error("Error fetching posts:", error);
        this.setState({ hasError: true });
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred while rendering posts.");
    console.error("Error details:", error, info);
    this.setState({ hasError: true });
  }

  render() {
    const { posts, hasError } = this.state;

    if (hasError) {
      return <h2>Something went wrong while displaying posts.</h2>;
    }

    return (
      <div>
        <h1>Posts</h1>
        {posts.map((post) => (
          <div key={post.id} style={{ marginBottom: "20px" }}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;