package br.com.etiserver.easyjava.core;

/**
 * Class that contains all utility cast methods
 * @author optimus
 *
 */
public class CoreCastMethods {

	/**
	 * Convert String types to int types
	 * @param object The type to be casted
	 * @return
	 */
	public int to_i(String object) {
		return Integer.valueOf(object);
	}

	/**
	 * Convert float types to int types
	 * @param object The type to be casted
	 * @return
	 */	
	public int to_i(float object) {
		return Integer.valueOf(String.valueOf(object));
	}

	/**
	 * Convert double types to int types
	 * @param object The type to be casted
	 * @return
	 */	
	public int to_i(double object) {
		return Integer.valueOf(String.valueOf(object));
	}

	/**
	 * Convert short types to int types
	 * @param object The type to be casted
	 * @return
	 */	
	public int to_i(short object) {
		return Integer.valueOf(object);
	}

	/**
	 * Convert long types to int types
	 * @param object The type to be casted
	 * @return
	 */	
	public int to_i(long object) {
		return Integer.valueOf(String.valueOf(object));
	}

	/**
	 * Convert int types to String types
	 * @param object The type to be casted
	 * @return
	 */	
	public String to_s(int object) {
		return String.valueOf(object);
	}

	/**
	 * Convert double types to String types
	 * @param object The type to be casted
	 * @return
	 */		
	public String to_s(double object) {
		return String.valueOf(object);
	}

	/**
	 * Convert float types to String types
	 * @param object The type to be casted
	 * @return
	 */		
	public String to_s(float object) {
		return String.valueOf(object);
	}

	/**
	 * Convert long types to String types
	 * @param object The type to be casted
	 * @return
	 */		
	public String to_s(long object) {
		return String.valueOf(object);
	}

	/**
	 * Convert short types to String types
	 * @param object The type to be casted
	 * @return
	 */		
	public String to_s(short object) {
		return String.valueOf(object);
	}

	/**
	 * Convert String types to double types
	 * @param object The type to be casted
	 * @return
	 */		
	public double to_f(String object) {
		return Double.valueOf(object);
	}

	/**
	 * Convert float types to double types
	 * @param object The type to be casted
	 * @return
	 */			
	public double to_f(float object) {
		return Double.valueOf(object);
	}

	/**
	 * Convert short types to double types
	 * @param object The type to be casted
	 * @return
	 */			
	public double to_f(short object) {
		return Double.valueOf(object);
	}

	/**
	 * Convert long types to double types
	 * @param object The type to be casted
	 * @return
	 */			
	public double to_f(long object) {
		return Double.valueOf(String.valueOf(object));
	}

}
