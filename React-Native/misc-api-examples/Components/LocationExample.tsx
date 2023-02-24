import {View, Text} from 'react-native';
import {useState, useEffect} from 'react';
import * as Location from 'expo-location';
import { LocationObject } from 'expo-location';

type LatLong = {
    latitude: number,
    longitude: number
}

const eiffel:LatLong = {
    latitude: 48.858093,
    longitude: 2.294694
}

function distance(myLocation:LatLong, target:LatLong) {
    const R = 6371e3; // metres
    const φ1 = myLocation.latitude * Math.PI/180; // φ, λ in radians
    const φ2 = target.latitude * Math.PI/180;
    const Δφ = (target.latitude-myLocation.latitude) * Math.PI/180;
    const Δλ = (target.longitude-myLocation.longitude) * Math.PI/180;

    const a = Math.sin(Δφ/2) * Math.sin(Δφ/2) +
            Math.cos(φ1) * Math.cos(φ2) *
            Math.sin(Δλ/2) * Math.sin(Δλ/2);
    const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

    const d = R * c; // in metres
    return d/1000; // return km
}



export default function LocationExample() {
    const [errMsg, setErrMsg] = useState('');
    const[location, setLocation] = useState<LocationObject | undefined>(undefined);
    useEffect(() => {
        (async () => {
            // request permissions to access the device's location:
            let {status} = await Location.requestForegroundPermissionsAsync();
            if(status !== "granted") {
                setErrMsg("Permissions required for location");
                return;
            }
            else {
                // get the location:
                let location:LocationObject = await Location.getCurrentPositionAsync({});
                setLocation(location);
            }
        })();
    }, [location, errMsg])

    // if location not defined, return some placeholder text:
    if(!location) return <Text>Loading or error</Text>
    return <View>
        <Text>Location Example</Text>
        <Text>Distance to eiffle tower: {distance({longitude: location.coords.longitude, latitude: location.coords.latitude}, eiffel)}</Text>
        <Text>{errMsg}</Text>

    </View>
}