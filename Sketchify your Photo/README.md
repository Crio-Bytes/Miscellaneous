# Sketchify your Photo

### Ever wondered how the photo editing apps generate an automatic pencil sketch of your photo? Here is a micro-byte wherein you can Sketchify your Photo using Open CV.

Interesting image filter effects, such as a pencil sketch, do not have to be very computationally involved to look good. In fact, in order to create a beautiful black-and-white pencil sketch effect, all you essentially need is some blurring and two image blending techniques called dodging and burning.

Using OpenCV and Python, an RGB color image can be converted into a pencil sketch in four simple steps:

1. Convert the RGB color image to grayscale.
2. Invert the grayscale image to get a negative.
3. Apply a Gaussian blur to the negative from step 2.
4. Blend the grayscale image from step 1 with the blurred negative from step 3 using a color dodge.

<a href="https://github.com/rutujak24">
  <img width=40% align="center" src="https://github.com/rutujak24/Pencil-Sketch/blob/master/cat.jpeg" />
</a>
<a href="https://github.com/rutujak24">
  <img width=40% align="center" src="https://github.com/rutujak24/Pencil-Sketch/blob/master/sketch.jpeg" />
</a>


## Prerequisites

For this micro-task, you should have a basic knowledge of:
* Python
* Open CV basics

Along with this, we will be using **Jupyter Notebooks** as our working environment. So make sure you have it configured for your pc or laptop. You can have a look at the installation instructions [here](https://jupyter.org/install)

If you are new to Open CV, here is how to install it on anaconda platform or your loacal machine.
[Install Open CV](https://pypi.org/project/opencv-python)

## Activities

**Note:** Remember to go through the additional material provided in the activities to have a more thorough understanding of the underlying concepts. Using OpenCV and Python, an RGB color image can be converted into a pencil sketch in four simple steps which are divide into activities:

### Activity 1 
**Convert the RGB color image to grayscale.**

To Convert the RGB color image to grayscale, you just have to take the average of three colors. Since its an RGB image, so it means that you have add r with g with b and then divide it by 3 to get your desired grayscale image. Its done in this way.

> *Refer to src/Activity 1/Activity-1-RGB to Grayscale.ipynb*

<a href="https://github.com/rutujak24">
  <img width=40% align="center" src="https://github.com/rutujak24/Pencil-Sketch/blob/master/gray.png" />
</a>

### Activity 2
**Invert the grayscale image to get a negative.**
Image negatives, most of you might have heard this term, in good old days were used to produce images. Film Photography has not yet become obsolete as some wedding photographers are still shooting film. Because one has to pay for the film rolls and processing fees, most people have now switched to digital.Let’s create a negative transformation of the image.

Image negative is produced by subtracting each pixel from the maximum intensity value. e.g. for an 8-bit image, the max intensity value is 28– 1 = 255, thus each pixel is subtracted from 255 to produce the output image.

> *Refer to src/Activity 2/Activity-2-Invert Image.ipynb*

<a href="https://github.com/rutujak24">
  <img width=40% align="center" src="https://github.com/rutujak24/Pencil-Sketch/blob/master/invert.jpg" />
</a>

### Activity 3
**Apply a Gaussian blur to the negative from activity 2.**

Image blurring is achieved by convolving the image with a low-pass filter kernel. It is useful for removing noise. It actually removes high frequency content (eg: noise, edges) from the image. So edges are blurred a little bit in this operation (there are also blurring techniques which don't blur the edges). OpenCV provides four main types of blurring techniques.
1. Averaging
2. Gaussian Blurring
3. Median Blurring
4. Bilateral Filtering

> *Refer to src/Activity 3/Activity-3-Gaussian blur.ipynb*

<a href="https://github.com/rutujak24">
  <img width=40% align="center" src="https://github.com/rutujak24/Pencil-Sketch/blob/master/blur.jpg" />
</a>

### Activity 4
**Blend the grayscale image from step 1 with the blurred negative from step 3 using a color dodge.**

We know that when we solve any image related problem, we have to take a matrix. The matrix content will vary depending upon the image type - either it would be a binary image(0, 1), gray scale image(0-255) or RGB image(255 255 255). So if we want to add of two images then that means very simple we have to add respective two matrices. Blending of the two image can be done using: cv2.addWeighted() function is used for blending of two images.

> *Refer to src/Activity 4/Activity-4-Color dodge.ipynb*

<a href="https://github.com/rutujak24">
  <img width=40% align="center" src="https://github.com/rutujak24/Pencil-Sketch/blob/master/sketch.jpeg" />
</a>

### Activity 5 
**Test Yourself**

Combine the learnings of all above activities to make a working model.


> *Refer to src/Activity 5/Activity-5-Test Yourself.ipynb*


## Summary

Now, you must be confident in the working with open cv in python. Also, you must be clear in the syntax, its use and implementation as an when necessary.