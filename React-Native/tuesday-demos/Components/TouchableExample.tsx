import {View, Text, StyleSheet, Button, TouchableHighlight} from 'react-native';

export default function TouchableExample() {
    function onPressHandler () {
        console.log("Button pressed")
    }

    function onLongPressHandler() {
        console.log("Button long pressed");
    }


    return <View>
        <Button title = "Button"/>

        <TouchableHighlight onPress = {onPressHandler}>
            <View>
                <Text>This is the touchable highlight!</Text>
            </View>

        </TouchableHighlight>

    </View>

}

const styles = StyleSheet.create({
    touchable : {
        fontSize: 20,
        background: 'blue'
    }

})