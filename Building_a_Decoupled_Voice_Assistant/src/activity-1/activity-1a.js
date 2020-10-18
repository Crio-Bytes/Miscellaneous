// comment the following three lines if on firefox
const SpeechRecognition = webkitSpeechRecognition;
const SpeechGrammarList = webkitSpeechGrammarList;
const SpeechRecognitionEvent = webkitSpeechRecognitionEvent;

const recognition = new SpeechRecognition();
recognition.lang = 'en-IN';

recognition.onresult = (event) => {
  // TODO: log the results object in event to the console
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
