# Introduction

Welcome all to this beginner-friendly micro crio-byte that will get started you off SpeechToText app in android in java language



# Pre-requisites for this micro-byte

Basic programming knowledge in any computer language Java and android.
Enthusiasm and passion to contribute is required😅.

Use can use an android studio 

## To get started with this micro-byte please go to any of the folders and check out is readme

# Background

Android is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smartphones and tablets

# Activities

## Activity 0

Understanding "android structures"
Java and XML are the two main programming languages used in Android App development. Knowledge and mastery over these programming languages are, therefore, prerequisites to developing an Android app. Some of the fundamentals of the Java programming language include: Packages. Objects & classes.


References:

  [android  - Introduction](https://www.javatpoint.com/android-tutorial)


## Activity 1-
First of all, create a new Android Studio project and in the manifest file add the following user-permissions:
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.texttospeech">
    <uses-permission android:name="android.permission.RECORD_AUDIO"/>
    <uses-permission android:name="android.permission.INTERNET"/>
    ```
    
 Now in the activity_main.xml file, we will add an TextView and an ImageButton.I will not explain the layout file as I don’t want to waste anybody’s time who is here to learn the Speech to Text.

How to create UI in android  add TextView  and ImageButton. read comments and add codes -> UI
![alt image](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/LayoutDesign.png)



References:

[TextView] (https://developer.android.com/reference/android/widget/TextView) 

 [ImageButton]        ( https://developer.android.com/reference/android/widget/ImageButton)
 
 


## Activity 2-
## Let’s dive into the MainActivity.java file.


> NOTE:This activity links java with view.
link view  in mainactivity by FindViewbyId

[How to connect a layout view with an activity]  https://stackoverflow.com/questions/2198788/how-to-connect-a-layout-view-with-an-activity


[Layouts ]    https://developer.android.com/guide/topics/ui/declaring-layout



## Activity 3-
Now here comes the important part first which will initialize the SpeecRecognizer object and then create the intent for recognizing the speech.
 
 As you can see we have added some extras let me explain what are they.
 The constant  **ACTION_RECOGNIZE_SPEECH** starts an activity that will prompt the user for speech and send it through a speech recognizer.
 
**EXTRA_LANGUAGE_MODEL:** Informs the recognizer which speech model to prefer when performing  ** ACTION_RECOGNIZE_SPEECH.**

**LANGUAGE_MODEL_FREE_FORM:** Use a language model based on free-form speech recognition.
**EXTRA_LANGUAGE:** optional IETF language tag (as defined by BCP 47), for example, “en-US”.

Now we will set a speechRecognitionListener to our speechRecognizer object using the setRecognitionListener() method.

You can see after setting the listener we get several methods to implement. We will go the onResults method and add the following code


 
## References


  [Intent] https://developer.android.com/reference/android/content/Intent
  
  
[RecognizerIntent] https://developer.android.com/reference/android/speech/RecognizerIntent

  [Android Basics by Google] https://www.udacity.com/course/android-basics-nanodegree-by-google--nd80
  
   [How to create speech to text app](https://medium.com/voice-tech-podcast/android-speech-to-text-tutorial-8f6fa71606ac)
