import java.util.ArrayList;

class Evento {
    private String titulo;
    private String data;
    private String hora;
    private String local;

    public Evento(String titulo, String data, String hora, String local) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
        this.local = local;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }
}