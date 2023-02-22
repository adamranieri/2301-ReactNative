## Prerequisites
- Have Node installed
- Have expo cli installed globally: ```npm install -g expo-cli```

## Steps
1. Create project: ```npx create-expo-app my-app```
    - Alternatively, use a template ```npx create-expo-app --template```
    - alternatively ```expo init```
        - You will be prompted to pick a template (typescript, navigation, etc.) and give a project name
2. Run the project ```npx expo start```
3. Press "w" to open in web or scan QR code from phone
    - May need to install webpack dependencies. If so, it will show you the commands needed to install
    - To access from phone, make sure on some network as computer and have expo go app installed on phone
4. If you receive an error about digital envelope routine unsupported, follow these steps and try starting app from CMD/terminal outside of VS code:
    - ```set NODE_OPTIONS=--openssl-legacy-provider``` for Windows Command Prompt or 
    - ```$env:NODE_OPTIONS = "--openssl-legacy-provider"``` for Windows Powershell
    - ```export NODE_OPTIONS=--openssl-legacy-provider``` for Mac
5. To add Typescript to existing project (only if you do NOT have Typescript):
    - ```npm install -D @tsconfig/react-native @types/jest @types/react @types/react-test-renderer typescript @types/react-native@~0.70.6```


npx expo install @expo/webpack-config@^0.17.2