import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        UsuarioComum usuarioComum1 = new UsuarioComum("Italo", "italo34@gmail.com", "senha12345", "12547896321", "01/01/2000");


        Promotor promotor1 = new Promotor("Henrique", "henrique1@email.com", "senha12345", "9876543217771");


        ArrayList<Evento> eventos = new ArrayList<Evento>();
        Evento evento1 = new Evento("ROCK IN RIO", "04/09/2022", "11:00", "Parque Olimpico RJ");
        eventos.add(evento1);


        ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
        Ingresso ingressoVip = new Ingresso(evento1, 300.0, 10000);
        Ingresso ingressoCamarote = new Ingresso(evento1, 500.0, 20000);
        Ingresso ingressoPista = new Ingresso(evento1, 150.0, 50000);
        ingressos.add(ingressoVip);
        ingressos.add(ingressoCamarote);
        ingressos.add(ingressoPista);


        VendaSite vendaSite1 = new VendaSite();
        vendaSite1.setQtdeMax(100000);


        if (vendaSite1.validaQtdeIngresso()) {
            vendaSite1.insereIngressoVenda(ingressoVip);
            vendaSite1.insereIngressoVenda(ingressoCamarote);
            vendaSite1.insereIngressoVenda(ingressoPista);
        }
    }
}