import java.util.Scanner;

public class nombre {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor ingrese su nombre");
		String nombre = s.nextLine();
		int length = nombre.length();
		//System.out.println(length);
		
	
		for(int i=0; i<length;i=i+1) {
			System.out.println(nombre.charAt(i));
		}
	}

}
