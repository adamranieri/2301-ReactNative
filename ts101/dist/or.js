// | means or
function divide(num1, num2) {
    if (num2 === 0) {
        return "Cannot divide by zero";
    }
    return num1 / num2;
}
const result = divide(100, 2);
if (typeof result === "string") {
}
