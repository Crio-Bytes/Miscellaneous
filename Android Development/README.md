# Introduction

We all are familiar with mobile games like LUDO KING, TEMPLE RUN, SUBWAY SURFERS, CANDY CRUSH etc. Do you ever thought how these games works? I mean to say that how our player moves, run, increase health. How these all tasks perform?
So answer is simple, there is no rocket science behind these tasks. All are just logic to implement how our player react, on which command to execute.


In this MicroByte, we will build a gaming app (Don't worry its not advanced) named "Tic Tac Toe". I'm sure you all played this game in school time and we used to call it "ZERO KAANTA". If you don't know about this game so much, don't worry just check out the link https://playtictactoe.org/ play the game and think about logic.

Now your task is to write the code in place of TODO comments. There is already some code written in the file for your convinience. Build and apply the logic. Run the app if errors occurs debug it.

# Prerequisites

You need to familiar with JAVA basics and some XML for styling the app.
First you need to install the JDK(Java Development Kit) on your local machine from here https://www.oracle.com/java/technologies/javase-jdk15-downloads.html. If you face any problem in installing the JDK, go to youtube there are many tutorials how to install JDK. One of them is https://rb.gy/qvic45. 
After installing JDK, now you need to install the Android Studio from here:  https://rb.gy/6op4ac 

When opening the android studio, create a project and you can do follow these steps:
1. After creating the projec, replacing your activity_main.xml and MainActivity.java  with our activity_main.xml and MainActivity.java or you can simply copy the code and paste it into your file.

# Activities

Please have a look for screenshot of this app which is provided in images folder in this microbyte. After you make this app successfully, your app looks like that screenshot which is in images folder.

## Activity 1 : Improving layout in activity_main.xml 

In this app, you will see the grid, X shaped, O shaped images which is provided to you in img folder(Inside the images folder).
On the top of the app, there is the name of the app "Tic Tac Toe".

In the activity_main.xml file, you have to improve or fix the warnings or errors.
1. Remove the hardcore string from TextView.

![Screenshot (208)](https://user-images.githubusercontent.com/65127291/96499716-69289500-126b-11eb-90e2-d2894c4a680e.png)

There is no rocket science for removing hardcore strings

![Screenshot (209)](https://user-images.githubusercontent.com/65127291/96500018-d805ee00-126b-11eb-8e82-350d4d869954.png)

For understanding the concept of what is hardcore string and why we should remove this warning, go through the link https://rb.gy/qcxs83 it will helps you a lot.

### Note that hardcore strings can be removed by setting the value of text of that field from strings.xml.

2. Changes the text from "@string/status_Bar" to "@string/status_bar" and "@string/Result" to "@string/result".

### Note that sometimes there is no need to remove all the warnings but for errors you want to remove it all.

## Activity 2 : Fix bugs in MainActivity.java 

Now its time to remove/fix errors in logic building in MainActivity.java file, which is present in src folder (Inside the Android Development). Again there is some code written in the file for your convinience you just need to fix it and write some code in place of TODO comments.

Lets go, understand the some method in MainActivity.java 

![textview](https://user-images.githubusercontent.com/65127291/96540252-da436900-12ba-11eb-8647-237ca9f34477.png)

Here is the "onCreate()" Method which is used to set the content view, from layout/activity_main.xml 

Reference to understand how Android Activity and its Lifecycle works : https://developer.android.com/reference/android/app/Activity

1. First you need to set the value of activeGame to "true".

![Screenshot (212)](https://user-images.githubusercontent.com/65127291/96540456-72415280-12bb-11eb-8abb-eaf263a055c5.png)

2. Call the function gameReset in case activeGame is false.

![Screenshot (213)](https://user-images.githubusercontent.com/65127291/96540575-b03e7680-12bb-11eb-9b3d-82e6e19b9aa7.png)

3. Set the textview status by the method "findViewById" and set the text to "winner" string.

![Screenshot (214)](https://user-images.githubusercontent.com/65127291/96540637-d82dda00-12bb-11eb-9875-2b2a142e706f.png)

![Screenshot (215)](https://user-images.githubusercontent.com/65127291/96540826-44104280-12bc-11eb-8deb-0033cc857167.png)

Reference for how textview and its method works : https://rb.gy/yqiuzs

4. If game resets then you need to set the defaults for play the game again.

![Screenshot (216)](https://user-images.githubusercontent.com/65127291/96540953-981b2700-12bc-11eb-9db4-c5a093c8c068.png)

Just like the above statement, you need to write the code as same but there are difference image Id's.
Check for errors and dedbug it.

For Building or created the APK file, go to menu bar, Build -> Build Bundle(s)/ APK(s) -> Build APK(s).

## Congrats! You created an gaming app, now you can able to install the app in you device and play and enjoy the game. 


## References 
1. [TextView Docs: Functions](https://developer.android.com/reference/android/widget/TextView)
2. [ImageView Docs](https://developer.android.com/reference/android/widget/ImageView)
3. [Android Activity and its Lifecycle](https://rb.gy/wmsvkm)
