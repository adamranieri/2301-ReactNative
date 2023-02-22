import {View, Text, Button} from 'react-native';
import { Props } from '../types';


export default function ProfileScreen({navigation, route}: Props["profile"]) {
    console.log(route.params.userId)
    return (<View>
        <Text>Profile Screen</Text>
        <Text>This profile has userid: {route.params.userId}</Text>
        <Button title = "Go to home screen" onPress = {() => navigation.navigate("Home")}/>
    </View>)
}