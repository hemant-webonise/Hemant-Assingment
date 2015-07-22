describe("Testing Two Numbers", function() {
	var a = 4;
	var b = 3;
    it("Add Numbers", function() {
        expect(AddTwoNumbers(a,b)).toEqual(7);
    });
    it("Multiply Numbers", function() {
        expect(MultiplyTwoNumbers(a,b)).toEqual(12);
    });
 
    it("Compare Numbers to be Greater Than", function() {
    	expect(a).toBeGreaterThan(b);
    });
 
    it("Compare Numbers to be Less Than", function() {
    	expect(b).toBeLessThan(a);
    });
    /*THE CODE TO CHECK THAT THE FUNCTIONS ARE DIFINED */
    it("Check for MultiplyTwoNumbers definations", function() {    

    expect(MultiplyTwoNumbers(a,b)).toBeDefined() 
    
    });
    it("Check for AddTwoNumbers definations", function() {    

    expect(AddTwoNumbers(a,b)).toBeDefined() 
    
    });
   
});
