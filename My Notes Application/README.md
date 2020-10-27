# Introduction

Hello geeks, In this microbyte we will working on the most used app named as "My Notes". You may know some 10-15 years before, our parents was used to make a dairy for saving their contact numbers, expenditures of homes and many others. Today we will working on this type of app. We are not supposed to do adavnced level of coding, we just use the logic and implement the code for saving contact or any other text.

From this microbyte, we will learn how can we make a notes app in which any text is saved and when we restart the app it will show up you the text that you had save recently. We  use "SharedPreferences" to make this app. Don't worry if you don't have knowledge about that, we will give you reference material where it be compulsory.


# Prerequisites

You need to familiar with JAVA basics and some XML for styling the app.

First you need to install the JDK(Java Development Kit) on your local machine from here https://www.oracle.com/java/technologies/javase-jdk15-downloads.html. If you face any problem in installing the JDK, go to youtube there are many tutorials how to install JDK. One of them is https://rb.gy/qvic45. After installing JDK, now you need to install the Android Studio from here: https://rb.gy/6op4ac

When opening the android studio, create a project and you can do follow these steps:

After creating the project, replacing your activity_main.xml and MainActivity.java with our activity_main.xml and MainActivity.java or you can simply copy the code and paste it into your file.
There are some images you need to paste them all in your drawable folder two times, first for drawable and other one for drawable(v24).
In case if you are not familiar with the Java/XML, you can go through the reference links:

[XML : Building layouts](https://classroom.udacity.com/courses/ud834)

[JAVA Tutorials](https://www.w3schools.com/java/)


# Activities

## Activity 1 : Fix Layout

Please have a look for the screenshot of the app provided to you in the images folder and code the xml to generate the similar layout as given in the screenshot. You would need to write your xml code in "activity_main.xml".  Make sure there is no hardcore string/text present in the xml file. Don't worry if you don't have so much knowledge about the xml, we will provided you some references which will help you for sure. I personally suggests you that go through the reference links and explore more about that.

#### One more thing, you would need to write your code in place of TODO comments. 
Example: 

```
    <EditText
        android:id="@+id/editTextTextPersonName"
<!--        write your code here-->
         />

    <Button
<!--      write your code here  -->
    />  
```

Reference for Layout:<br/><br/>
[XML Layout](https://developer.android.com/guide/topics/ui/declaring-layout)<br/>
[Button Layout](https://developer.android.com/guide/topics/ui/controls/button)<br/>
[EditText layout](https://developer.android.com/reference/android/widget/EditText)


## Activity 2 : Coding Phase in the MainActivity.java

In this phase, you would need to write your code in "MainActivity.java" file. Now, we have to code for saving our data and display in the textview. WE will use "SharedPreferences" class in this microbyte. You may have require to the various imports and using their methods. 
Don't worry if don't have any idea how to use "SharedPreferences", we will provided to you the references and go through these for sure. It may helps you to use the "SharedPreferences" and explore yourself.

Reference:  [Shared Preferences](https://www.tutorialspoint.com/android/android_shared_preferences.htm)

```
button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String msg = editText.getText().toString();

                SharedPreferences sharedPreferences = getSharedPreferences("demo",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                //write your code here
            }
        });

SharedPreferences getShared = getSharedPreferences("demo", MODE_PRIVATE);

        //write your code here
```

#### Micro challange

Complete the microbyte, enter the any information that you want to save and save the information via pressing the "Save Button".


# References

1. [Android Documentation](https://developer.android.com/)
2. [Button Layout](https://developer.android.com/guide/topics/ui/controls/button)
3. [EditText layout](https://developer.android.com/reference/android/widget/EditText)
