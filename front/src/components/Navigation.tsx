import React from "react";
import { NavLink, Routes, Route } from "react-router-dom";
import Home from "routes/Home";
import NotFound from "routes/NotFound";
import PictureUpload from "components/PictureUpload";

function Navigation() {
  return (
    <header>
      <NavLink to="/">Home</NavLink>
      <NavLink to="/upload">upload</NavLink>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/upload" element={<PictureUpload />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </header>
  );
}

export default Navigation;
