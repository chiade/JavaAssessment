/*
fetch API - built-in browser
-send or retrieve data from an existing API provided
*/
/*
json() method: taking the response (Json text format) from the fetch API and convert/parse the resposne to produce JS obj.(An array of objects)
*/

//the default HTTP request method for fetch is GET
fetch("https://reqres.in/api/users")
    //function will return the output of response.json(), the output will be passed to the next then method for further processing
    .then(response => response.json())  
    //the second then method will receive (an array of objects) for us to display on HTML
    .then(info => {
            console.log(info.data);
            //info is already an object,  data is an array of objects
            //once we get the data from API, need to display
            //console.log(info.data[0].first_name); // get first name

            //create the table with rows and columns to dynamically populate the data

            let tableInfo = 
            `
                <table border=1 class="tableStyle">
                    <tr>
                        <th>Email</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                    </tr>
            `

            info.data.forEach((item, index) => {

                let custIndex = "cust" + index;
                tableInfo +=
                `
                    <tr>
                        <td><a id="${custIndex}" href="./customerDetails.html">${item.email}</a></td>
                        <td>${item.first_name}</td>
                        <td>${item.last_name}</td>
                    </tr>
                `
            });

            tableInfo += "</table>";
            document.querySelector("#customerList").innerHTML = tableInfo;

            //Event listener for the click on the email, when user clicks on the customer email, the customer info will be stored into the LocalStorage

            info.data.forEach((item, index) => {

            let custIndex = "cust" + index;
            document.getElementById(custIndex).addEventListener("click", function() {displayDetail(item);})
            });

    })
    .catch(error => console.log("error is: ", error));


    //Event handlet for the email click
    function displayDetail(item) {

        //store the item into the LocalStorage - will store data in text format (String) - Json format
        /*
        item is an JS object
        item = 
        {
            email: "george@regres.in",
            first_name: "George",
            last_name: "Weaver",
            avatar: "http://xxxxxx"
        }
        */
        window.localStorage.setItem("item", JSON.stringify(item));
    }

    //JS execute here w/o waiting for the fetch API to complete....