# Introduction

Welcome all to this beginner-friendly micro crio-byte that will get started you off SpeechToText app in android in java language

# Copy code from My src folder and follow steps


# Pre-requisites for this micro-byte

Basic programming knowledge in any computer language.
Enthusiasm and passion to contribute is required😅.




Use can use an android studio 

## To get started with this micro-byte please go to any of the folders and check out is readme

# Background

Android is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smartphones and tablets

# Activities

## Activity 0

*install android studio *
##  Step – 1 :

Head over to this [Link ](https://developer.android.com/studio#downloads)  to get the Android Studio executable or zip file .

![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/DownAS_GFG.png)
 
##  Step – 2 :
Click on the download android Enter Hello Android as the application name.
The application name is the name of the application as it pertains to Android. When the application is installed on the emulator or physical device, this name appears in the application launcher.studio button .

For more details    [Link ](   https://www.geeksforgeeks.org/guide-to-install-and-set-up-android-studio/)




## Activity 1-
 * First things first: Start Android Studio. You should see a screen that looks similar to the one shown here. Now you’re ready to start cooking with Android.*
 
 Follow these steps to create your first Android application project:
 
 
* In Android Studio, choose File→New Project.*

  The Create New Project Wizard opens.
 
![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/473298.image0.jpg)

*Enter Hello Android as the application name.*
The application name is the name of the application as it pertains to Android. When the application is installed on the emulator or physical device, this name appears in the application launcher.


![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/473299.image1.jpg)


*Enter Nikhilanand as the Company Domain.*

Your Package name should autocomplete to com.Nikhilanand.helloandroid. This is the name of the application ID, which will generally be the same as your Java package.

*Choose a location for your project.*
The default location will probably be fine. Click Next.


*choose a Minimum SDK version of API 21: Android 5.0 Lollipop, and click Next.*


*In the Create Activity box, choose Blank Activity and click Next.*

![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/473300.image2.jpg)


The Add an Activity screen appears.



*Enter MainActivity in the Activity Name box, activity_main in the Layout name, MainActivity in the Title, and menu_main as the Menu Resource Name.*

The New Blank Activity screen defines what the initial activity is called — the entry point to your application. When Android runs your application, this activity is the first one to be accessed.

The Layout name is the name of the file that will contain the layout of your activity’s user interface.

*Click the Finish button.*


![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/473301.image3.jpg)


 
 
## Activity 2-



*Add internet permission in manifest file below  package name*

```
<uses-permission android:name="android.permission.STORAGE"/>
 
<uses-permission android:name="android.permission.INTERNET" />

```
![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/Untitled%20design%20(6).png)



## Activity 3-

create id for TextView and ImageButton .

* Name TextView as textView and ImageButton as  imageButton *


* Example  
```

android:id="@+id/<name_of_id>"

 
 
```
![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/createid.png)



## Activity 4-
## Let’s dive into the MainActivity.java file.

        //assign imagebutton as which you give id for Imagebutton

*For example textview*
```
 textView= findViewById(R.id.textView);
 ```


![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/assignimagebutton.png)






[How to connect a layout view with an activity]  https://stackoverflow.com/questions/2198788/how-to-connect-a-layout-view-with-an-activity


[Layouts ]    https://developer.android.com/guide/topics/ui/declaring-layout



## Activity 5-
Now here comes the important part Build apk to install in phone and share with yourfriends

## Step 1-GO to BUILD 

## Step 2-click on build bundles

![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/createapk.png)

## Step 3-click on build APK

## Step 4-click on locate

![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/gotoloacte.png)

## Step 5-install in phone
![alt text](https://github.com/Nikhilananddev/Miscellaneous/blob/Nikhilanand/SpeechToText/add/SpeechtToText/Images/install%20app.png)

 


 
## References


  [Intent] https://developer.android.com/reference/android/content/Intent
  
  
[RecognizerIntent] https://developer.android.com/reference/android/speech/RecognizerIntent

  [Android Basics by Google] https://www.udacity.com/course/android-basics-nanodegree-by-google--nd80
  
   [How to create speech to text app](https://medium.com/voice-tech-podcast/android-speech-to-text-tutorial-8f6fa71606ac)
