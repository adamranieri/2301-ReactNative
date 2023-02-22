import {View, Text, Button} from 'react-native';
import { Props } from '../types';

const ids:number[] = [1,2,3,4,5,6,7,8];


// we pass in the navigation prop so we can navigate to a different page
// TODO: replace the any with an actual type
export default function HomeScreen({navigation}:Props["home"]) {
    return (<View>
        <Text>Home Screen</Text>
        <Text>Make sure to run npm install @react-navigation/native in order to install navigation</Text>
        <Text>Also, npm install @react-navigation/native-stack</Text>

        <Button title = "Go to Linking example" onPress = {() => navigation.navigate("LinkingExample")}/>
        <Button title = "Go to about Screen" onPress = {()=> navigation.navigate('About')}/>
        {/* When we press this button, we navigate to the Profile page and pass in 45 as a prop: */}
        <Button title = "Go to Profile Screen" onPress = {() => navigation.navigate("Profile", {userId: 45})}/>
        {/* <Link to = "/profile/45"/> */}

        {ids.map(id => (
            <Button key = {id}
            title = {`Profile ${id}`}
            onPress = {() => navigation.navigate("Profile", {userId: id})}
            />
        ))}
    </View>)
}