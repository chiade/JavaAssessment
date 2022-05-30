//calculator MOdule to perfom a simple calculation

const sum = (num1, num2) => {
    return num1 + num2;
    
}
const subtract = (num1, num2) => {
    return num1 - num2;
}

const multiply = (num1, num2) => {
    return num1 * num2;
}
const division = (num1, num2) => {
    return num1 / num2;
}

module.exports = {sum, subtract, multiply, division};
