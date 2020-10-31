import numpy as np  #for array processing
from PIL import Image  #for Image Array conversion
Image.MAX_IMAGE_PIXELS = None #to remove limit on maximum number of pixels to be processed


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