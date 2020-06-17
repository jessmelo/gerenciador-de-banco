
public class ClienteEspecial extends Cliente{
	static final int dividaMaxima = 50000;
	static final String tipo = "CE";
	private int valorContaCorrente;
	private int valorDaDivida;

	/* Construtor da Classe ClienteEspecial
	 * Este construtor invoca o construtor da classe Cliente.
	 */
	ClienteEspecial(String nome, int cpf, int valor){
		super(nome, cpf, valor);
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	
	public boolean obterEmprestimo(int valor) {
		
		//TODO implemente seu codigo aqui

		if(valor <= 0) return false;

		int dividaTotal = valor + valorDaDivida;
		
		if(dividaTotal > dividaMaxima) {
			return false;
		} else {
			valorDaDivida = dividaTotal;
			valorContaCorrente = valor + valorContaCorrente;
			return true;
		}
	}
	
}
