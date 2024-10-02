package classesAleatorias;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta = new Consulta("24/09/2007", "Maria", "Marina");

		System.out.println(consulta.getData());
		System.out.println(consulta.getNomePcente());
		System.out.println(consulta.getNomeDents());

	}

}
