public class Conta{
	private double saldo;
	private int numero;			// No java
	private int agencia;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero){
		Conta.total++;
		// System.out.println("O total de contas � " + Conta.total);
		if(agencia <= 0) {
			System.out.println("Digite um valor v�lido");
			return;
		}
		this.agencia = agencia;
		System.out.println("O n�mero da sua ag�ncia � " + this.agencia);
		if(numero <=0) {
			System.out.println("Digite um valor v�lido");
			return;
		}
		this.numero = numero;
		System.out.println("O n�mero da sua conta � " + this.numero);
	}
	public String deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return "voc� depositou " + valor + " seu novo saldo �: " + this.saldo;
		}else {
			return "voc� n�o conseguiu depositar";
		}
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true ;
		}else {
			return false ;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo > valor) {
			sacar(valor);
			destino.deposita(valor);
			System.out.println("Voc� transferiu R$ " + valor + "para a conta de "+ destino);
			return true;
		}
		else {
			return false;
		}
		
	}
	public double getSaldo() {
		 return this.saldo;
		
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Error: Digite um valor v�lido!");
			return;
		}
		this.agencia = agencia;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Error: Digite um valor v�lido!");
			return;
	}
		this.numero = numero;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	
}





/* Linguagem Humana
Tipo Conta:
	saldo
	numero
	agencia
	titular

*/