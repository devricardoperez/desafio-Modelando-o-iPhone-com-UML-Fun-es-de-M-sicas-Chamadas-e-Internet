package llamadas;

import java.util.Scanner;

public class Telefono implements AparelhoTelefonico {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando al numero: " + numero);
    }

    @Override
    public void atender() {
        long telefonoAleatorio = GeradorNumerosAleatorios.generateRandomNumber(11);
        System.out.println("Deseja atender chamada entrante (Y/N) de: " + telefonoAleatorio);
        String atender = scanner.nextLine();
        if (atender.toLowerCase() == "y" ) {
            System.out.println("Atendendo a chamada.");
        }else{
            System.out.println("Chamada não atendida.");
        }

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio voz.");
    }
}
