// comment the following three lines if on firefox
const SpeechRecognition = webkitSpeechRecognition;
const SpeechGrammarList = webkitSpeechGrammarList;
const SpeechRecognitionEvent = webkitSpeechRecognitionEvent;

const recognition = new SpeechRecognition();
recognition.lang = 'en-IN';

recognition.onresult = (event) => {
  console.log(event.results);
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
