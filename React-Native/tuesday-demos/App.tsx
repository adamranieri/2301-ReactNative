import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

import FlatListExample from './Components/FlatListExample';
import SectionListExample from './Components/SectionListExample';
import ButtonExample from './Components/ButtonExample';
import TouchableExample from './Components/TouchableExample';

export default function App() {
  return  <View style={styles.container}>
        {/* <FlatListExample /> */}
        {/* <SectionListExample /> */}
        {/* <ButtonExample /> */}
        <TouchableExample />
      <StatusBar style="auto" />
    </View>
  ;
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
