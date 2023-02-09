# Saga
- Saga is a type of ***redux middleware***
  - Middleware is term indicating that the software does not exist independently
  - It is is designed to slip into existing functionality in another software library
- Saga is built on generator functions
  - These are functions that ***yield*** values rather than ***return*** values
  - When a function yields it stops executing but will resume from where it left off