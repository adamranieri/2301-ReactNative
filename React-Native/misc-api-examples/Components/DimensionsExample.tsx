import {View, Text, Dimensions} from 'react-native';
import {useState} from 'react';

export default function DimensionsExample() {
    const [width, setWidth] = useState(Math.round( Dimensions.get("window").width))
    const [height, setHeight] = useState(Math.round( Dimensions.get("window").height))
    return <View>
        {/* <Text>WIdth: {Dimensions.get("window").width}</Text>
        <Text>Height: {Dimensions.get("window").height}</Text> */}
        <Text>Width: {width}</Text>
        <Text>Height: {height}</Text>
        <Text>If turning your phone doesn't change the orientation, you might have to remove the orientation setting in app.json</Text>
    </View>
}