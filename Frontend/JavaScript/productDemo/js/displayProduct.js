//An instance of the productController class object
const products = new ProductController();

//once created our API at our backend, displayProduct() method will call the API and return all product item details from the database to display to product_start.html

//now as are unable to call any API, hence need some hardcoding to add product details using the addProduct() method and display the product details. will REMOVE AFTER APIs

products.addProduct("Dark T-Shirt 1", "This is a dark cat T-Shirt 1", "http://www.jennybeaumont.com/wp-content/uploads/2015/03/placeholder.gif","MML 1", 10.50);

products.addProduct("Dark T-Shirt 2", "This is a dark cat T-Shirt 2", "http://www.jennybeaumont.com/wp-content/uploads/2015/03/placeholder.gif","MML 2", 11.50);

products.addProduct("Dark T-Shirt 3", "This is a dark cat T-Shirt 3", "http://www.jennybeaumont.com/wp-content/uploads/2015/03/placeholder.gif","MML 3", 12.50);

products.addProduct("Dark T-Shirt 4", "This is a dark cat T-Shirt 4", "http://www.jennybeaumont.com/wp-content/uploads/2015/03/placeholder.gif","MML 4", 13.50);

products.addProduct("Dark T-Shirt 5", "This is a dark cat T-Shirt 5", "http://www.jennybeaumont.com/wp-content/uploads/2015/03/placeholder.gif","MML 5", 14.50);

products.addProduct("Dark T-Shirt 6", "This is a dark cat T-Shirt 6", "http://www.jennybeaumont.com/wp-content/uploads/2015/03/placeholder.gif","MML 6", 15.50);

products.addProduct("Dark T-Shirt 7", "This is a dark cat T-Shirt 7", "http://www.jennybeaumont.com/wp-content/uploads/2015/03/placeholder.gif","MML 7", 60);


products.displayProduct();


//const curr = new Date(); // date object has its own class creation
//getFullYear()...