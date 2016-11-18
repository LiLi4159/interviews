package com.elsevier.education;
import java.util.HashSet;
import java.util.Set;
/**

TODO: Make this class immutable.
1. Make the class Person final
2. Make all the variables private so they can not be accessed form outside
3. Get rid of all the setters
4. Make all the assignments inside contructor, and make deep copy of the list
*/

public class Exercise1 {
// final class cannot be subclassed or inherited
	public final static class Person {
		// make the attributes final, so they can only be set once
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		//assign the values once in the contructor with deep copy
		public Person(String fname, String lname, Set<String> phones) {
			this.firstName=fname;
			this.lastName=lname;
			this.phoneNumbers=new HashSet<String>();
			for (String p:phones){
				phoneNumbers.add(p);
			}
		}
		//get rid of setters
		//return a deep copy of set
		public Set<String> getPhoneNumbers() {
			return  ((Set)((HashSet) phoneNumbers).clone());
		}
		
		public String getFirstName() {
			return firstName;
		}
	
		
		public String getLastName() {
			return lastName;
		}
	
	}
}