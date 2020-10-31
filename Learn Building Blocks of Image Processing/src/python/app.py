import numpy as np  #for array processing
from PIL import Image  #for Image Array conversion
Image.MAX_IMAGE_PIXELS = None #to remove limit on maximum number of pixels to be processed
import random #only for demonstration

#generate array from image  
def arrayFromImage():
    img = Image.open('filename.extension')
    print(np.array(img))
    return


#convert to greyscale
def toGreyScale(filename, isTransparent): #isTransparent to be used only with RGBA channel
    img = Image.open(filename)
    array = np.array(img)
    greyArray = np.zeros([array.shape[0],array.shape[1]], dtype=np.uint8) #creating new array, not over-writing
    for i in range(0, array.shape[0]):
        for j in range(0,array.shape[1]):
            if((isTransparent) and (array[i,j,3]==0)):
                greyArray[i,j]= #if transparent, make it white
            else:
                greyArray[i,j]= #add greyscale calculation formula
    img = Image.fromarray(greyArray)
    img.save('grey.extension')
    return

#box blur
def boxBlur():
    kernel=np.array([[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1]])
    Normalisation=1
    img = Image.open('file.extension')
    array = np.array(img)
    modifiedImage=np.zeros([array.shape[0],array.shape[1],3], dtype=np.uint8)
    for i in range(2, modifiedImage.shape[0]-2):
        for j in range(2,modifiedImage.shape[1]-2):
            for c in range(0,3):
                sum=0
                for k in range(0,kernel.shape[0]):
                    for l in range(0,kernel.shape[1]):
                        sum=sum+kernel[k,l]*array[i-2+k,j-2+l,c]
                modifiedImage[i,j,c]=sum/Normalisation
    img = Image.fromarray(modifiedImage)
    img.save('BoxBlurred.png')
    return

# 3x3 edge detection
def edgeDetection():
    kernel=np.array([[1,0,-1],[2,0,-2],[1,0,-1]])
    img = Image.open('file.png')
    array = np.array(img)
    modifiedArray = np.zeros([array.shape[0],array.shape[1]], dtype=np.uint8) #creating new array, not over-writing
    for i in range(1, array.shape[0]-1):
        for j in range(1,array.shape[1]-1):
            sum=0
            for k in range(0,kernel.shape[0]):
                for l in range(0,kernel.shape[1]):
                    sum=sum+kernel[k,l]*array[i-1+k,j-1+l]
            modifiedArray[i,j]=sum
    img = Image.fromarray(modifiedArray)
    img.save('EdgeDetected.png')
    return

#FUNCTION CALLS