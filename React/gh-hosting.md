## How to Host React Project on Github Pages
1. From command line, run ```npm install gh-pages```
2. Open up the package.json and add the following in scripts:
```JSON
    "predeploy": "npm run build",
    "deploy": "gh-pages -d build",
```
3. Add the url to your home page at the root level of the JSON object (on the same level as "name", "version",etc.). It will be of the form:
```JSON
"homepage": "https://<github_username>.github.io/<repo_name>
```
4. Here is a [sample](https://github.com/adamranieri/hello/blob/master/package.json) package.json.
5. Commit and push your changes.
6. Run the command 
```
npm run deploy```
```
7. Check out the actions tab of your github repo and you should see the deploy in progress.