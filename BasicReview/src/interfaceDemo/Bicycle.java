/**
 * 
 */
package interfaceDemo;

/**
 * @author Tesfagabir Meharizghi
 *
 */
public interface Bicycle {
	//wheel Revolutions per minute
	void changePedalRate(int newValue);
	
	void changeGear(int newValue);
	
	void speedUp(int increment);
	
	void applyBrakes(int decrement);

}
