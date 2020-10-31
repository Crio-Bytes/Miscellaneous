import numpy as np  #for array processing
from PIL import Image  #for Image Array conversion
Image.MAX_IMAGE_PIXELS = None #to remove limit on maximum number of pixels to be processed

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

#FUNCTION CALLS
