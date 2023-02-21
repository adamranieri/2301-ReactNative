import {Text, View, StyleSheet, SectionList} from 'react-native';

type Section = {
    title: string,
    data: string[]
}

export default function SectionListExample() {
    const DATA:Section[] = [
        {
            title: 'Star Wars',
            data: ['A new Hope', 'Empire Strikes Back', 'Return of the Jedi', 'Phantom Menace', 'The Force Awakens']
        },
         {
            title: 'Lord of the Rings',
            data: ['The Fellowship of the Rings', 'The Two Towers', 'the Return of the King']
         },
         {
             title: 'Spider-Man',
             data: ['Homecoming', 'Far From Home', 'No Way Home']
         }

    ]

    return <View>
        <SectionList sections = {DATA} 
        renderItem = {
            ({item}) => (
                <Text style = {styles.data}>{item}</Text>
            )
        }
        renderSectionHeader = {
            ( {section: {title}} ) => (
                <Text style = {styles.header}>{title}</Text>
            )}
        />
    </View>

}

const styles = StyleSheet.create({
    header: {
        fontSize: 32
    },
    data: {
        backgroundColor: '#f9c2ff',
        // what's between the content of the element and the border
        padding: 20,
        // margin is outside of the border
        marginVertical: 8
    }
})