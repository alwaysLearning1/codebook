package puzzlers.string;

public class StringReversal {

	//time and space inefficient - everyday value
	static final String reverseUsingLoop(String string) {
		StringBuffer buf = new StringBuffer();
		for(int i = string.length()-1; i >= 0 ; i--) {
			buf.append(string.charAt(i));
		}
		return buf.toString();
	}
	//In place replacement, space efficient, time inefficient
	//favor this if effective use of memory is consideration
	static final String reverseUsingXOR(String string) {
		byte[] array = string.getBytes();
		for(int i = 0, j = array.length-1; i < array.length/2; i++, j--) {
			array[i] ^= array[j];
			array[j] ^= array[i];
			array[i] ^= array[j];
		}
		return new String(array);
	}
	//Improvement on time but extra space for temp and array not as space efficient as second method 
	//favor this if better performance is consideration
	static final String reverseUsingTemp(String string) {
		char temp; //2 bytes
		char[] c = string.toCharArray(); //array length * 2 bytes.
		for(int i = 0, j = c.length-1; i<c.length/2; i++, j--) {
			temp = c[j];
			c[j] =  c[i];
			c[i] = temp;
		}
		return new String(c);
	}
	//Inefficient - don't use it other than theorotical purpose
	static final String reverseUsingRecursion(String string) {
		//base case to handle one char string and empty string
		if (string.length() < 2) {
			return string;
		}
		return reverseUsingRecursion(string.substring(1)) + string.charAt(0);
	}
}
