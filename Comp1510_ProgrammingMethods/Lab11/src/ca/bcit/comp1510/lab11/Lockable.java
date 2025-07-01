/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * 
 */
public interface Lockable {
	
	void setKey(int key);
	boolean lock(int key);
	boolean unlock(int key);
	boolean locked();

}
