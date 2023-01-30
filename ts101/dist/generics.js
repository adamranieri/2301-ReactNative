var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
const names = []; // this array only holds strings
names.push("Adam");
names.push("Rory");
// TS has two syntaxes for array generics
const temps = [10, 30, 42];
function getRandomJoke() {
    return __awaiter(this, void 0, void 0, function* () {
        const httpResponse = yield fetch("https://official-joke-api.appspot.com/random_joke");
        const joke = yield httpResponse.json();
        return joke; // asynchronous functions always return a promise
    });
}
