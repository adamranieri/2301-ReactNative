import {View, Text, Dimensions, useWindowDimensions} from 'react-native';
import {useState, useEffect} from 'react';

export default function DimensionsExample() {
    const [width_, setWidth] = useState(Math.round( Dimensions.get("window").width))
    const [height_, setHeight] = useState(Math.round( Dimensions.get("window").height))
    const [orientation, setOrientation] = useState("PORTRAIT");
    // We can use the useWindowDimensions hook to auto update our width/height
    const {height, width} = useWindowDimensions();

    useEffect(() => {
        console.log("use effect");
        // add an event listener to trigger whenever the dimensions are changed (ex: when we rotate the device)
        const subscription = Dimensions.addEventListener(
            'change',
            ({window, screen}) => {
            setWidth(window.width);
            setHeight(window.height);
            if(window.width > window.height) {
                setOrientation("LANDSCAPE");
            }
            else {
                setOrientation("PORTRAIT");
            }
            },
          );
          // when we unmount, remove the subscription:
          return () => subscription?.remove();

    }, [])

    return <View>
        {/* <Text>WIdth: {Dimensions.get("window").width}</Text>
        <Text>Height: {Dimensions.get("window").height}</Text> */}
        <Text>Width: {width_}</Text>
        <Text>Height: {height_}</Text>
        <Text>Width using hook: {width}</Text>
        <Text>Height using hook: {height}</Text>
        <Text>{orientation}</Text>
        <Text>If turning your phone doesn't change the orientation, you might have to remove the orientation setting in app.json</Text>
    </View>
}