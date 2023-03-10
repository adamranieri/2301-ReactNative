import React from 'react';
import logo from './logo.svg';
import './App.css';
import { getPets, optionsTest } from './requests';
import {useState} from 'react';
import { Pet } from './requests';



function App() {

    const [pets, setPets] = useState<Pet[]>([]);

     async function buttonHandler() {
        // when we click the button, set the state using the results of the request:
        setPets(await getPets());
    }

    // function printSomething() {
    //     console.log("Hello World");
    // }
    
  return (
    <div className="App">

        <button onClick = {buttonHandler}>Get Pets</button>
        <button onClick = {optionsTest}>Options</button>

        {pets.map((pet:Pet) => (
            <div>
                <h1>{pet.name}</h1>
                <h2>{pet.species}</h2>
                <h2>{pet.food}</h2>
                <h2>{pet.id}</h2>
            </div>
        ))}
      
    </div>
  );
}

export default App;
