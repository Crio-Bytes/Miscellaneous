import numpy as np  #for array processing
from PIL import Image  #for Image Array conversion
Image.MAX_IMAGE_PIXELS = None #to remove limit on maximum number of pixels to be processed

#convert to greyscale
def toGreyScale(filename, isTransparent): #isTransparent to be used only with RGBA channel
    img = Image.open(filename)
    array = np.array(img)
    greyArray = np.zeros([array.shape[0],array.shape[1]], dtype=np.uint8) #creating new array, not over-writing
    for i in range(0, array.shape[0]):
        for j in range(0,array.shape[1]):
            if((isTransparent) and (array[i,j,3]==0)):
                greyArray[i,j]= 0#if transparent, make it white
            else:
                greyArray[i,j]= 0 #add greyscale calculation formula
    img = Image.fromarray(greyArray)
    img.save('grey.extension')
    return


#FUNCTION CALLS
