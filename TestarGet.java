
public class TestarGet {
	public static void main(String[] args) {
		Conta conta = new Conta(2255, 5522);
		conta.deposita(200);
		System.out.println(conta.getSaldo());
		conta.setAgencia(15);
		System.out.println(conta.getAgencia());
		
		Cliente andrew = new Cliente();
		andrew.setNome("Andrew Soares");
		conta.setTitular(andrew); // � a mesma coisa de conta.titular = andrew; por�m com o atributo privado, n aceita mais dessa forma
		conta.getTitular().setCpf("19785");
		System.out.println("andrew, seu cpf �: " + conta.getTitular().getCpf());
		
		System.out.println(conta.getTitular().getNome());
		// conta.getTitular().setNome("Andrew Voc� mudou o nome");
		// Fazedo agora o c�digo acima em duas linhas 
		Cliente titularConta = conta.getTitular();
		titularConta.setNome("Andrew Voc� mudou novamente de nome");
		System.out.println(conta.getTitular().getNome());
		System.out.println(titularConta);
		System.out.println(andrew);
		
		Conta gaby = new Conta(5522, 2255);
		gaby.deposita(50);
		System.out.println("Gaby seu saldo � " + gaby.getSaldo());
		System.out.println("Andrew seu saldo � " + conta.getSaldo());
		conta.transfere(150, gaby);
		System.out.println("Gaby seu novo saldo � " + gaby.getSaldo());
		
		
		
		}
}
