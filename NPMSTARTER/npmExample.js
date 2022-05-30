console.log("Hello world");

//install few packages to use them
//Download package allowing us to (all of the following to be covered in Java)
//1) connect/map to our database
//2) develop API endpoints (for our fetch method)
//3) Login authentication

//complete-randomer
//perform some random number and character and name, store into database
const { table } = require('table');
const randomer = require('complete-randomer');
var prompt = require('prompt-sync')();

//1) Generate a ranodm number between 1-100
console.log(randomer.NUMBER.INTEGER());

//2) Example: generate a random password generator
console.log(randomer.STRING.GIBBERISH(15));

console.log(randomer.STRING.NAMES(20));

console.log(randomer.QUOTES.LIST(10));

//create a table to show error
let checkApi =["Get Info", "Read data from database", "success","database not found"];

//2 Dimensional Array
const data = [
    [checkApi[0], checkApi[1], checkApi[2],checkApi[3]],
    ['1A', '1B', '1C', '1D'],
    ['2A', '2B', '2C','2D']

];
console.log(table(data));

//print out 'success'
//first array index [] represent the row
//second array index [] represent the column
console.log(data[0][2]);

//print out 2D
console.log(data[2][3]);

// know how a 2D array works
//1) write a function to create 3 rows by 3 columns and console out
/*
output: 
[]
[x, x, x],
[x, x, x],
[x, x, x]
]
*/

let arr = [];   //create ID empty array
const row = 4;
const col = 4;
let getRow = 0;
let getCol = 0;
const createEmptyArray = () => {
    for (let i=0; i<row; i++)
    {
        arr[i] = [];

        for (let j=0; j<col; j++)
        {
            if (j%2 == 0) {arr[i][j] = "X";}
            else {arr[i][j] = "0";}
        }
    }
}
createEmptyArray();

//print in table form


console.log(table(arr));

/*
Output:
[
["X","O","X","O"],
["X","O","X","O"],
["X","O","X","O"]
]
*/
//put the synbol "A" randomyl in the 2D array that we have created
const placeA = () => {
    //an object provided by built-in API math, random().....

    if (getCol%2 == 0) {arr[getRow][getCol] = "X";}
    else {arr[getRow][getCol] = "0";}

     //An object provide by built-in API Math.random().........
    getRow = Math.floor(Math.random() * row); // between 0-3
    getCol = Math.floor(Math.random() * col); 

    arr[getRow][getCol] = "A";
}
placeA();
console.log(table(arr));

//Get input from user, if user key in the 'q' key, change the position of A randomly

var getKey = prompt('Enter "q" to change the position of A.');

if (getKey == 'q') 
{
    placeA();
    console.log(table(arr));
}