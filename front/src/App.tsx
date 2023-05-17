import PhotoUpload from "./components/PhotoUpload";
import Navigation from "./components/Navigation";
import { BrowserRouter } from "react-router-dom";
import React from "react";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navigation />
      </BrowserRouter>
    </div>
  );
}

export default App;
