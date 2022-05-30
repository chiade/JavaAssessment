
class ProductController {

    constructor() {
        this.allProductItems = [];
    }

    //methods
    addProduct(name, description, imageURL, style, price) {

        //will edit the methods after having done our own API in Java - store info into database
        const productItem = {
            name: name,
            description: description,
            imageURL: imageURL,
            style: style,
            price: price, 
        }
        this.allProductItems.push(productItem);
    }

    displayProduct() {
        //console.log(this.allProductItems);

        let showProductItem = "";
        let moreBtnId = "";
        this.allProductItems.forEach ((item, index) => {

            moreBtnId = "item" + index;
            //item0, item1, ....item6

            showProductItem += 
            `
            <div  class="col-lg-4">
            <div class="card" style="width: 18rem;">
                <img src="${item.imageURL}" class="card-img-top"
                    alt="image">
                <div class="card-body">
                    <h5 class="card-title">${item.name}</h5>
                    <p class="card-text">${item.description}</p>
                    <a id="${moreBtnId}" href="#" class="btn btn-primary" data-toggle="modal" data-target="#productModal">More</a>
                </div>
            </div>
          </div>
            `
            //cannot add the button eventListener here as showProductItem is still a String, not a HTML Element
        });

        document.querySelector("#row").innerHTML = showProductItem;

        //Add eventlistener to all the 'More' button to show the details for each item. 
        this.allProductItems.forEach ((item, index) => {
            moreBtnId = "item" + index;
            document.getElementById(moreBtnId).addEventListener("click", function(){ displayItemDetail(item)  });

        });

    }//End of displayProduct method
    //displayfilterProducts();
}//End of ProductController Class

function displayItemDetail(item) {
    //handle each 'More' button to show the prodcut details
    document.querySelector("#itemTitle").innerHTML = item.name;
    document.querySelector("#itemImage").src = item.imageURL;
    document.querySelector("#itemStyle").innerHTML = item.style;
    document.querySelector("#itemPrice").innerHTML = item.price;

}