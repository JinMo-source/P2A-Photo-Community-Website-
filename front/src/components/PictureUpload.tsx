import React from "react";

function PictureUpload() {
  return (
    <form method="POST">
      <input type="text" placeholder="Title" name="title" required />
      <input
        type="text"
        placeholder="Description"
        name="description"
        required
      />
      <input type="file" placeholder="Picture" accept="image/*" required />
      <input type="text" placeholder="hashtags" name="hashtags" />
      <input type="submit" placeholder="submit" />
    </form>
  );
}
export default PictureUpload;
