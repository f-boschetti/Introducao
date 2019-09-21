import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		class Autor {
			public String nome;
			public int id;
			}
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o nome do autor: ");
		String texto = sc.nextLine();
		System.out.print("\nInsira o ID: ");
		int idem = sc.nextInt();
		Autor autor =  new Autor();
		autor.id = idem;
		autor.nome = texto;
		System.out.println(autor.id);
		System.out.println(autor.nome);

	}

}
