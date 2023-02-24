import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

import PlatformExample from './Components/PlatformExample';
import DimensionsExample from './Components/DimensionsExample';
import BatteryExample from './Components/BatteryExample';
import LocationExample from './Components/LocationExample';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Open up App.tsx to start working on your app!</Text>
      {/* <PlatformExample/> */}
      {/* <DimensionsExample /> */}
      {/* <BatteryExample /> */}
      <LocationExample />
    </View>
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
