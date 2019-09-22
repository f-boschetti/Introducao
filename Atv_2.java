import java.util.Scanner;

public class Atv_2 {
	public static void main(String[] args) {

	
	class Autor {
		Scanner sc = new Scanner(System.in);
		private String nome;
		private int id;
		
		public String getnome() {
			return nome;
		}
		
		public int getid() {
			return id;
		}
		
		public void setnome(String nome) {
			this.nome = nome;
		}
		
		public void setid(int id) {
			this.id = id;
		}
		
		
		public void carregaDoTeclado() {
			System.out.print("Insira o nome: ");
			String nome = sc.nextLine();
			setnome(nome);
			System.out.print("Insira o ID: ");
			int id = sc.nextInt();
			setid(id);
		}

	}
	Autor personagem = new Autor();
	personagem.carregaDoTeclado();
	System.out.println(personagem.getid());
	System.out.println(personagem.getnome());
	
	
	
		
	}	
}