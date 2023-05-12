import logo from "./logo.svg";
import "./App.css";
<html>
  <link rel="stylesheet" href="https://unpkg.com/mvp.css" />
</html>;

function App() {
  return (
    <div className="App">
      <form>
        <input type="text" placeholder="Title"></input>
        <input type="text" placeholder="Descri"></input>
        <input type="text" placeholder="Photo"></input>
        <input type="text" placeholder="hashtags"></input>
        <input type="submit" placeholder="submit"></input>
      </form>
    </div>
  );
}

export default App;
