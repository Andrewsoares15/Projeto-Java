
public class TestarGet {
	public static void main(String[] args) {
		Conta conta = new Conta(2255, 5522);
		conta.deposita(200);
		System.out.println(conta.getSaldo());
		conta.setAgencia(15);
		System.out.println(conta.getAgencia());
		
		Cliente andrew = new Cliente();
		andrew.setNome("Andrew Soares");
		conta.setTitular(andrew); // é a mesma coisa de conta.titular = andrew; porém com o atributo privado, n aceita mais dessa forma
		conta.getTitular().setCpf("19785");
		System.out.println("andrew, seu cpf é: " + conta.getTitular().getCpf());
		
		System.out.println(conta.getTitular().getNome());
		// conta.getTitular().setNome("Andrew Você mudou o nome");
		// Fazedo agora o código acima em duas linhas 
		Cliente titularConta = conta.getTitular();
		titularConta.setNome("Andrew Você mudou novamente de nome");
		System.out.println(conta.getTitular().getNome());
		System.out.println(titularConta);
		System.out.println(andrew);
		
		Conta gaby = new Conta(5522, 2255);
		gaby.deposita(50);
		System.out.println("Gaby seu saldo é " + gaby.getSaldo());
		System.out.println("Andrew seu saldo é " + conta.getSaldo());
		conta.transfere(150, gaby);
		System.out.println("Gaby seu novo saldo é " + gaby.getSaldo());
		
		
		
		}
}
