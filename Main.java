public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(10);

        elevador.abrirPorta();
        elevador.fecharPorta();
        elevador.abrirPorta();
        elevador.fecharPorta();

        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.descer();
        elevador.subir();
        elevador.subir();

        elevador.mostrarAndar();

        elevador.descer();
        elevador.subir();
        elevador.subir();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();

        elevador.mostrarAndar();

        elevador.abrirPorta();

        elevador.statusPorta();
    }
}