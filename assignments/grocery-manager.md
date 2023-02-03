# Grocery Manager++
- Write an applicaiton for managing groceries
  - A user should be able to create groceries
    - Groceries have a name, isEssential and cost
  - A user  should be able to set a budget
  - There should be some warning displayed on the screen when you go over budget
  - A user  can mark items as in-kart
  - Items in-kart can also be removed and the budget refunded
    - The item was in the kart but you decided to put it back
  - A user can sort groceries by cost or whether they are essential or not
    - stretch goal

## Technical Reqirements
- use a reducer for state management
- Write tests for each action in your reducer
- Write at least one test for a display component
  - spec.tsx that tests that the HTML from a display component works correctly
- Work is on github and hosted

<details>
<summary>State Hint</summary>

```TS

export type Grocery ={
    id: number
    name: string 
    cost: number
    isEssential: boolean
}

export type GroceryManagerState = {
    nameInput: string
    costInput: number
    isEssentialInput: boolean

    budget: number
    inKart: Grocery[]
    wanted: Grocery[]
}

```
</details>
