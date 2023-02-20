import {View, ScrollView, Image, Text, StyleSheet, SafeAreaView} from 'react-native';
import { styles } from '../App';
import React from 'react';
import SubImage from './SubImage';
import TextInputExample from './TextInputExample';

const uris: string[] = [
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-michael-scott.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-dwight-schrute.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-pam-beesly.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-jim-halpert.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-kelly-kapoor.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-phyllis-vance.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-andy-bernard.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-darryl-philbin.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-oscar-nunez.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-angela-martin.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-ryan-howard.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70',
    'https://roost.nbcuni.com/bin/viewasset.html/content/dam/Peacock/Landing-Pages/2-0-design/the-office/cast-the-office-erin-hannon.jpg/_jcr_content/renditions/original.JPEG?downsize=1200:*&output-quality=70'
]

export default function CoreComponents () {
    return (
        <View>
            <Text>This is the image example:</Text>
            {/* <Image style = {styles.image} source={{uri:"https://upload.wikimedia.org/wikipedia/en/thumb/3/33/Patrick_Star.svg/1200px-Patrick_Star.svg.png"}} /> */}
            <SubImage uri = 'https://upload.wikimedia.org/wikipedia/en/thumb/3/33/Patrick_Star.svg/1200px-Patrick_Star.svg.png' key = 'https://upload.wikimedia.org/wikipedia/en/thumb/3/33/Patrick_Star.svg/1200px-Patrick_Star.svg.png'/>
            <Image style = {styles.image} resizeMode = 'contain' source= {require('../assets/brian.png')} />

            <ScrollView contentContainerStyle = {styles2.imagesContainer}>
                {uris.map(uri => (
                    <SubImage uri = {uri} key = {uri}/>
                ))}
            </ScrollView>

            <Text>Input Example</Text>
            <TextInputExample/>

        </View>
    )
}


const styles2 = StyleSheet.create({
    imagesContainer: {
        flexDirection: 'row',
        // borderWidth: 1,
        flexWrap: 'wrap',
        justifyContent: 'center'
    }
})

// const styles = StyleSheet.create({
//     image: {
//         width: 200,
//         height: 200, 
//         marginTop: 100
//     }
// })