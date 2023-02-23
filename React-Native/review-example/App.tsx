import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

import FetchExample from './Components/FetchExample';

export default function App() {
  return (
    <View style={styles.container}>
      <FetchExample />
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
