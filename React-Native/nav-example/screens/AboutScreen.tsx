import {View, Text, Button} from 'react-native';

export default function AboutScreen({navigation}:any) {
    return (<View>
        <Text>About Screen</Text>
        <Button title = "Go to home screen" onPress = {() => navigation.navigate("Home")}/>
    </View>)
}