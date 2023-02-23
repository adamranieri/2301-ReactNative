import { ENDPOINT } from "./uri"


export type Item = {
    name: string,
    description: string,
    image: string
    reviews: Review []
}

export type Review = {
    title:string,
    rating: number
}

// set up a function to call the GraphQL query:
export async function getAllItems(): Promise<Item[]> {
    const query = `
    query getItems {
        items {
          name
          description
          image
          reviews {
            title
            rating
          }
        }
      }
    `

    const body = JSON.stringify({query});
    const httpResponse = await fetch(ENDPOINT, {method: "POST", body, headers: {"Content-Type": "application/json"}});
    const responseBody = await httpResponse.json();
    console.log(responseBody);
    const items: Item[] = responseBody.data.items;
    return items;
}