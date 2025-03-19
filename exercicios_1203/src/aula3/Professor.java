package aula3;

public class Professor extends Pessoa {

    private String titulo;

    public Professor(String nome, String titulo) {
        super(nome);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String pronomeTratamento(String genero) {
        if (genero.equals("M")) {
            return titulo;
        } else {
            return titulo + "a";
        }
    }

    public String pronomeTratamento(String genero, String graduacao) {
        if (genero.equals("M")) {
            return titulo + " " + graduacao;
        } else {
            return titulo + " " + graduacao + "a";
        }
    }

}
