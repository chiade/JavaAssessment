//retrieve the information from the LocalStorage

//1) get the item from LocalStorage and store into a variable
let custDetail = window.localStorage.getItem("item");

//2) convert the JSON text format to a JS object
let custDetailObject = JSON.parse(custDetail);

document.querySelector("#firstName").innerHTML = custDetailObject.first_name;
document.querySelector("#lastName").innerHTML = custDetailObject.last_name;
document.querySelector("#avatar").src = custDetailObject.avatar;

//use the customer ID or email to do anotehr fetch of API e.g. transcation history of this particular customer)



