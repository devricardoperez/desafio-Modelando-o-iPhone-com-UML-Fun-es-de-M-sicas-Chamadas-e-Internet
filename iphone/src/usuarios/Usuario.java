package usuarios;

import iphone.Iphone;
import llamadas.AparelhoTelefonico;
import musica.ReproductorMusical;
import navegador.NavegadorInternet;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        AparelhoTelefonico aparelhoTelefonico = iphone;
        ReproductorMusical reproductorMusical = iphone;
        NavegadorInternet navegadorInternet = iphone;

        aparelhoTelefonico.ligar("");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        reproductorMusical.tocar();
        reproductorMusical.pausar();
        reproductorMusical.seleccionarMusica("");

        navegadorInternet.exibirPagina("");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

    }
}