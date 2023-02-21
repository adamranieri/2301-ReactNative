import {View, Text, FlatList, StyleSheet} from 'react-native';

type Person = {
    id: number,
    name: string
}

export default function FlatListExample() {
    // define some data to pass in:
    let data:Person[] = [];
    for(let i = 0; i < 50; i ++) {
        data.push({
            id: i,
            name: `person ${i+1}`
        });
    }
    console.log(data);

    return (
        <View>
            <Text>Flatlist example!</Text>
            <FlatList data = {data} renderItem = {
                ({item, index}) => (
                    <View>
                        <Text>Id: {item.id}</Text>
                        <Text>Name: {item.name}</Text>
                    </View>
                )

            }/>
        </View>
    )

}