import React from "react";
import { NavLink, Routes, Route } from "react-router-dom";
import Home from "components/Home";
import NotFound from "components/NotFound";
import PhotoUpload from "components/PhotoUpload";

function Navigation() {
  return (
    <header>
      <NavLink to="/">Home</NavLink>
      <NavLink to="/upload">upload</NavLink>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/upload" element={<PhotoUpload />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </header>
  );
}

export default Navigation;
