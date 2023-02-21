import {View, Text, StyleSheet, Button, TouchableHighlight, 
    TouchableOpacity, TouchableWithoutFeedback, Vibration} from 'react-native';

export default function TouchableExample() {
    function onPressHandler () {
        console.log("Button pressed")
        // vibrate can take in a number which is how long in miliseconds to vibrate the device:
        Vibration.vibrate(1000); // 1 seconds
        // vibrate can also take in an array of numbers indicating pause time, vibate time, pause time, vibrate time, etc.
        // ex: pause for 1 second, vibrate for 2, pause 1, vibrate 3
        Vibration.vibrate([1000, 2000, 1000, 3000])
        Vibration.vibrate(10000); // 10 seconds
    }

    function onLongPressHandler() {
        console.log("Button long pressed");
        Vibration.cancel();
    }


    return <View>
        <Button title = "Button"/>

        <TouchableHighlight onPress = {onPressHandler} onLongPress = {onLongPressHandler}>
            <View style = {styles.touchableView}>
                <Text style = {styles.touchableText}>This is the touchable highlight!</Text>
            </View>
        </TouchableHighlight>

        <TouchableOpacity onPress = {onPressHandler}>
        <View style = {styles.touchableView}>
                <Text style = {styles.touchableText}>This is the touchable opactiy!</Text>
            </View>
        </TouchableOpacity>

        <TouchableWithoutFeedback onPress = {onPressHandler}>
        <View style = {styles.touchableView}>
                <Text style = {styles.touchableText}>This is the touchable without feedback</Text>
            </View>
        </TouchableWithoutFeedback>


    </View>

}

const styles = StyleSheet.create({
    touchableView : {
        backgroundColor: '#b8f5c8',
        marginBottom: 10,
    },
    touchableText : {
        fontSize: 20,
    }

})