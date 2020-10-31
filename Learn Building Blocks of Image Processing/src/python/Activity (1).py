import numpy as np  #for array processing
from PIL import Image  #for Image Array conversion
Image.MAX_IMAGE_PIXELS = None #to remove limit on maximum number of pixels to be processed

#generate array from image  
def arrayFromImage():
    img = Image.open('filename.extension')
    print(np.array(img))
    return


#FUNCTION CALLS
