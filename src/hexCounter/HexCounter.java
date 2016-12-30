package hexCounter;

public interface HexCounter {

	/**
	 * Sets all vowels to 'a';
	 */
	public void reset();
	
	/**
	 * 
	 * @param char c
	 * @return boolean: true if c is a vowel
	 * 		   			false if c isn't a vowel 
	 */
	//private boolean isVowel(char c);
	
	/**
	 * Each vowel in the given string is concatenated to a number in the hex system
	 * The value of these vowels star at zero ant increase with each in rising order:
	 * a,e,i,o,u.
	 * For example /<ai/>=18 increase -/> /<ao/>=19
	 * @return boolean: true if overflow 
	 * 					false if no overflow
	 */
	public boolean inc();
	
	/**
	 * @return current String
	 */
	public String getString();
	
	public void getAll();
}
