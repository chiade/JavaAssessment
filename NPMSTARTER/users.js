class User {

    //_ in front of variable/pproperty: hidden variable/property - developer cannot accesss data directly
    //means I do not want any external system/application to access the property directly
    //encapsulation in OOP
    //Access modfifier: private / protected / public / default - covered in Java

    constructor(id, email, first_name, last_name) {
      this._id = id;
      this._email = email;
      this._first_name = first_name;
      this._last_name = last_name;
    }

    //cover in java: getter and setter methods to access the properties of the class
    //external system / module will only be able to access the Class data member e.g. id, email, first_name) through the getter and setter methods

    get getId(){
        //checking - is the user authenticated? need to call API to check
        //error handling
        return this._id;
    }

    get getEmail(){
        return this._email;
    }

    get getFirstName(){
        return this._first_name;
    }

    get getLastName(){
        return this._last_name;
    }

    set setId(newId){
        //check newId is the correct format
        //error handling = Id cannot be a number
        this._id = newId;
    }
  }

module.exports = User; // no need curly braces as need only 1 unless need many classes