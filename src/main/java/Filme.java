public class Filme {
    private String nome;
    private FilmeEstado estado;

    public Filme(){
        this.estado = FilmeEstadoDisponivel.getInstance();
    }

    public boolean alugar(){
        return estado.alugar(this);
    }

    public boolean disponibilizar(){
        return estado.disponibilizar(this);
    }

    public boolean indisponibilizar(){
        return estado.indisponibilizar(this);
    }

    public void setEstado(FilmeEstado estado){
        this.estado = estado;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
       this.nome = nome;
    }

    public FilmeEstado getEstado(){
        return this.estado;
    }

}
