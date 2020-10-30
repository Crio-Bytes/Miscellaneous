# Introduction

Hi Geeks, I'm sure you may heard about the API's(Applciation Programming Interface) and why we use it? Okay, I give you a short introduction about the API's. So, API  is a computing interface which defines interactions between multiple software intermediaries. In other simple words, It defines the kinds of calls or requests that can be made, how to make them, the data formats that should be used, the conventions to follow, etc.

You are also need to know about the JSON and how it works? So basically, JSON stands for JavaScript Object Notation. JSON is a lightweight format for storing and transporting data. JSON is often used when data is sent from a server to a web page.

In this microbyte, we will going to fetch data from the given URL. URL is taken from the website [FAKEJSON Placeholder](https://jsonplaceholder.typicode.com/). This website allows  you to use fake Online REST API for testing and prototyping with no cose. It is absolutely free.


# Prerequisites

You need to familiar with JAVA basics and some XML for styling the app.
1. You need to install the JDK(Java Development Kit) and Android Studio on your local machine.

Reference: <br/>
[Installing JDK 1](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)<br/>
[Installing JDK 2](https://rb.gy/qvic45)<br/>
[Installing Android Studio](https://rb.gy/6op4ac)

You can replace your "activity_main.xml" and "MainActivity.java" with our "activity_main.xml" and "MainActivity.java" or you can simply copy the code and paste it into your file.

In case if you are not familiar with the Java and XML, you can go through the reference links:

[XML : Building layouts](https://www.youtube.com/watch?v=BWUWJEaI0aE)<br/>
[JAVA Tutorials](https://www.w3schools.com/java/)

2. In this microbyte, we will going to use the "Volley Library" for fetching data over FAKEJSON. Go and search for "Volley library" by going through this [link](https://developer.android.com/training/volley) and explore yourself.


# What will you gain

After contributing in this project, the learner knows:
1. What is API and how do we call it?
2. What is JSON?
3. Use of Volley library and it's predefined methods and object.
4. Fetching data from the given URL.


# Activites

## Activity 1: Allow Permissions in AndroidManifest.xml

There are some permissions which would required to fetching the data from the url. You can add permissions in your "AndroidManifest.xml" file. Permissions like Usage of Internet will require to fetching the data.

Reference:
[Allow Permissions](https://java2blog.com/add-internet-permission-in-androidmanifest-android-studio/)

## Activity 2: Adding Dependencies

To use volley library, add dependencies of the library. You can get the library dependencies from [there](https://developer.android.com/training/volley). Don't worry if you don't know how to add the dependencies in android studio. Go through the reference link and explore.<br/>

Reference: 
[Volley Library](https://stackoverflow.com/questions/16588064/how-do-i-add-a-library-project-to-android-studio)


## Activity 3: Coding Phase in MainActivity.java

Now it's time to fetching data from the given URL, you can take url from [FAKEJSON Placeholder](https://jsonplaceholder.typicode.com/). You are required to use the "Logcat terminal" in the android studio to see the response getting from the url you use.<br/><br/>

Screenshot: <br/>
<img src="./images/Capture_1.PNG" alt="screenshot"/><br/>

In this screenshot, there is all the data contain by this [URL](https://jsonplaceholder.typicode.com/todos/1). You are required to fetch this data.

Screenshot: <br/>
<img src="./images/screenshot_1.PNG" alt="screenshot"/><br/>

In this screenshot, there is a some details about "Logcat Terminal". After fetching the data, your response will looks like that. Don't worry, if you feel low. We will provided to you a reference link.

Reference:<br/>
[Reference link 1](https://medium.com/techpin/https-medium-com-s2purno-volley-get-and-post-jsonobject-request-46fb8a46f799)<br/>
[Reference link 2](https://stackoverflow.com/questions/19837820/volley-jsonobjectrequest-post-request-not-working)<br/>
[How to use the Logcat Terminal for debugging](https://developer.android.com/studio/debug/am-logcat)
<br/><br/><br/>
There are some more screenshots provided to you in the images folder for your convinience.

### Note that there is no important role of UI/layout of an app. You will always going to use the "Logcat Terminal" to see the response after fetching the data.

# Micro challange

1. Complete this microbyte, and fetching the data over the url which was taken from the FAKEJSON placeholder.

2. We was always use the "Logcat Terminal" to see the response. What if the response is required to show the details to the user? I mean to say that you was successfully fetching the data and see the response in "Logcat Terminal". Now it's time to show the details to the user by creating a beautiful UI/LAYOUT of the app. There are some reference links which will helps you for sure.<br/><br/>
Reference: <br/>
[How to show the fetching data to the user via TextView](https://developer.android.com/reference/android/widget/TextView)


## Congrats Dev! You successfully learned how to use API's and fetching data.


# References

1. [Android Documentation](https://developer.android.com/)
2. [Volley library](https://developer.android.com/training/volley)