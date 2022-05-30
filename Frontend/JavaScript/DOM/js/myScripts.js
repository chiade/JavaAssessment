// single line comment
/*
    Multiple line comment
    Create a function to handle the button click
*/
function checkValidation() {
    if (userInput)
    {
        return true;
    }
    return false;
}

function changeStyle() {
//before i can change the style of the page, i need to do some validation
//let isValid = checkValidation();

    //All function codes will be inside here
    //alert("Hello World");

    //1) change the body background color to lightgreen
    //let toggle = false;
    //if (!toggle)
    debugger;
        document.body.style.backgroundColor="lightgreen";

        //2) example to find the HTML element by ID
        document.getElementById("section1-intro").style.color="blue";

        //3) example to find the HTML element by Tag name, also spefici the index number of the h3 to be edited
        document.getElementsByTagName("h3")[1].style.color="red";

        //change the 3rd heading text to....
        document.getElementsByTagName("h3")[2].innerHTML="<i>This is edited via Javscript</i>";

        //4) example to find the HTML element by class name
        document.getElementsByClassName("htmlElements")[1].style.fontSize="24px";

        //5) example to find the HTML element by CSS selector - querySelector method
      // document.getElementById("section2-update").getElementsByTagName("h3")[0].style.color="green";
        document.querySelector("#section2-update >h3").style.color="pink";

        document.querySelector("#myDiv").className ="changeStyle";
        
        document.querySelector("#section2-update > a").setAttribute("href","https://www.w3schools.com");

        //remove the 1st <ul> from section1 after clicking on the button
        document.querySelector("#section1-intro>.htmlElements").style.display="none";

        //CSS querySelectorAll
    } // end of changeStyles() function

    function changeName() {
        //alert("Hello World"); - display whatever in the alert method
        // prompt(); - allow user to enter text in the alert box

        //variable - container to store value(s) - create a variable to store the user input
        //let, var, const, 

        //let myName = prompt("What is your name","Jeanny");
        //console.log(myName); //display the varibale in the console for checking and debugging

        let myName = document.querySelector("#username").value;

        document.querySelector("#playerName >p").innerHTML = "Hello " + myName;
    }

/*    const nodeList = document.querySelectorAll(".second");
    for (let i = 0; i < nodeList.length; i++) {
    nodeList[i].style.color = "red";
}*/
   /* const nodeList1 = document.querySelectorAll(".third");
    nodeList1[1].style.fontWeight = "bold";*/
    document.querySelectorAll(".third")[1].style.fontWeight = "bold";
  /*  document.querySelector("#container ul li").innerHTML = "Four";*/

  document.querySelector(".footer").remove();

  document.querySelectorAll(".second")[0].style.color="red";
  document.querySelector("ol.third").style.fontWeight="bold";
  document.querySelector("#header").innerHTML = "<h1>Hello World</h1>";

  let newList = document.createElement("li");
  newList.innerText = "four";
  let list = document.querySelector("ul");
  list.appendChild(newList);
