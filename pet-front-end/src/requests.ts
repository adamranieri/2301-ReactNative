// keep in mind this Pet type matches what we have set up in Spring app:
export type Pet = {
    id: number,
    name: string,
    species: string,
    food: string
}

// once we deploy this app, we can change the url in one place:
export const url = "http://127.0.0.1:8080";

export async function getPets():Promise<Pet[]> {
    const response = await (await (fetch(`${url}/pets`))).json()
    return response;

}