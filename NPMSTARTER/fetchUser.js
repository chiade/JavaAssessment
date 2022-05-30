//User is a Class object, once we did a fetch from the API. store the data that was fetched from the API to an instance of User object. 

//running the fecth method in Node.js server envrionment, node-fetch package is required to perfom the HTTP request from the API
//fetch a user with ID 2 for testing

//fetch default is the fetch function
const fetch = require('node-fetch');

//require method path will always go into the node_modules to look for the module i.e. use ./ User is a class
const User = require('./users');

//need to include the fetch method in a callback function, which will be invoked in unit testing

//1) in the unit testing module (fetchUser.test.js), we are going to test the fetch method. In the UT module, we need to call back the fetchData function and pass in a callback function as the parameter. 

//fetchData function - just to call the API to fetch the data from the back-end
//callback function - will be executed after fetched dat back from backend for unit testing

function fetchData(callback) {

    fetch("https://reqres.in/api/users/2")  //pending 80ms
    .then(response => response.json())
    .then(allData => {

        console.log(allData.data);

        //Create an instance of User class
        //e.g. Jenet, id = 2
        let user = new User(allData.data.id, allData.data.email, allData.data.first_name, allData.data.last_name);

        //Display the data in the browser
        //till this step then can do unit testing here which might take 80ms
        //invoke (call) a callback function to execute the unit testing
        callback(user);
    })
    .catch((error) => {
        console.log('Error', error);
    });
 
}

module.exports = fetchData;
//perform many other codes and functions here