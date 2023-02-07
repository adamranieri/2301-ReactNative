# Graph QL 

- Graph QL is based around this system of **types**
- schema.gql is the main documentation for ANY graphql API
- Unlike REST the status codes **SHOULD NOT** be used as a reflection of success or failure

## Types

### Query
- A Graph QL request that serches for data
- This query does not alter the data in anyway
- You request what you want. Nothing more, nothing less
- What making a query looks like
```gql
query AllPlayerNames{
  players{ 
    fname
    lname
  }
}
```
- In the schema.gql
```gql
type Query {
  players(lname: String = null): [BaksetballPlayer!]!
}
```

- Queries *might* have inputs to aid in the query
```gql
query AllPlayerNames {
  players(lname:"Swoop") {
    fname
    lname
    careerStats{
      shotAttempts
      madeBaskets
    }
  }
}
```

### Mutation
- A Graph QL request that *mutates* or alters the data
- Unlike in REST, these mutations are specifically programmed and limit how you interact with the data.

```gql
mutation AddAdam{
	addPlayer(input:{
    fname:"Adam"
    lname:"Ranieri"
    heightInches:72
    weightLbs:170
  }){
    playerId
  }
}
```
- in the schema.gql
```gql
type Mutation {
  mergeStats(input: StatsInput!): BaksetballPlayerPlayerDoesNotExist!
  addPlayer(input: NewPlayerInput!): BaksetballPlayer!
}
```


### Object type
- When you query data you are getting Object types
```gql
type BaksetballPlayer {
  playerId: Int!
  fname: String!
  lname: String!
  bioMetrics: Biometric!
  careerStats: Stats!
}
```

### Input
- Objects passed as an input paramater
```gql
input NewPlayerInput {
  fname: String!
  lname: String!
  heightInches: Int!
  weightLbs: Int!
}

```

### Union
- When you have a query or mutation that could return different types
```gql

mutation UpdateAdamStats{
  
  mergeStats(input:{
    playerId: 98987
    rebounds:5
  }){
    ...on BaksetballPlayer{
      lname
      careerStats{
        shotAttempts
        madeBaskets
        rebounds
        assists
        blocks
      }
    }
    
    ...on PlayerDoesNotExist{
      playerId
      message
    }
  }
}
```

### Scalar
- Primitive value types in gql
  - String
  - Float 
  - Int
  - Boolean
  - ID (unique identifier)
```gql
input NewPlayerInput {
  fname: String!
  lname: String!
  heightInches: Int!
  weightLbs: Int!
}
```

### Type Modifiers
- ! means that the field is non-optional
- [] means that the field is an array
- = is used to indicate the field will alaways be there but there is a default value if not provided
```gql
type Query {
  players(lname: String = null): [BaksetballPlayer!]!
}

input StatsInput {
  playerId: Int!
  shotAttempts: Int! = 0
  madeBaskets: Int! = 0
  rebounds: Int! = 0
  assists: Int! = 0
  blocks: Int! = 0
}
```

## Query/Mutation Writing Tips

### Variables
- Allows you to reuse a query or mutation but with different data

```gql
query PlayersByLname($lnameToSearch:String){
  players(lname:$lnameToSearch){
    fname
    lname
    bioMetrics{
      heightInches
      weightLbs
  	}
  }
}

variables
{
  "lnameToSearch":"Nevapass"
}
```
### Fragments
- A shorthand for simplying requested fields
```gql
query AllPlayerNames {
  players{
    fname
    lname
    ...biodata
    ...stats
  }
}

fragment biodata on BaksetballPlayer{
  bioMetrics{
    heightInches
    weightLbs
  }
}

fragment stats on BaksetballPlayer{
  careerStats{
    blocks
    assists
    shotAttempts
    madeBaskets
    rebounds
  }
}

```

### Alias
- Allows you to make multiple queries or mutations and give the result a specific name.
```gql
query PlayerBioMetricsPlayerStats{
  
  bioinfo: players{
    bioMetrics{
      weightLbs
      heightInches
    }
  }
  
  shootinginfo: players{
    careerStats{
      madeBaskets
      shotAttempts
    }
  }
}


```