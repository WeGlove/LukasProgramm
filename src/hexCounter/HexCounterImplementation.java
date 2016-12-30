package hexCounter;

public class HexCounterImplementation implements HexCounter {

	char[] c;
	int length;
	
	public HexCounterImplementation(String s){
		c=s.toCharArray();
		length=s.length();
	}
	
	@Override
	public void reset() {
		for(int i=0; i<length; i++){
			if (IsVowel(c[i])) if (IsUpperCase(c[i]))c[i]='A'; else c[i]='a';
		}
	}
	
	private boolean IsUpperCase(char c){
		switch(c){
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}

	private boolean IsVowel(char c){
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}
	
	@Override
	public boolean inc() {
		for(int i=0; i<length; i++){
			if (IsVowel(c[i])) 
				switch(c[i]){
				case 'a':
					c[i]='e';
					return false;
				case 'e':
					c[i]='i';
					return false;
				case 'i':
					c[i]='o';
					return false;
				case 'o':
					c[i]='u';
					return false;
				case 'u':
					c[i]='a';
					break;
				case 'A':
					c[i]='E';
					return false;
				case 'E':
					c[i]='I';
					return false;
				case 'I':
					c[i]='O';
					return false;
				case 'O':
					c[i]='U';
					return false;
				case 'U':
					c[i]='A';
					break;
				default:
					System.out.println("Zer is a problem");
					System.exit(0);
				}
		}
		return true;
	}

	@Override
	public String getString() {
		return String.valueOf(c);
	}

	@Override
	public void getAll() {
		reset();
		System.out.println(getString());
		while(!inc()){
			System.out.println("\033[31mERROR  \033[0m");
		}
	}

}
