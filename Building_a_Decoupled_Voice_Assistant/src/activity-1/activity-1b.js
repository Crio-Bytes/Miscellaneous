// comment the following three lines if on firefox
const SpeechRecognition = webkitSpeechRecognition;
const SpeechGrammarList = webkitSpeechGrammarList;
const SpeechRecognitionEvent = webkitSpeechRecognitionEvent;

const recognition = new SpeechRecognition();
recognition.lang = 'en-IN';

recognition.onresult = (event) => {
  let result;
  // TODO: assign the first phrase heard to result
  // and make sure that the correct statement is printed
  // Hint: observe the structure of event.results
  console.log('HEARD: ' + result);
  if (result.includes('colour'))
    console.log('ACTION: looking for a colour');
  else if (result.includes('book'))
    console.log('ACTION: looking for a book');
  else
    console.log('ACTION: can not do anything about it');
};

recognition.onspeechend = () => {
  recognition.stop();
};

const listen = () => {
  recognition.start();
};

document
  .getElementById('listenBtn')
  .addEventListener(
    'click',
    listen
  );
