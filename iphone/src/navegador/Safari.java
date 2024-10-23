package navegador;

import musica.ReproductorMusical;

import java.util.Scanner;

public class Safari implements NavegadorInternet {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void exibirPagina(String url) {
        System.out.println("Digite o URL da pagina desejada: ");
        url = scanner.nextLine();
        System.out.println("Página selecionada: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
