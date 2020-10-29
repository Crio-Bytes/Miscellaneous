# Sketchify your Photo

### Ever wondered how the photo editing apps generate a automatic pencil sketch of your photo? Here is a micro-byte wherein you can Sketchify your Photo using Open CV.

<a href="https://github.com/rutujak24">
  <img width=40% align="left" src="https://github.com/rutujak24/Pencil-Sketch/blob/master/Rutuja.jpeg" />
</a>
<a href="https://github.com/rutujak24">
  <img width=40% align="right" src="https://github.com/rutujak24/Pencil-Sketch/blob/master/sketch.png" />
</a>

## Prerequisites

For this micro-task, you should have a basic knowledge of:
* Python
* Open CV basics

If you are new to Open CV, here is how to install it on anaconda platform or your loacal machine.
[Install Open CV](https://pypi.org/project/opencv-python)

## Activities

**Note:** Remember to go through the additional material provided in the activities to have a more thorough understanding of the underlying concepts. Using OpenCV and Python, an RGB color image can be converted into a pencil sketch in four simple steps which are divide into activities:

### Activity 1 
Convert the RGB color image to grayscale.

> *Refer to src/Activity 1/Activity-1-RGB to Grayscale.ipynb*

### Activity 2
Invert the grayscale image to get a negative.

> *Refer to src/Activity 2/Activity-2-Invert Image.ipynb*


### Activity 3
Apply a Gaussian blur to the negative from activity 2.

> *Refer to src/Activity 3/Activity-3-Gaussian blur.ipynb*


### Activity 4
Blend the grayscale image from step 1 with the blurred negative from step 3 using a color dodge.

> *Refer to src/Activity 4/Activity-4-Color dodge.ipynb*

### Activity 5 
Combine all the above activities to make a working model

> *Refer to src/Activity 5/Activity-5-Do it yourself.ipynb*


## Summary

Now, you must be confident in the working with open cv in python. Also, you must be clear in the syntax, its use and implementation as an when necessary.