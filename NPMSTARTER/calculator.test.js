
//This is for Jest testing. Jest module is inside the node_module folder
//const myCalculator = require("./calculator"); 
// if need to utilize something outside and inside node_modules, use ./

const { sum} = require("./calculator"); //if need only 1 function

//timeout
test('add 2 + 3 is 5', () => {
    expect(myCalculator.sum(2,3)).toBe(5);
});

test('subtract 4 - 2 is 2', () => {
    expect(myCalculator.subtract(4,2)).toBe(2);
});

test('multiply 4 * 2 is 8', () => {
    expect(myCalculator.multiply(4,2)).toBe(8);
});
test('division 4 / 2 is 2', () => {
    expect(myCalculator.division(4,2)).toBe(2);
});