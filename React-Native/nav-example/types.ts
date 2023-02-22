// The purpose of this file is to set up and declare what our screens are going to be and what their props are:

// define the props for each screen:
export type RootStackParamList = {
    // use undefined to not take in any props
    Home: undefined,
    About: undefined,

    // the profile screen takes in a userId which is a number
    Profile: {userId: number}
}