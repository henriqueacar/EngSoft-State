public class FilmeEstadoDisponivel extends FilmeEstado{
    private FilmeEstadoDisponivel() {}
    private static FilmeEstadoDisponivel instance = new FilmeEstadoDisponivel();
    public static FilmeEstadoDisponivel getInstance(){
        return instance;
    }
    @Override
    public boolean alugar(Filme filme) {
        filme.setEstado(FilmeEstadoAlugado.getInstance());
        return true;
    }

    @Override
    public boolean indisponibilizar(Filme filme) {
        filme.setEstado(FilmeEstadoIndisponivel.getInstance());
        return true;
    }
}
