import {View, Text, Button} from 'react-native';
import { Props } from '../types';

export default function AboutScreen({navigation}:Props["about"]) {
    return (<View>
        <Text>About Screen</Text>
        <Button title = "Go to home screen" onPress = {() => navigation.navigate("Home")}/>
    </View>)
}