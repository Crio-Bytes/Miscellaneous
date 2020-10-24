# Introduction

We use mobile gallery in regular days to see the photos, documents, etc. There is a feature of swiping left and right in mobile devices to see the photos. In this Microbyte, we will use this "SWIPING" concept and make an app which works same as mobile gallery but little bit different. In this app, we don't read any SD card to see the photos. Now the  question arise so after completion of an app, what will it do? Be patience, we would not do any advanced coding so we just try to make a simple app that has swiping features i.e, left and right button to see the images with their names. In this app, Images are selected by us which are provided you to in a img folder(Don't confuse with the screenshot folder).

After the completion of this app, it may looks like the screenshot we provided you in the images folder which contains screenshot folder.
Here are some screenshots:

<img src="https://github.com/deepak-prajapatii/Miscellaneous/blob/android_tasks/PhotoFrame%20Application/images/Screenshot/Screenshot_1.jpg" width="350" >
<img src="https://github.com/deepak-prajapatii/Miscellaneous/blob/android_tasks/PhotoFrame%20Application/images/Screenshot/Screenshot_2.jpg" width="350" >

There are the images button for swipe the images left and right. You can see the Imagebuttons in the given screenshot above. Also, there is the text showing image name as the image changes it also reflects the name of the images. For more, you can take help or hints from the screenshots provided in screenshot folder(Inside the img folder).

# Prerequisites

You need to familiar with JAVA basics and some XML for styling the app. 

First you need to install the JDK(Java Development Kit) on your local machine from here https://www.oracle.com/java/technologies/javase-jdk15-downloads.html. If you face any problem in installing the JDK, go to youtube there are many tutorials how to install JDK. One of them is https://rb.gy/qvic45. 
After installing JDK, now you need to install the Android Studio from here:  https://rb.gy/6op4ac 

When opening the android studio, create a project and you can do follow these steps:
1. After creating the project, replacing your activity_main.xml and MainActivity.java  with our activity_main.xml and MainActivity.java or you can simply copy the code and paste it into your file.
2. There are some images you need to paste them all in your drawable folder two times, first for drawable and other one for drawable(v24).


In case if you are not familiar with the Java/XML, you can go through the reference links:

[XML : Building layouts](https://classroom.udacity.com/courses/ud834)

[JAVA Tutorials](https://www.w3schools.com/java/)


# Activities

## Activity 1 : Layout Improvement
### Note that you need to write your own code in place of TODO comments.

1. Set the value of alpha of the imageview so that the image should not be visible in place of TODO comments.
 

   ``` <ImageView
        android:id="@+id/pic1"
        android:layout_width="246dp"
        android:layout_height="346dp"
        android:layout_marginTop="40dp"
        
        <!--Set the alpha of the image be 0 -->
    
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/rohit" /> ```
        
 
 Reference : You can go through the link : https://rb.gy/eao5wa  and search for alpha parameter.

2. Create the textfield via TextView to show the names of the images as given in the screenshot:

       ``` <TextView
            <!-- Set the textview for showing images name-->
            /> ```

Make sure that there is no hardcore strings present in the textview.

3. Set the function in ImageButtons i.e, for left button you would need to set the "prev" function in the Onclick parameter of the ImageButtons. Do same for the right button.

    ```     <ImageButton
            android:id="@+id/next"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            <!--   Set the onclick value to a function-->
            android:layout_marginLeft="53dp"
            android:layout_marginRight="53dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/icon_next"
            tools:ignore="VectorDrawableCompat" /> ```

Reference : You can go through this link and search for your query via Ctrl+F and search :  https://rb.gy/l3an7c


## Activity 2 : Coding Phase in the MainActivity.java
### Again Note that you need to write your own code in place of TODO comments.


1. Set the value of alpha of the imageview so that the image should be visible and set the text showing image names.
  
      ```   public void prev(View v){
        text = findViewById(R.id.text);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (4 + currentImage - 1) % 4;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        // Set the value of alpha so that the image should be visible
        // Set the text for the names of the images

    }  ```
    
    

2. Build the logic for see the next image/photo and implement it in the "NEXT" function.
Hint : Just understand carefully the "PREV" function and build the logic for the "NEXT" function.

``` 
public void next(View v){
        text = findViewById(R.id.text);
        // write your code here

    }
```

Check for errors and debug it.

For Building or created the APK file, go to menu bar, Build -> Build Bundle(s)/ APK(s) -> Build APK(s).

## Congrats! You created your photoframe application, now you can able to install the app in your device and run the app.

## References 
1. [TextView Docs: Functions](https://developer.android.com/reference/android/widget/TextView)
2. [ImageView Aplha Docs](https://stackoverflow.com/questions/4931071/android-and-setting-alpha-for-image-view-alpha)

