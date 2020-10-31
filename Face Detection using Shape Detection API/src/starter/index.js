// Get the canvas HTML Element from the document
const canvas = document.querySelector('canvas');
// Get the 2D Canvas Context Object form the canvas HTML OBject 
const context = canvas.getContext('2d');

if (isShapeDetectionApiSupported()) {
    runShapeDetectionApiDemo();
} else {
    displayFallbackMessage();
}

// ------------------------
// Activity - 2: - Check whether we have FaceDetector API available in Window Object
// return True if available else false.
function isShapeDetectionApiSupported() {
 // TODO
 // Hint: Visit https://wicg.github.io/shape-detection-api/#examples
}

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


async function runShapeDetectionApiDemo() {

//------------------------

// Activity -3.1: - Get media Stream( webcam input ) from the Browser.
// Define constraints in a constant constraint variable
// Get media stream and attach it to a constant mediaStream variable.
// Hint: https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia
 // TODO
  



//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    const video = document.createElement('video');

// -------------------------
// Activity -3.2: - Attach mediaStream to above programatically created video HTML tag.
// Console log the video object.
// Check for srcObject property in video and attach mediaStream variable to it.
// Check for autoplay property and set it to true.
  // TODO   




//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

// Initializes width and height of the canvas when video is fully loaded/
    video.onloadedmetadata = () => {
        canvas.width = video.videoWidth;
        canvas.height = video.videoHeight;
    };

    let renderLocked = false;

// -----------------------------

// Activity -3.3: Initialize FaceDetector constructor with suitable properties and attach it to constant faceDetector variable.
// Hint: https://wicg.github.io/shape-detection-api/#examples
// TODO  


//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

    function render() {
        if (!video.paused) {
            renderLocked = true;

            Promise.all([
// -------------------------------
// Activity -3.4: Detect face using the method from facedetector variable object.
// Hint: https://wicg.github.io/shape-detection-api/#examples
// The method return a Promise object so make sure to attach a catch method and console log the error
//TODO               




//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

            ]).then(([detectedFaces = []]) => {

//The clearRect() method clears the specified pixels within a given rectangle.
                context.clearRect(0, 0, canvas.width, canvas.height);
// The drawImage() method draws an image, canvas, or video onto the canvas.
//The drawImage() method can also draw parts of an image, and/or increase/reduce the image size.
                context.drawImage(video, 0, 0, video.videoWidth, video.videoHeight)

// --------------------------------
//Activity 4.2: - Search about the below Canvas properties and tinker with the below values.
                context.strokeStyle = '#ffeb3b';
                context.fillStyle = '#ffeb3b';
                context.font = '16px Mononoki';
                context.lineWidth = 5;
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


                detectedFaces.forEach((detectedFace) => {

// -------------------------------------
// Activity 4.1:- Draw Boundary Box from the list of detectedFaces.
// Log detectedFaces array and You will find co-ordinates through which you will draw a bounding rectangle in canvas "context"
// Read about how to draw rectangle strokes using the bounding co-ordinates of the detectedFace
// Name the variables as top, left, widtH, height.
// TODO





//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


                    // This line adds a extra text to the bounding box.
                    context.fillText('Face detected', left + 5, top - 8);
                });
                renderLocked = false;
            });
        }
    }

    (function renderLoop() {
        // Read more about requestAnimationFrame and how it helps to render a video.
        requestAnimationFrame(renderLoop);
        if (!renderLocked) {
            render();
        }
    })();
};

// This function displays error if FaceDetection API is not supported on current Browser. 

function displayFallbackMessage() {
    document.querySelector('.fallback-message').classList.remove('hidden');
    document.querySelector('canvas').classList.add('hidden');
}