public class FilmeEstadoAlugado extends FilmeEstado{
    private FilmeEstadoAlugado() {}
    private static FilmeEstadoAlugado instance = new FilmeEstadoAlugado();
    public static FilmeEstadoAlugado getInstance(){
        return instance;
    }

    @Override
    public boolean disponibilizar(Filme filme) {
        filme.setEstado(FilmeEstadoDisponivel.getInstance());
        return true;
    }

    @Override
    public boolean indisponibilizar(Filme filme) {
        filme.setEstado(FilmeEstadoIndisponivel.getInstance());
        return true;
    }
}
