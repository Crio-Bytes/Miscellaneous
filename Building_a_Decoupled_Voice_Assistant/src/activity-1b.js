// comment the following three lines if on firefox
const SpeechRecognition = webkitSpeechRecognition;
const SpeechGrammarList = webkitSpeechGrammarList;
const SpeechRecognitionEvent = webkitSpeechRecognitionEvent;

const recognition = new SpeechRecognition();
recognition.lang = 'en-IN';

recognition.onresult = (event) => {
  let result = event.results[0][0].transcript;
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
