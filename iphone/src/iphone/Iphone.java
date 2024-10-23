package iphone;

import llamadas.AparelhoTelefonico;
import llamadas.GeradorNumerosAleatorios;
import musica.ReproductorMusical;
import navegador.NavegadorInternet;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, ReproductorMusical, NavegadorInternet {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void ligar(String numero) {
        System.out.println("Digitando o telefone no Iphone para ligar: ");
        numero = scanner.nextLine();
        System.out.println("Ligando no Iphone al numero: " + numero);
    }

    @Override
    public void atender() {
        long telefonoAleatorio = GeradorNumerosAleatorios.generateRandomNumber(11);
        System.out.println("No seu Iphone deseja atender chamada entrante (Y/N) de: " + telefonoAleatorio);
        String atender = scanner.nextLine();
        if (atender.toLowerCase() == "y" ) {
            System.out.println("Atendendo a chamada no Iphone.");
        }else{
            System.out.println("Chamada não atendida no Iphone.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz no Iphone.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no Iphone.");
    }

    @Override
    public void pausar() {
        System.out.println("Parando a música no Iphone.");
    }

    @Override
    public void seleccionarMusica(String musica) {
        System.out.println("Digite o nome da música que você deseja no seu Iphone: ");
        musica = scanner.nextLine();
        System.out.println("Música selecionada no seu Iphone: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Digite o URL da pagina desejada no Iphone: ");
        url = scanner.nextLine();
        System.out.println("Página selecionada no Iphone: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone.");
    }
}
