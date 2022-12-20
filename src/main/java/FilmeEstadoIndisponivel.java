public class FilmeEstadoIndisponivel extends FilmeEstado{
    private FilmeEstadoIndisponivel(){}
    private static FilmeEstadoIndisponivel instance = new FilmeEstadoIndisponivel();
    public static FilmeEstadoIndisponivel getInstance(){
        return instance;
    }

    @Override
    public boolean disponibilizar(Filme filme) {
        filme.setEstado(FilmeEstadoDisponivel.getInstance());
        return true;
    }
}
