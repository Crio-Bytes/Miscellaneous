# Introduction

We are all familiar with Google Assistant, Amazon Alexa, Cortana and Siri and most of us are amazed how they are able to reply to us with a piece of information or perform some action based on what we speak to them. How about building one yourself?

![voice assistant](https://www.witlingo.com/wp-content/uploads/2019/04/logo_platforms_640_300.png)

In this micro-byte we will be building a voice assistant within a browser and build a 'skill' or an 'action' for the assistant using a serverless cloud function. This kind of decoupling provides a good separation of concerns. Your assistant will be able to run even if the backing logic is not able to deliver performance. It will also be very easy to develop new 'skills' or 'actions' for our assistant.

# Prerequisites

It is preferred that you are aware of ES6 JavaScript and know basic HTML markup and CSS styling.

You will preferably need access to a WebKit-based web browser like Chromium, Edge or Google Chrome. You should have an understanding of how AJAX works and how one can use the [Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API) to make calls to REST API endpoints.

> **NOTE**: If you plan on using a Gecko-based browser like Mozila Firefox, go to `about:config` and enable the `media.webspeech.recognition.enable`, `media.webspeech.recognition.force_enable` and `media.webspeech.synth.enabled` flags.

Make sure you have [Node.js](https://nodejs.org/en/download/) installed and have access to `npm` on your terminal or shell by running `npm -v` which should display the version of `npm` installed. Install the `netlify-cli` by executing `npm i -g netlify-cli` (You may need `sudo` privileges on a Linux system).

> Refer to `images/netlify_cli_installation.jpg` in this folder.

# Activities

## Activity 1 - Start Listening with Browser APIs

In order to get started with building a voice assistant, we have to obviously listen to the speaker using the device microphone. The Web Speech API specification allows us to get started with speech recognition quickly.

The `SpeechRecognition` interface of the Web Speech API is the main controller interface that one has to use in order to implement speech recognition. On WebKit-based browsers, this interface is prefixed with the `webkit` vendor prefix.

Once we instantiate a `SpeechRecognition` object, we can use the `onresult` event handler to use the spoken phrases. The `onspeechend` handler can be used to stop listening to the microphone.

> Refer `src/activity-1a.js` in this folder.

Write a HTML file that sources this JavaScript file. Trigger the `listen()` function when a button is pressed. Observe that it logs the results to the browser console.

> Refer `images/activity-1a.jpg`

Use `String.prototype.includes()` to check if a particular word or phrase is contained in the spoken phrase. This will be useful when we to handle specific actions that get triggered on certain words. Log a message to the browser console if that word is detected.

> Refer `src/activity-1b.js` in this folder.

At the end of this activity, you can now detect specific phrases and perform actions based on the spoken phrase. 

**Mini-Challenge**: Write a script to detect whether the following phrase is spoken or not: "I want to learn something new".

### Reference

- [MDN Web Docs: String.prototype.includes()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/includes)
- [MDN Web Docs: SpeechRecognition](https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition)

## Activity 2 - Build a Serverless Backend and Deploy it

## Activity 3 - Interface the Assistant with your Backend

# Summary

# References

- [Netlify Docs: Functions](https://docs.netlify.com/functions/overview/)
- [MDN Web Docs: Web Speech API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Speech_API)
