import React, { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  const increment = () => {
    setCount(count + 1);
    sayHello("Member1");
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = (message) => {
    alert(`Hello ${message}`);
  };

  const onClickWelcome = () => {
    sayHello("welcome");
  };

  const onSyntheticClick = () => {
    alert("I was clicked");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === "euro") {
      let converted = amount * 80;
      alert(`Converting to Euro Amount is ${converted}`);
    } else {
      alert("Unsupported currency!");
    }
  };

  return (
    <div style={{ margin: "20px" }}>
      <p>{count}</p>
      <button onClick={increment}>Increment</button> &nbsp;
      <button onClick={decrement}>Decrement</button> &nbsp;
      <button onClick={onClickWelcome}>Say welcome</button> &nbsp;
      <button onClick={onSyntheticClick}>Click on me</button>

      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>

      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            style={{ marginLeft: "10px" }}
          />
        </label>
        <br /><br />
        <label>
          Currency:
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
            style={{ marginLeft: "10px" }}
          />
        </label>
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
