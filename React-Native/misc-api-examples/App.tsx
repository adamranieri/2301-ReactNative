import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

import PlatformExample from './Components/PlatformExample';
import DimensionsExample from './Components/DimensionsExample';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Open up App.tsx to start working on your app!</Text>
      {/* <PlatformExample/> */}
      <DimensionsExample />
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
