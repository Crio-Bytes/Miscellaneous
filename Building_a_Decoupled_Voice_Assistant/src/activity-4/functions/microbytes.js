exports.handler = async (event, context) => {
  const bytes = [
    'dsa',
    'security',
    'system design'
  ];

  return {
    statusCode: 200,
    body: JSON.stringify({
      data: bytes[Math.floor(Math.random() * bytes.length)]
    })
  };
};
