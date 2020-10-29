# Introduction

Hello geeks, In this microbyte we will working on the most used app named as "My Notes". You may know some 10-15 years before, our parents was used to make a dairy for saving their contact numbers, expenditures of homes and many others. Today we will working on this type of app. We are not supposed to do adavnced level of coding, we just use the logic and implement the code for saving contact or any other text.

From this microbyte, we will learn how can we make a notes app in which any text is saved and when we restart the app it will show up you the text that you had save recently. We  use "SharedPreferences" to make this app. Don't worry if you don't have knowledge about that, we will give you reference material where it be compulsory.


# Prerequisites

You need to familiar with JAVA basics and some XML for styling the app.

You need to install the JDK(Java Development Kit) and Android Studio on your local machine.

Reference: <br/>
[Installing JDK 1](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)<br/>
[Installing JDK 2](https://rb.gy/qvic45)<br/>
[Installing Android Studio](https://rb.gy/6op4ac)

You can replace your "activity_main.xml" and "MainActivity.java" with our "activity_main.xml" and "MainActivity.java" or you can simply copy the code and paste it into your file.

In case if you are not familiar with the Java and XML, you can go through the reference links:

[XML : Building layouts](https://www.youtube.com/watch?v=BWUWJEaI0aE)<br/>
[JAVA Tutorials](https://www.w3schools.com/java/)


# Activities

1. Please have a look for the screenshot of the app provided to you in the images folder and code the xml to generate the similar layout as given in the screenshot. You would need to write your xml code in "activity_main.xml".  Make sure there is no hardcore string/text present in the xml file. Don't worry if you don't have so much knowledge about the xml, we will provided you some references which will help you for sure. I personally suggests you that go through the reference links and explore more about that.

#### One more thing, you would need to write your code in place of TODO comments. 

Screenshot: <br/>
<img src = "./images/Screenshot_1.jpg" alt="screenshot" width="400" height="500"/><br/><br/>
Reference for Layout:<br/>
[XML Layout](https://developer.android.com/guide/topics/ui/declaring-layout)<br/>
[EditText layout](https://developer.android.com/reference/android/widget/EditText)


2. There are many Views and viewsgroup which needs to required to import for their use in the "MainActivity.java" file.<br/><br/>
Reference: https://www.dev2qa.com/how-to-auto-import-all-class-in-android-studio/  <br/><br/>
Screenshot:<br/>
![Capture](https://user-images.githubusercontent.com/65127291/97537429-cac3ce80-19e4-11eb-9a4b-acdd0c4d28ec.PNG)


3. Setting the views id where it needs to required. For example: If you want to create a view like TextView, set the id of "TextView" object with the inbuilt methods in android studio. Go, search and explore how you can set the id of View. Don't worry if don't know about that so much, I would suggests that go through the reference link given below.<br/><br/>
Reference: https://developer.android.com/reference/android/view/View  <br/><br/>
You can also take hint from there.<br/>
```
button = findViewById(R.id.button);
        textView;
        editText;
```


4. In this phase, you would need to write your code in "MainActivity.java" file. Now, we have to code for saving our data and display in the textview. You may have require to the various imports and using their methods. 
We will provided to you the references and go through these for sure. It may helps you to use the build the logic on how to save our data and it remains available after restarting of tha app. Go through the reference link and explore yourself.<br/><br/>
Reference:<br/>[Shared Preferences](https://www.tutorialspoint.com/android/android_shared_preferences.htm) <br/><br/>
Screenshot:<br/>
<img src="./images/Screenshot_2.jpg" alt="screenshot" width="400" height="500"/>

#### Micro challange

Complete the microbyte, enter the any information that you want to save and save the information via pressing the "Save Button". Close the app and reopen the app again, see there is the information enter by you will display at the top of the screen.

## Congrats Dev! You successfully created "My Notes Appication".


# References

1. [Android Documentation](https://developer.android.com/)
2. [SharedPreferences](https://developer.android.com/reference/android/content/SharedPreferences)
