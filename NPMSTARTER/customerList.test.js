const myCustomer = require("./customerList");

/*
    id:"all1", 
    name:"Jean Looi",
    membership:"Gold",
    totalSpending:3000
*/

test('the first element of the customer list to be Jean Looi', () => {
        //test the 1st element (object) of the Array
        expect(myCustomer.customerList[0].name).toEqual("Jean Looi");
        expect(myCustomer.customerList[0].membership).toEqual("Gold");
        expect(myCustomer.customerList[0].totalSpending).toEqual(3000);

});