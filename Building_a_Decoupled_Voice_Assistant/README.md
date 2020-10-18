# Introduction

We are all familiar with Google Assistant, Amazon Alexa, Cortana and Siri and most of us are amazed how they are able to reply to us with a piece of information or perform some action based on what we speak to them. How about building one yourself?

![voice assistant](https://www.witlingo.com/wp-content/uploads/2019/04/logo_platforms_640_300.png)

In this MicroByte we will be building a voice assistant within a browser and build a 'skill' or an 'action' for the assistant using a serverless cloud function. This kind of decoupling provides a good separation of concerns. Your assistant will be able to run even if the backing logic is not able to deliver performance. It will also be very easy to develop new 'skills' or 'actions' for our assistant.

# Prerequisites

It is preferred that you are aware of ES6 JavaScript and know basic HTML markup and CSS styling.

You will preferably need access to a WebKit-based web browser like Chromium, Edge or Google Chrome. You should have an understanding of how AJAX works and how one can use the [Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API) to make calls to REST API endpoints.

> **NOTE**: If you plan on using a Gecko-based browser like Mozila Firefox, go to `about:config` and enable the `media.webspeech.recognition.enable`, `media.webspeech.recognition.force_enable` and `media.webspeech.synth.enabled` flags.

Make sure you have [Node.js](https://nodejs.org/en/download/) installed and have access to `npm` on your terminal or shell by running `npm -v` which should display the version of `npm` installed. Install the `netlify-cli` by executing `npm i -g netlify-cli` (You may need `sudo` privileges on a Linux system).

> Refer to `images/netlify_cli_installation.jpg` in this folder.

# Activities

## Activity 1 - Start Interacting with Browser APIs

In order to get started with building a voice assistant, we have to obviously listen to the speaker using the device microphone. The Web Speech API specification allows us to get started with speech recognition quickly.

The `SpeechRecognition` interface of the Web Speech API is the main controller interface that one has to use in order to implement speech recognition. On WebKit-based browsers, this interface is prefixed with the `webkit` vendor prefix.

Once we instantiate a `SpeechRecognition` object, we can use the `onresult` event handler to use the spoken phrases. The `onspeechend` handler can be used to stop listening to the microphone.

> Refer `src/activity-1/activity-1a.js` in this folder.

Write a HTML file that sources this JavaScript file. Trigger the `listen()` function when a button is pressed. Observe that it logs the results to the browser console.

> Refer `images/activity-1/activity-1a.jpg` in this folder.

Use `String.prototype.includes()` to check if a particular word or phrase is contained in the spoken phrase. This will be useful when we to handle specific actions that get triggered on certain words. Log a message to the browser console if that word is detected.

> Refer `src/activity-1/activity-1b.js` in this folder.

We can also use the Web Speech API (`window.speechSynthesis`) to generate a speech that shall serve as a reply back to the user. We have gone ahead and added few lines to the code that you saw in the above step to support this feature.

> Refer `src/activity-1/activity-1c.js` in this folder.

At the end of this activity, you can now detect specific phrases and perform actions based on the spoken phrase and reply back to the user. 

**Mini-Challenge**: Write a script to detect whether the following phrase is spoken or not: "I want to learn something new". (Optional: Reply back with "Sure, I am looking for something".)

### Reference

- [MDN Web Docs: String.prototype.includes()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/includes)
- [MDN Web Docs: SpeechRecognition](https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition)
- [MDN Web Docs: SpeechSynthesis](https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesis)

## Activity 2 - Build a Serverless Backend and Deploy it

How do you handle business logic in a conventional application? You typically need a backend to execute database queries, fetch data from key-value stores and handle authentication. A backend is usually a server running the server-side code, which consumes compute resources as time progresses.

If it is possible for one to separate the logic into smaller functions, these functions can be executed on a Function-as-a-Service (FaaS) provider like AWS Lamba, Google Cloud Functions etc., which typically cost less and are charged per function invocation unlike servers which run continuously. This is why these functions are also termed serverless functions.

We will use Netlify Functions in this MicroByte which uses the AWS Lambda offering internally. Use a HTTP client like `curl` or Postman to make a `GET` request to a pre-existing function [https://decoupled-assistant.netlify.app/.netlify/functions/colour](https://decoupled-assistant.netlify.app/.netlify/functions/colour) which returns a random colour. You should observe that the output is similar to the one given below.

> Refer `images/activity-2/activity-2a.jpg` in this folder.

When building the voice assistant, it may be easier to keep the backend logic separate. As we are using Netlify Functions, you can place them in the `functions` directory. Take a look at an existing function before implementing your own serverless functions.

> Refer `src/activity-2/functions/colour.js` in this folder.

In order to let Netlify know that we have stored our serverless function in a specific folder, we must create a configuration file named `netlify.toml` in the project root that points to the directory where we have stored the functions.

> Refer `src/activity-2/netlify.toml` in this folder.

Deploy this function by executing `netlify deploy` by following the steps as shown below (Sign in to your Netlify account in the browser window that shall open on executing this command if this is your first time using `netlify-cli`):

> Refer `images/activity-2/activity-2b.gif` in this folder.

Copy the Website Draft URL, and use a HTTP client and make a `GET` request to `<netlify-draft-url>/.netlify/functions/colours`. Observe that the output is similar to the the one that we had received at the beginning of this activity.

At the end of this activity, you will be able to deploy your own backend logic to separate, modular serverless functions on Netlify.

**Mini-Challenge**: Study the serverless function provided in this MicroByte and complete the missing code in `src/activity-2/functions/microbytes.js` as per the comments given in the file. Deploy this function. This function will be available at `<netlify-draft-url>/.netlify/functions/microbytes` (Replace `<netlify-draft-url>` with the Website Draft URL as given by `netlify-cli`. Note that it may take a couple of minutes for the function to be deployed). 

## Activity 3 - Implement a Front-End for the Assistant

This activity needs your creativity and is left free to your imagination and experience with CSS styling. Basically, you need a button that will invoke the speech recognition sub-routine and a text-label to provide feedback to the user.

> Refer `src/activity-3/{index.html,style.css}` in this folder.

After you are done with styling the user interface, write a script to detect a couple of phrases and reply back to the user using hardcoded literals.

> Refer `src/activity-3/script.js` in this folder.

The front-end that we have implemented looks like this:

> Refer `images/activity-3/activity-3.gif` in this folder.

At the end of this activity, you would have built the interface which an user can use to interact with your assistant.

## Activity 4 - Interface the Assistant with your Backend

## Activity 5 - Deploy the Assistant to Production

# Summary

# References

- [Netlify Docs: Functions](https://docs.netlify.com/functions/overview/)
- [MDN Web Docs: Web Speech API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Speech_API)
