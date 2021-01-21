package creational.prototype;

/**
 * Prototype design pattern is used in scenarios where application needs to create a number of instances of a class, 
 * which has almost same state or differs very little.
 * @author SG0214210
 *
 */
public interface PrototypeCapable extends Cloneable{
	public PrototypeCapable clone() throws CloneNotSupportedException;
}
