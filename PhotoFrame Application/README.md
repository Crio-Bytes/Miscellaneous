# Introduction

The app name is MyPhotoFrame Application. This app solves the real world problem. I mean to say that we click photos in our mobile in free time or in 
regular days and when it's time to see the photos we open the gallery swipe left and right to see the images. This app little bit as same but there are minor differences 
because the mobile gallery app has some advanced features. 

In this Microbyte, we make an same app but little bit different and easy so feel free. In this app, you may have to press the button i.e, left and right to see the images and 
the images are choosen by us.

After the completion of this app, it may looks like the screenshot we provided you in the images folder which contains screenshot folder.
Here are some screenshots:

<img src="https://github.com/deepak-prajapatii/Miscellaneous/blob/android_tasks/PhotoFrame%20Application/images/Screenshot/Screenshot_1.jpg" width="350" >
<img src="https://github.com/deepak-prajapatii/Miscellaneous/blob/android_tasks/PhotoFrame%20Application/images/Screenshot/Screenshot_2.jpg" width="350" >

There are the images button for swipe the images left and right. You can see the Imagebuttons in the given screenshot above. Also, there is the text showing image name as the image 
changes the name will also changes.

# Prerequisites

You need to familiar with JAVA basics and some XML for styling the app.
First you need to install the JDK(Java Development Kit) on your local machine from here https://www.oracle.com/java/technologies/javase-jdk15-downloads.html. If you face any problem in installing the JDK, go to youtube there are many tutorials how to install JDK. One of them is https://rb.gy/qvic45. 
After installing JDK, now you need to install the Android Studio from here:  https://rb.gy/6op4ac 

When opening the android studio, create a project and you can do follow these steps:
1. After creating the project, replacing your activity_main.xml and MainActivity.java  with our activity_main.xml and MainActivity.java or you can simply copy the code and paste it into your file.
2. There are some images you need to paste them all in your drawable folder two times, first for drawable and other one for drawable(v24).


# Activities

## Activity 1 : Debugging and coding in activity_main.xml
### Note that you need to write your own code in place of TODO comments.

1. Set the value of alpha of the imageview so that the image should not be visible in place of TODO comments.
 
 ![Screenshot (220)](https://user-images.githubusercontent.com/65127291/96956760-977dcd00-1516-11eb-9900-788cb72b4bcb.png)
 
 Reference : You can go through the link : https://rb.gy/eao5wa  and search for alpha parameter.

2. Create the textfield via TextView to show the names of the images as given in the screenshot :

![Screenshot (224)](https://user-images.githubusercontent.com/65127291/96957824-59ce7380-1519-11eb-8d92-fc3022908066.png)

Make sure that there is no hardcore strings present in the textview.

3. Set the function in ImageButtons i.e, for left button you would need to set the "prev" function in the Onclick parameter of the ImageButtons. Do same for the right button.

![Screenshot (225)](https://user-images.githubusercontent.com/65127291/96957872-7b2f5f80-1519-11eb-9ee9-d61c96fca70a.png)

Reference : You can go through this link and search for your query via Ctrl+F and search :  https://rb.gy/l3an7c


## Activity 2 : Coding Phase in the MainActivity.java
### Again Note that you need to write your own code in place of TODO comments.

![Screenshot (226)](https://user-images.githubusercontent.com/65127291/96958119-2a6c3680-151a-11eb-98f6-ef9ac6999683.png)

1. Set the value of alpha of the imageview so that the image should be visible in place of TODO comments.

2. Write code for the names of the images when we swipe the image name should also changes as given in the screenshot folder.


Check for errors and debug it.

For Building or created the APK file, go to menu bar, Build -> Build Bundle(s)/ APK(s) -> Build APK(s).

## Congrats! You created your photoframe application, now you can able to install the app in your device and run the app.

## References 
1. [TextView Docs: Functions](https://developer.android.com/reference/android/widget/TextView)
2. [ImageView Aplha Docs](https://stackoverflow.com/questions/4931071/android-and-setting-alpha-for-image-view-alpha)

