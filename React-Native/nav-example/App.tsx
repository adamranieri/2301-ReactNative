import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import {createNativeStackNavigator} from '@react-navigation/native-stack'
import { RootStackParamList } from './types';
import {NavigationContainer} from '@react-navigation/native';

// import our screens
import HomeScreen from './screens/HomeScreen';
import AboutScreen from './screens/AboutScreen';
import ProfileScreen from './screens/ProfileScreen';
import LinkingExample from './screens/LinkingExample';

// create this Stack variable based on our param list that we made in types
const Stack = createNativeStackNavigator<RootStackParamList>();

export default function App() {
  return (
   <NavigationContainer>
        {/* Within this navigator, we set up our screens: */}
        <Stack.Navigator initialRouteName='Home'>
            <Stack.Screen 
                name = "Home"
                component={HomeScreen}
                />
                <Stack.Screen
                name = "About"
                component={AboutScreen}/>
                <Stack.Screen
                name = "Profile"
                component={ProfileScreen}/>
                <Stack.Screen name = "LinkingExample"
                component={LinkingExample}/>
        </Stack.Navigator>

   </NavigationContainer>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});