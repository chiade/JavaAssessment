const fetchData = require('./fetchUser');
 
test('Validate the details when user is equal to 2', done => {
   function callback(data) {
       //try catch - exception handling will be covered more in the Java lesson
       try {
            expect(data.getId).toEqual(2);
            expect(data.getEmail).toMatch("janet.weaver@reqres.in");
            expect(data.getFirstName).toEqual("Janet");
            expect(data.getLastName).toEqual("Weaver");
            //is to inform Jest that unit testing case is completed and success
            done();
       }
       catch (error) {
           //to inform Jest that the unit testing case has failed
           done(error);
       }
   }

   //we want to test he fetch method, so we call the fetchData function, passed the callback function as the argument so that we can call the function AFTER we fetched the data back from the backend to do the unti testing
   fetchData(callback);
});


