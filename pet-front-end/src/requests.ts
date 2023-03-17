// keep in mind this Pet type matches what we have set up in Spring app:
export type Pet = {
    id: number,
    name: string,
    species: string,
    food: string
}

// once we deploy this app, we can change the url in one place:
export const url = "http://35.153.192.58:8080";

export async function getPets():Promise<Pet[]> {
    const response = await (await (fetch(`${url}/pets`))).json()
    return response;

}

export async function optionsTest() {
    const response = await fetch('http://127.0.0.1:8080', {
    method: "OPTIONS", // *GET, POST, PUT, DELETE, etc.
    headers: {
      "Content-Type": "application/json",
      // 'Content-Type': 'application/x-www-form-urlencoded',
    },
  });
  console.log(response);
}