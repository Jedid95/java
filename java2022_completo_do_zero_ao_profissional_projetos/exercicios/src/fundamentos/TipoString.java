package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase(s);
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
	}
}
