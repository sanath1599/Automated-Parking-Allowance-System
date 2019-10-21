import requests
import base64
import json
import cv2
import time
cap = cv2.VideoCapture('trial.mp4')
car_cascade = cv2.CascadeClassifier('cars.xml')
while True: 
    # reads frames from a video 
    ret, frames = cap.read() 
      
    # convert to gray scale of each frames 
    gray = cv2.cvtColor(frames, cv2.COLOR_BGR2GRAY) 
      
  
    # Detects cars of different sizes in the input image 
    cars = car_cascade.detectMultiScale(gray, 1.1, 1) 
      
    # To draw a rectangle in each cars 
    for (x,y,w,h) in cars: 
        cv2.rectangle(frames,(x,y),(x+w,y+h),(0,0,255),2)
        cv2.imwrite('image.jpg', frames)
        IMAGE_PATH = 'trial.png'
        SECRET_KEY = 'sk_083bb8412c7e4290f5a85348'

        with open(IMAGE_PATH, 'rb') as image_file:
            img_base64 = base64.b64encode(image_file.read())

        url = 'https://api.openalpr.com/v2/recognize_bytes?recognize_vehicle=1&country=us&secret_key=%s' % (SECRET_KEY)
        r = requests.post(url, data = img_base64)
        json_data = json.loads(r.text)
        print(json.dumps(r.json(), indent=2))

        print(json_data['results'][0]['plate'])
        time.sleep(5)
  
   # Display frames in a window  
cv2.imshow('video2', frames) 
      
cv2.destroyAllWindows() 
