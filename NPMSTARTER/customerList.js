const customer1 = {
    id:"all1", 
    name:"Jean Looi",
    membership:"Gold",
    totalSpending:3000
}; 
const customer2 = {
    id:"all2", 
    name:"Peter Lim",
    membership:"Silver",
    totalSpending:1000
}; 
const customer3 = {
    id:"all3", 
    name:"Mary Tan",
    membership:"Gold",
    totalSpending:500
}; 
const customer4 = {
    id:"all4", 
    name:"John Tan",
    membership:"Gold",
    totalSpending:1500
}; 

//an array of objects
const customerList = [];
customerList.push(customer1, customer2, customer3, customer4);

module.exports = {customerList};