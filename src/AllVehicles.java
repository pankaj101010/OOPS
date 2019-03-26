//Strictly used to achieve 100% Abstraction
//We cannot write concrete methods in interface
//We can write concrete methods in java 10
//I can also write  instance variables into interface and can also initialise them as final no problem
/*We cannot create a new reference of abstract class*/

/*Can we override a final concrete method ?
		No
		
*/
/*Apply different permutations and combinations and apply different kinds of combinations and write code*/

/*In Java 100% Inheritance is achieved by interface but not using classes*/

/*Interfaces are inherited in class by implements keyword while their inheritance is taken care 
  by extends keyword only
  eg : public interface Z extends X,Y
  */

public interface AllVehicles {
	public void setColor(String colorname); // But in Java 10 we can write concrete methods in interface
	public void setMaterial(String materialtype);
	public void setNumberofLamps();
}
