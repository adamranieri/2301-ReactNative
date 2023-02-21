# React Native
- Mobile Apps
- Learn Once Write Anywhere

## Alternatives to React Native
- Writing web pages to look good on a mobile device
- We can apply CSS to make a web page look different if it's on a mobile device vs a Desktop
- Limitations:
    - It's harder to account all screen sizes
    - Certain features/aspects (handling presses/touches, camera, accessing external apps) are specific to mobile apps and a vanilla HTML page 
    - Web pages require some internet connection to connect to whereas apps can be downloaded and used without internet

## Why React Native?
- We already know React so we know all the state management topics which will translate over easier
- One solution for writing Android and iOS

## Expo
- Project management tool for React Native
- Manage dependencies, build processes
- Examples:
    - Expo CLI (Command Line Interface) 
        - ```npx create-expo-app app-name``` - helps us create/initialize apps
        - ```npx expo start``` - starts the app
        - ```npx expo login``` - login to your expo account
        - ```npx expo run:ios``` - run on ios device
        - ```npx expo run:android``` - run on android device
- Flow:
    - Create your app using the create-expo-app command
    - Edit the app, make changes, add components
    - Start the app, we get a few different options
        - QR code - if we have the expo go app on our mobile device, we can scan the QR code and access the app from our device
            - Makes it easy/possible to test out phone-specific features
        - Opening it in web browser
            - Hitting the "w" key opens up the app in your browser
            - Chrome developer tools we can simulate the look of a device
                - Toggle Device Toolbar (Ctrl Shift M)
        - Running the device on android/ios
            - If we have a virtual emulator of an android running, it should open the app on that virtual device

### Getting started with Expo:
- Install the CLI:
    - ```npm install -g expo-cli```
- Create and run the app:
    - ```npx create-expo-app hello-world```
    - ```cd hello-world```
    - ```npx expo start``
- Open it on web:
    - While the expo app is running, press "w"
    - We might have to install dependencies:
        - ```npx expo install react-native-web@~0.18.9 react-dom@18.1.0 @expo/webpack-config@^0.17.2```


### Trouble-Shooting
- If you're setting up the app on your phone, using the expo Go app
    - Make sure you're on the same network as the device that you're running the app from
    - "Something went wrong. Network Response Timed Out"
    - https://ntalam.com/2022/01/30/expo-network-response-time-out-error/
- digital envelope routines::unsupported
    - If you get an error message about digital envelope routine unsupported, run this command:
    - ```set NODE_OPTIONS=--openssl-legacy-provider``` for Windows or
    - ```export NODE_OPTIONS=--openssl-legacy-provider``` for Mac

## TypeScript
- Installing some dependencies 
    - ```npm install -D @tsconfig/react-native @types/jest @types/react @types/react-test-renderer typescript @types/react-native@~0.70.6```
- Change our App.js to be App.tsx
- Want to include `import React from 'react'` at the top of our .tsx files
- For every new component, we want to give the extension .tsx



