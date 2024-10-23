package musica;

public class AppleMusic implements ReproductorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Parando a música.");
    }

    @Override
    public void seleccionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
