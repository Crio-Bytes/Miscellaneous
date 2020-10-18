const textLbl = document.querySelector('.text-lbl');
const speakBtn = document.querySelector('#speak-btn');

const SpeechRecognition = webkitSpeechRecognition || SpeechRecognition;
const SpeechGrammarList = webkitSpeechGrammarList || SpeechGrammarList;
const SpeechRecognitionEvent = webkitSpeechRecognitionEvent || SpeechRecognitionEvent;

const recognition = new SpeechRecognition();
recognition.lang = 'en-IN';

const SpeechSynthesis = window.speechSynthesis;

const handleInvalidTrigger = () => {
  // TODO: Toggle the 'danger' class on speakBtn

  // TODO: Set the textContent property for textLbl to 'invalid phrase'

  SpeechSynthesis.speak(
    new SpeechSynthesisUtterance('invalid phrase')
  );

  setTimeout(() => {
    speakBtn.disabled = false;
    speakBtn.classList.toggle('danger');
    textLbl.textContent = `press tap to speak`;
  }, 3000);
};

const resetButton = () => {
  setTimeout(() => {
    speakBtn.disabled = false;
    textLbl.textContent = `press tap to speak`;
  }, 3000);
};

recognition.onstart = () => {
  speakBtn.disabled = true;
  textLbl.textContent = `listening`;
  speakBtn.classList.toggle('listening');
};

recognition.onresult = (event) => {
  let result = event.results[0][0].transcript;
  // TODO: change the condition of the if statement
  // so that the block is execute only when the result
  // includes 'colour' or 'food'
  if (true) {
    if (result.includes('colour')) {
      textLbl.textContent = `i can not get a colour`;
      SpeechSynthesis.speak(
        new SpeechSynthesisUtterance(`i can not get a colour`)
      );
      resetButton();
    } else {
      // TODO: Inform the user that the assistant cannot cook
      // a food item. Make sure you set the textContent for the
      // textLbl and speak the phrase using SpeechSynthesis
      resetButton();
    }
  } else {
    handleInvalidTrigger();
  };
};

recognition.onnomatch = handleInvalidTrigger;

recognition.onerror = () => {
  speakBtn.classList.toggle('listening');
  speakBtn.classList.toggle('danger');
  textLbl.textContent = `i could not hear you`;
  setTimeout(() => {
    speakBtn.disabled = false;
    speakBtn.classList.toggle('danger');
    textLbl.textContent = `press tap to speak`;
  }, 3000);
};

recognition.onspeechend = () => {
  speakBtn.classList.toggle('listening');
  recognition.stop();
};

speakBtn.addEventListener('click', () => {
  recognition.start();
});
