# HTML Hyper Text Markup Language
- Is ***NOT*** a programming language
  - HTML lacks the ability to perform logic
- Markup
- HTML defines the ***Content and structure*** of a web page
- HTML is made up of building blocks called ***tags*** or ***elements***
- When you navigate to a website your web browser is downloading an html file to show you


### Anatomy of an element
- Elements have an opening and closing tag
  - Some elements are self closing
- Elements have attributes
  - tags that add extra information or properties to the element
- Elements are nested but should not overlap
```html
    <!-- traditional tag -->
    <element attr="value">Content</element>

    <!-- selfclosing tag -->
    <selfclose/>

    <!-- nested -->
    <div> 
        <h6>Hello</h6>
        <h6>Hola</h6>
    </div>


    <!-- overlapping tag -->
    <div> 
        <h6>Hello</h6>
        <h6>Hola
    </div>
    </h6>

```
### Common Elements

```html
<!-- Required -->
<!Doctype html>
<html>
  <head></head>
  <body></body>
</html>


<!-- headings -->
<h1>Largest</h1>
<h6>Smallest</h6> 

<!-- text -->
<p></p>
<b></b>
<sub></sub>
<del></del>

<!-- lists -->
<ul></ul>
<ol></ol>
<dl></dl>

<!-- table -->
<table>
  <thead> 
    <tr><th></th></tr>
  </thead>
  <tbody> 
    <tr><td></td></tr>
  </tbody>
</table>

<!-- image -->
<img src="" alt="">
```