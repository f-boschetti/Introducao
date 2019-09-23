
public class Atv_4 {

	public static void main(String[] args) {
		class Compra {
			private String nomeProduto;
			private float preco;
			private int quantidade;
			
			public Compra(String produto, float preco, int quantidade) {
			this.nomeProduto = produto;
			this.preco = preco;
			this.quantidade = quantidade;
			}
			
			public Compra(String produto, float preco) {
			this.nomeProduto = produto;
			this.preco = preco;
			this.quantidade = 0;
			}
			
			public Compra(String produto) {
			this.nomeProduto = produto;
			this.preco = 5.0f;
			this.quantidade = 0;
			}
			
			public Compra() {
			this.nomeProduto = "Nenhum";
			this.preco = 2.0f;
			this.quantidade = 0;
			}
			
			public void setNomeProduto(String nomeProduto) {
				this.nomeProduto = nomeProduto;
			}
			public String getNome() {
				return this.nomeProduto;
			}
			public void setPreco(float preco) {
				this.preco = preco;
			}
			public float getPreco() {
				return this.preco;
			}
			public void setQuantidade(int quantidade) {
				this.quantidade = quantidade;
			}
			public int getQuantidade() {
				return this.quantidade;
			}
		}//fim da Compra	
		
		
		
	}

}
