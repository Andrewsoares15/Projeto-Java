
public class TestarValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1555, 27859);
		Conta conta2 = new Conta(2154, 21545);
		System.out.println("O total de contas é " + Conta.getTotal());
	}
}
