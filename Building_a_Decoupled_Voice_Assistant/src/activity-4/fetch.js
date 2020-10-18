fetch('/.netlify/functions/colour')
  .then((r) => res.json())
  .then((d) => {
    // TODO: observe that you log a JSON
    // object. update the following statement
    // to log the actual colour
    console.log(d);
  });

