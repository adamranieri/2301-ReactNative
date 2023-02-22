import {View, Text, Linking, Button} from 'react-native';

export default function LinkingExample() {
    return <View>
        <Text>Linking!</Text>

        <Button title = "Open Google" onPress = {() => Linking.openURL("http://espn.com")}/>
        <Button title = "Send Email" onPress = {() => Linking.openURL("mailto: support@exp.io?subject=hello&body=Goodbye")}/>
        <Button title = "Send Text" onPress = {() => Linking.openURL("sms:+1111")}/>
        <Button title = "Open Phone" onPress = {() => Linking.openURL("tel:+1111")}/>

    </View>
}