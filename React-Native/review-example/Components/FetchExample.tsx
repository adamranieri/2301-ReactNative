import {View, Text, Image, StyleSheet, ScrollView} from 'react-native';
import {useState, useEffect} from 'react';

import { Item, getAllItems } from '../API/requests';

export default function FetchExample() {
    const [items, setItems] = useState<Item[]>([]);

    useEffect(() => {
        getAllItems()
        // because getAllITems is async, returns a promise, so we use the .then function to 
        // take the resolved value and assign it to the state
        // .then takes a callback function and says "execute this when the promise is resolved"
        .then(res => {
            console.log(res);
            setItems(res);
        })
        .catch(err => {
            console.error(err);
        })
    }, [])

    return <ScrollView>
        <Text>Fetch Example</Text>
        <Text>When trying to fetch our local graphQL server, we get "Network request failed"</Text>
        <Text>Solution: Use Ngrok to set up a public endpoint to accept our requests</Text>
        {items.map(item => (
            <View>
                <Text>{item.name}</Text>
                <Text>{item.description}</Text>
                <Image style = {styles.image} source={{uri: item.image}}/>
            </View>
        ))}
    </ScrollView>

}

const styles = StyleSheet.create({
    constainer: {
        borderWidth: 1,
        marginBottom: 10
    },
    image: {
        width: 100,
        height: 100
    }
})