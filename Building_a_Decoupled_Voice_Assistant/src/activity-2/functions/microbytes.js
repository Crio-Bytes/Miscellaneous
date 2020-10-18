exports.handler = async (event, context) => {
  const bytes = [
    'dsa',
    'security'
    // TODO: add more microbytes here
  ];

  return {
    statusCode: 501, // TODO: return 200 instead
    body: JSON.stringify({
      data: false // TODO: return a random microbyte
    })
  };
};
