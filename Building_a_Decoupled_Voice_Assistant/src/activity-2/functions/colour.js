exports.handler = async (event, context) => {
  const colours = [
    'red',
    'green',
    'blue',
    'white',
    'black',
    'magenta',
    'yellow'
  ];

  return {
    statusCode: 200,
    body: JSON.stringify({
      data: colours[Math.floor(Math.random() * colours.length)]
    })
  };
};
