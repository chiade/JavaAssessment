    //exercise 1
    //aray, forEach Mthod - execute a function that returns each array element

    // imagine that the nameList is retrieved from the database

    const nameList = ["Mary", "Tom", "Jerry", "Jenny"];
    // p tag in the #output section
    const nameOutputArea = document.querySelector("#output >p");
    const customerOutputArea = document.querySelector("#customerList > p");

    //retrieve the individual name from the array and display in console log
    nameList.forEach(name => console.log(name));

    //this function is called when user clicks onthe display button to display the names from the array
    function displayNameForm(){
       nameOutputArea.innerHTML = "";  //clear whatever in the <p> tag

        nameList.forEach((name,index) => {
            //concate in the forEach loop to display all the names
            nameOutputArea.innerHTML += `<b>${index+1}. ${name}</b><br/>`;
        });
    }
//will exectue outside function
    //const getName = document.querySelector("#addName"); //if exclude .value is input HTML element
    //getName.value = "Jean";

    //This code is outside of the function
    //getName refers ot hte input tag w the id
    //const getName = document.querySelector("#addName"); //inout tag HTML element
    //getName.value = "Jean1111111/;"

    function checkName(nameInput) {

        let isFound = false;

        //.every(), .some(), for loop if you want to do break if found
        nameList.forEach(name => {
            if (name.toLowerCase() == nameInput.toLowerCase())
            {
                //set a boolean var to true
                isFound = true;
            }
        });
        return isFound;
    }

    //this function is called when user clicks on the Add button t add a name into the array
    //check if the name exist in the array, case-insensitive
    function addNameForm() {
        const getName = document.querySelector("#addName").value; 

        //1b) check if the input name exist in teh array. if exist, do not add to array
        //nameList.includes(getName); return true when ther's match or false if no match
        // if input is 'Tom' return true ->cannot add to array list
        //return false -> then can add to array list => not true
        //if (!nameList.includes(getName.toLowerCase())) 
        //only add to array when isFound is false

        if (!checkName(getName))  //getName is the argument
        {
            nameList.push(getName);
            displayNameForm();
        }
    }
        //let isFound = false;
        //nameList.forEach((name,index) => {

            //name = mary, getName = jerry -> isFound = false
            //name = tom, getName = jerry -> isFound = false
            //name = jerry, getName = jerry -> isFound = true
      //   if (name.toLowerCase() == getName.toLowerCase())
         
                //set a boolean variable to true
       /*         isFound = true;
            }
        });
        if (!isFound)
        {
        //2) push method to add to array
        nameList.push(getName);
        displayNameForm();
    }
    }*/
    // this function is called when user clicks on the searhc button
    // when the name is found in the array, display "tom exist in the name list"
    //when the name is not found in array, disply "peter does not exist in name list"
    function searchNameForm()
    {
        //1) get the input value
        const getName = document.querySelector("#searchName").value;
        nameOutputArea.innerHTML = "";  //clear whatever is in the <p> tag
        if (!checkName(getName))
        {
            nameOutputArea.innerHTML = `${getName} does not exist in the name list`;
        }
        else{
            nameOutputArea.innerHTML = `${getName} exist in the name list`;
        }

        //2) check if getName is in the arrayList (toLowerCase())

    }

    //exercise 2
    //customer object - properties: id, name, membership (gold, silver, premium), totalSpending
    //create 4 customers, all my customers will be stored in an array for easy access
    //example that we will retrieve all customer records form the database and display to the webpage
    const customer1 = {
        id:"alii", 
        name:"jean looi",
        membership:"Gold",
        totalSpending:3000
    }; 
    const customer2 = {
        id:"jii", 
        name:"jean laai",
        membership:"silver",
        totalSpending:5000
    }; 
    const customer3 = {
        id:"lii", 
        name:"jean leei",
        membership:"premium",
        totalSpending:9000
    }; 
    const customer4 = {
        id:"xii", 
        name:"jean luui",
        membership:"Gold",
        totalSpending:32000
    }; 

    //an array of objects
    const customerList = [];
    customerList.push(customer1, customer2, customer3, customer4);

    //create an array of objects for employees i.e. Jean, Peter

  /*  const employeeList = {
        {
            id:"xii", 
            name:"jean luui",
            membership:"Gold",
            totalSpending:32000
    
    }*/

    //console.log(customerList);
    //display "jean leei" from the array of object
   //console.log(customerList[2].name);

   function displayCustomer(arrayList) {
    customerOutputArea.innerHTML =""; // to clear the HTML

    arrayList.forEach(customerInfo => {
        customerOutputArea.innerHTML += 
        `
            <b>
            Customer Name: ${customerInfo.name}<br/>
            Membership: ${customerInfo.membership}<br/>
            Total Spending: ${customerInfo.totalSpending}<br/>
            </b>
            <br/>
        `
    });
   }

   //1) Display all our customer in the array when we clicked on the display customers button
   function displayCustomerForm() {
        displayCustomer(customerList);

    }
   function filterCustomerMForm(){
        const filterGoldMembers = customerList.filter(customer => customer.membership == "Gold");
        //filterGoldMembers = [customer1, customer4];
        //display the array customer records from the filterGoldMembers?
        displayCustomer(filterGoldMembers);
   }

   function filterCustomerSForm() {
    const filterSpendingMembers = customerList.filter(customer => customer.totalSpending > 1000);
    //filterGoldMembers = [customer1, customer4];
    //display the array customer records from the filterGoldMembers?
    displayCustomer(filterSpendingMembers);

   }