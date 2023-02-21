import {View, Text, Button, Switch, Alert} from 'react-native';
import { useState } from 'react';

export default function ButtonExample() {
    // show indicates whether or not we should show a certain element:
    const [show, setShow] = useState(false);

    function onPressHandler() {
        console.log("Button pressed!");
        // Alert takes in a title, description, and a list of buttons
        // Each button has some text, and a callback function that is triggered when that button is pressed
        Alert.alert("Alert title", "Button is pressed", [
            {
                text: "Success",
                onPress: () => {console.log("Success!")}
            },{
                text: "Faliure",
                onPress: () => {console.log("Failure")}
            }
        ]);
    }
    return (
        <View>
            <Text>Button Example</Text>
            <Button onPress={onPressHandler} title = "Press Me" />

            <Switch 
                onValueChange= {() => {setShow(!show)}}
                value = {show} 
                />
            
            {show ? <Text>Scheduled</Text> : <Text>Cancelled</Text>}
            {String(show)}
        </View>
    )
}