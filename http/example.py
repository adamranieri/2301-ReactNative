import json # Python as part of the standard library has support for parsing and creating JSONs
tim = json.loads('{"fname":"Tim", "lname":"Tebow", "jersey":15, "isRetired":true}')
print(tim)
print(tim["lname"])