# CSS Cascading Style Sheets
- Adds aesthetics and styling to a web pag
  - ***Not a programming language***
- Domain Specific Language DSL
  - A lanugage designed for one thing 
    - CSS => Styling web pages
    - SQL => Database managament
- ***Cascade Algorithim***
  - multiple css selectors will apply styling to the same element
  - The algorithim determines what is the ultimate style applied
  - *the most specific css selector wins*

### Anatomy of CSS
- Key value pair pairs called attributes
- Selectors are how you specify what element(s) the CSS styling applies to
  - id
  - tag type
  - css class

```css

selector{attribute:value}
p{background-color:red}


```
### How to add CSS to a web page
1. Apply CSS inline to an element using the `style attribute`
2. You can use the `style tag` in the head to apply styles
3. You can reference and external style sheet using the `link tag`

### Ranieri Easier CSS tips
1. Google Fonts for cool fonts
2. Sorting things out on a web page is very difficult
   1. CSS grid
   2. Flex box