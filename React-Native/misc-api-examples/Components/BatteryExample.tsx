import {View, Text, Button} from 'react-native';
import {useState, useEffect} from 'react';
import * as Battery from 'expo-battery';

export default function BatteryExample() {
    const [batteryLevel, setBatteryLevel] = useState<number>(0);

    async function getBatteryLevel() {
        // we call the async function to get the batter level:
        const bLevel = await(Battery.getBatteryLevelAsync()) * 100;
        console.log(bLevel);
        // update the state:
        setBatteryLevel(Math.round(bLevel));
    }

    useEffect(() => {
        // Upon first render, get the battery level and update state:
        getBatteryLevel();
        const subscription = Battery.addBatteryLevelListener(({batteryLevel}) => {
            console.log("Battery level changing!");
            // whenever the battery level changes, we set the state:
            setBatteryLevel(batteryLevel);
            getBatteryLevel();
        })
        return subscription?.remove();
    })

    return <View>
        <Text>Installation: expo install expo-battery</Text>
        <Text>Batter Level: {batteryLevel}</Text>
        <Text>Conditionall render a batery status message:</Text>
        {batteryLevel > 50 ? <Text>Battery Level Good!</Text> : <Text>Battery Level Not good</Text>}
        <Button title = "Get Battery Level" onPress = {getBatteryLevel}/>
    </View>

}