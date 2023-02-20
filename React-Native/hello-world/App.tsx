import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import CoreComponents from './Components/CoreComponents';
import React from 'react';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style = {styles.text}>Hello World!</Text>
      <Text style = {styles.text}>Another Text Box</Text>
      <CoreComponents/>

      <StatusBar style="auto" />
    </View>
  );
}

export const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    color: '#ff4a3d'
  },
  image: {
        width: 200,
        height: 200, 
        marginTop: 100
    }
});
