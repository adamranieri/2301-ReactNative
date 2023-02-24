import {View, Text, Platform, ToastAndroid, Alert, Button} from 'react-native';

export default function PlatformExample() {

    function alertUser() {
        // if we have an android device, let's use the Android-specific Toast feature
        if(Platform.OS === "android") {
            // this will show a toast notification and we pass in short to indicate that we only want it show up for a short time
            ToastAndroid.show("This is a toast message", ToastAndroid.LONG)
        }
        // otherwise, we can just use a normal alert:
        else {
            Alert.alert("This is a normal alert");
            console.log("This is a console.log");
        }
    }

    function showToast() {
        ToastAndroid.showWithGravity(
            'All Your Base Are Belong To Us',
            ToastAndroid.SHORT,
            ToastAndroid.TOP,
          );
    }

    return (<View>
        <Text>Platform Example</Text>
        <Text>{Platform.OS}</Text>
        <Button onPress = {alertUser} title = "Alert/Toast"/>
        <Button onPress={showToast} title = "Toast!"/>
    </View>)
}