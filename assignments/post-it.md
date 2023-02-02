# Post-it
- Create a react app that makes post-it notes using useReducer
- IT allows a user to add notes one at a time
- The user can clear all notes in a single button press
- A note is not added unless it is at least 3 character long
- Put code into github and host
- WRITE TESTS FOR YOUR REDUCER FUNCTION!!!!
  - IMPORTANT

### Bonus
- Add the ability to delete a single note

<details>
<summary>State Hint</summary>

```TS
export type PostItState = {
    currentNote: string, // sync this value to a input field in the component
    allNotes: string[] 
}
```
</details>


<details>
<summary>Actions Hint</summary>

```TS
export type SetCurrentNoteAction = {type:"SET_CURRENT_NOTE", payload:string};
export type AddNoteAction = {type:"ADD_NOTE"};
export type ClearNotesAction = {type:"CLEAR_NOTES"};
export type PostItAction = SetCurrentNoteAction |  AddNoteAction | ClearNotesAction
```
</details>

