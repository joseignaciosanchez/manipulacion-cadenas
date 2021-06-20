
public class StringManipulator {

	public String trimAndConcat(String cad1, String cad2) {		
		String retorno = "";
		
		retorno = cad1.trim()+cad2.trim();			
		
		return retorno;
	}
	public int getIndexOrNull(String str, char letter) {
		int retorno = 0;
		
		retorno = str.indexOf(letter);
		
		return retorno;
	}
	public int getIndexOrNull(String str1, String str2) {
		int retorno = 0;
		
		retorno = str1.indexOf(str2);
		
		return retorno;
	}
	public String concatSubstring(String str1, int num1, int num2, String str2) {
		String retorno = "";
		
		retorno =  str1.substring(num1, num2).concat(str2);
		
		return retorno;
	}
}
