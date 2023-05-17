import React from "react";

function PhotoUpload() {
  return (
    <section>
      <form
        method="POST"
        name="photoUpload"
        action="http://localhost:8080/photo/upload"
      >
        <input type="text" placeholder="Title" name="title" required />
        <input
          type="text"
          placeholder="Description"
          name="description"
          required
        />
        <input type="file" placeholder="Photo" accept="image/*" required />
        <input type="text" placeholder="hashtags" name="hashtags" />
        <input type="submit" placeholder="submit" />
      </form>
    </section>
  );
}
export default PhotoUpload;
