//Declaration of all global variables herein
const travelReservationList = [];
let experience = []; // as u need to declare variable later

function clearInput() {
    document.querySelector("#fullName").value = "";
    document.querySelector("#email").value = "";
    document.querySelector("#tourPackage").value = "";
    document.querySelector("#arrivalDate").value = "";
    document.querySelector("#numPax").value = "";
    document.querySelector("#discount").value = "";
}

// This function will handle the form submission
function submitReservation(){

    //store the input values into the variables - now just exclude checkboxes and radio button first

    const name = document.querySelector("#fullName").value;
    const email = document.querySelector("#email").value;
    const tourPackage = document.querySelector("#tourPackage").value;
    const arrivalDate = document.querySelector("#arrivalDate").value;
    const numPax = document.querySelector("#numPax").value;
    const discount = document.querySelector("#discount").value;

    //check if the experience has at least one item in array
    //experience = [] // cannot be an empty array
    if (experience.length == 0)
    {
        //show error message
        document.querySelector("#chkBoxFood").setCustomValidity("Please select at least one experience");
        document.querySelector("#chkBoxFood").reportValidity();
    }

    else {
    //create object to store values into the object properties
    const travelDetails = {
        name: name,
        email: email,
        tourPackage: tourPackage,
        arrivalDate: arrivalDate,
        numPax: numPax,
        experience: experience,
        discount: discount,
    };
    //store the object into the array - submitReseravtion
    travelReservationList.push(travelDetails);
    clearInput(); //calling the clearInput function

    console.log(travelReservationList);
    alert("Thank you for your submission. we will contact you soon.");
    //console.log first object name - Jean
    //console.log(travelReservationList[0].name);
    //travelReservationList.length - properties
    }
}// end of submitRservation function

//set a limit to the date selection to a month starting form today's date
function setDate() {
    //Date is an object and has properties and methods - built-in browser API
    //In order to access the properties and methods of date object, we need to crrate an instance object of the date object

    //instantiating a date - Thur Apr 28 2022
    const currDate = new Date();    //getting today's date
    //current singapore time
    console.log(currDate);
    
    //format: min="2022-04-28" - this is a string
    let minYear = currDate.getFullYear(); // return 2022

    //currDate.getMonth() = index is 3 but the month "april"
    //minMonth = currDate,getMonth() +1 //4

    let minMonth = ((currDate.getMonth()+1) < 10) ? "0" + (currDate.getMonth()+1) : (currDate.getMonth() + 1);
    //currDate.getMonth()+1 // return index 4 = May
    // format need to return 3+1=4 (apr)
    // need to format single digit number to add a "0" in front
    console.log(minMonth); // 4

    let minDay = ((currDate.getDate()) < 10) ? "0" + (currDate.getDate()) : (currDate.getDate());
    console.log(minDay); //28

    //2022, 04, 28
    let minDate = `${minYear}-${minMonth}-${minDay}`;
    console.log(minDate);

    document.querySelector("#arrivalDate").setAttribute("min",minDate);


    //max="2022-05-27"
    //create anotehr instance object of their Date object for future date
    const maxDate = new Date(currDate.getFullYear(),currDate.getMonth()+2,currDate.getDate());
    console.log(maxDate);

    //currDate.getMonth() // return index 3, return april
    //currDate.getMonth()+1 // return index 4, return May
    //sat May 28 2022 (singapore standard time)

    let maxYear = maxDate.getFullYear();
    let maxMonth = ((maxDate.getMonth() + 1) <10) ? "0" + (maxDate.getMonth() + 1): (maxDate.getMonth() + 1);
    let maxDay = ((maxDate.getDate()) <10) ? "0" + (maxDate.getDate()): (maxDate.getDate());

    let futureDate = `${maxYear}-${maxMonth}-${maxDay}`;
    console.log(futureDate);

    document.querySelector("#arrivalDate").setAttribute("max", futureDate);
}
//when user loads the HTML in the browser
setDate(); // call this date function

//ticket 3 - user has to select at least one experience from the checkboxes

//experience = ["food","culture","sightseeing"];
//1) Select all the inout type with checkbox, so that we can do a forEach loop to listen and handle the "change" event for each checkbox
const checkboxes = document.querySelectorAll("input[type=checkbox]");
//checkboxes is not an array. it will contain all the checkboxes as objects known as NodeList which is a list of HTML elements
console.log(checkboxes);

//addEventListener method to all 3 input checkboxes. Checkbox is a change event 

checkboxes.forEach(checkbox => {
    //change is an event, click, onMouseover, onDrag
    checkbox.addEventListener("change",handleChecked);
});

//event handler for checkboxes change, pass the event object to the handler function
function handleChecked(event)  {

    //target of which checkbox I changed
    //checked properties: return true (checked) or false (unchecked)
    //value properties: food, cultre, sightseeing into array
    //console.log(event.target);

    if (event.target.checked) //true
    {
        //add the value to the array
        experience.push(event.target.value);
    }
    else { // false
        //remove value from the array
        let index = experience.indexOf(event.target.value);
        if (index != -1)
        {
            experience.splice(index, 1);
        }

        //experience = ["food", "culture"]
        //event.target.value = food
        // Loop 1: item = food; event.target.value = food
        //Loop 2: item = culture; event.target.value = food
        // -> experience = ["culture"]

       // experience = experience.filter(item => item != event.target.value);
    }
    console.log(experience);

    //check if experience has at least one item in the array. need clear the validation message so that can do submission
    if (experience.length > 0)
    {
        document.querySelector("#chkBoxFood").setCustomValidity("");
        document.querySelector("#chkBoxFood").reportValidity();
    }

}
