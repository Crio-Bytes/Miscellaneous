import numpy as np  #for array processing
from PIL import Image  #for Image Array conversion
Image.MAX_IMAGE_PIXELS = None #to remove limit on maximum number of pixels to be processed
import random #only for demonstration

#generate larger image from array
def imageFromArray():
    array = np.zeros([100, 200, 3], dtype=np.uint8)
    for i in range(0,array.shape[0]):
        for j in range(0,array.shape[1]):
            array[i,j]=[random.random()*255, random.random()*255, random.random()*255] #Replace with code to create pixel from array instead of random pixels
    img = Image.fromarray(array)
    img.save('filename.extension')
    return


#FUNCTION CALLS
