import React from "react";

function PhotoUpload() {
  return (
    <section>
      <form
        method="POST"
        name="photoUpload"
        action="http://localhost:8080/photo/upload"
      >
        <input type="text" placeholder="Title" required />
        <input type="text" placeholder="description" required />
        <input type="text" placeholder="Photo" required />
        <input type="text" placeholder="hashtags" />
        <input type="submit" placeholder="submit" />
      </form>
    </section>
  );
}
export default PhotoUpload;
