import {View, Text,TextInput ,StyleSheet, Button} from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';
import {useState} from 'react';

export default function AsyncStorageExample() {
    const [username, setUsername] = useState<string>('')

    // setInterval takes in a callback function and a time in miliseconds and it executes that function in intervals
    setInterval(() => {
        console.log("Hello")
    }, 1000)

    async function login() {
        // call the set item to set the username to the storage:
        await AsyncStorage.setItem('username', username);
    }

    async function getUsername() {
        // getItem using the key, return a promise so we can await
        let usernameFromStorage = await AsyncStorage.getItem('username') ;
        // if username is null, just assign it to empty string
        if (!usernameFromStorage) usernameFromStorage = '';
        setUsername(usernameFromStorage);
    }

   async  function clearState() {
        await AsyncStorage.clear();
    }

    return (<View>
        <Text>Async Storage Example!</Text>
        <Text>npx expo install @react-native-async-storage/async-storage</Text>
        <TextInput value = {username} style = {styles.input} onChangeText={setUsername} />
       <Text>{username}</Text>
       <Button title = "Login" onPress={login}/>
       <Button title = 'Populate state' onPress={getUsername}/>
       <Button title = "Clear State" onPress={clearState}/>


    </View>)
}

const styles = StyleSheet.create({
    input: {
        borderWidth: 1,
        padding: 3
    }
})