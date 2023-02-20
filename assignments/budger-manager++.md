# Budget Manager++
- Write an applicaiton for managing a budget 
  - A user should be able to create expenses
    - This means giving the expense a name, a cost and marking if it is essential or not
  - Created expenses are considered unpaid when created
  - A user can mark unpaid expenses as paid
    - There should be two lists or tables 
      - One for paid expenses 
      - one for unpaid expenses
  - expenses that are paid or unpaid can be deleted at anytime
  - The combined cost of all paid and unpaid expenses is shown

#### Bonus 
- Unpaid expenses can be edited after being created
- A user can sort expenses by cost or whether they are essential or not
- A user can set a budget and there should be some warning displayed on the screen when you go over budget


## Technical Reqirements
- use a reducer for state management
- Write tests for each action in your reducer
- Write at least one test for a display component
  - spec.tsx that tests that the HTML from a display component works correctly
- Have at least one instance of passing the dispatch function to a child component
- Work is on github and hosted

<details>
<summary>State Hint</summary>

```TS

export type Expense ={
    id: number
    name: string 
    cost: number
    isEssential: boolean
}

export type BudgetManagerState = {
    nameInput: string
    costInput: number
    isEssentialInput: boolean


    unpaidExpenses: Expense[]
    paidExpenses: Expense[]

    totalCost: number
}

```
</details>
