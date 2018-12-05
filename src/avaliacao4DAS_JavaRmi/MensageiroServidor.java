package avaliacao4DAS_JavaRmi;

import java.rmi.Naming;

public class MensageiroServidor {

	public MensageiroServidor() {
		try {
			Mensageiro mensageiro = new MensageiroImpl();
			Naming.rebind(MensageiroImpl.getUrl(), mensageiro);
		} catch (Exception e) {
			System.out.println("Erro: "+ e);
		}
	}
	public static void main(String[] args) {
		new MensageiroServidor();
	}

}
