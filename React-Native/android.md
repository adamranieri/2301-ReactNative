## Android
- One of 2 main platforms for mobile devies and apps
    - The other iOS which is used by Apple products
- Luckily, with React Native, we usually develop code that is universal to both Android and iOS and React Native and Expo do the heavy lifting of building our Android apps

### Android Specific Features
- BackHandler - all Androids have a back functionality, and this component lets you specify how the back functionality is handled
- DrawerLayoutAndroid - usually used for navigation, it is a side bar that can slide in and out and contains content
- PermissionsAndroid - provides access to accessing the device's permissions
    - Permissions include things like accessing camera, camera roll, microphone
- ToastAndroid - a notification that pops up
- TouchableNativeFeedback - another type of touchable that has additional functionality such as a ripple effect when active


### How do we develop for Android if we have an iphone?
- We can install Android Studio which contains:
    - IDE - Integrated Development Environment
        - Code editor, interface to run/build/test, etc.
        - The UI is based on and virtually identical to intelliJ
    - Ability to emulate devices
        - A list of devices and you can run them after installing the required dependencies
        - You get an emulated Android device on your computer
            - This is helpful for tesitng Android-specific features
            - Also testing mobile-specific features from a computer/desktop
        - Regarding expo, as long as we have an Android emulator running, then we press the "a" key when running an expo project and it should open up automatically

### How to install + Set Up Emulator:
- Visit https://developer.android.com/studio to download
    - Wait 5 years
- Run the install file
- Make sure to install studio and virtual device
- Leave the other install settings as default, wait, and click Finish
- On the Landing Screen for Android Studio, you should find "Virtual Device Manager"
    - You might have to have already opened a project before for the options to show up
    - Alternatievely, we can open the device manager while we have a project open by clicking on the right-hand sidebar
- From this menu, we click create, select a device and an image
    - The image might take a bit of time to install
- 