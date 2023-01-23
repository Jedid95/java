package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		
		System.out.printf("Nome: %s %s", nome, sobrenome);
	}
}
