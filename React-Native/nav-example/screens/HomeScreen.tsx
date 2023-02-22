import {View, Text, Button} from 'react-native';

// we pass in the navigation prop so we can navigate to a different page
// TODO: replace the any with an actual type
export default function HomeScreen({navigation}:any) {
    return (<View>
        <Text>Home Screen</Text>
        <Text>Make sure to run npm install @react-navigation/native in order to install navigation</Text>
        <Text>Also, npm install @react-navigation/native-stack</Text>

        <Button title = "Go to about Screen" onPress = {()=> navigation.navigate('About')}/>
    </View>)
}