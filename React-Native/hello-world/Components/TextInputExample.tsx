import {View, Text, TextInput, StyleSheet} from 'react-native';
import {useState} from 'react';

export default function TextInputExample() {
    // set up state to keep track of our name:
    const [name, setName] = useState<string>('');


    return <View>

        {/* <TextInput value = {name} onChangeText = {(newText:string) => setName(newText)} style = {styles.input}/> */}
        <TextInput value = {name} onChangeText = {setName} style = {styles.input}/> 



        <Text>Welcome, {name}</Text>

    </View>
}

const styles = StyleSheet.create({
    input : {
        borderWidth: 1,
        width: 200,
        margin: 'auto'
    }
})