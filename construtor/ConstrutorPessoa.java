package construtor;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa jogador1 = new Pessoa("Maria", 17);
		Pessoa jogador2 = new Pessoa("Alya", 17);
		Pessoa jogador3 = new Pessoa("Marina", 16);

		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());

		System.out.println("--------");


		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());

		System.out.println("--------");


		System.out.println(jogador3.getNome());
		System.out.println(jogador3.getIdade());

	}
}
