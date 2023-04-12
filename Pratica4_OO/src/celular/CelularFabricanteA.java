package celular;

public class CelularFabricanteA extends Celular {
    private boolean temTV;

    public CelularFabricanteA(double preco, boolean enviarMensagem, boolean acessarInternet,
                              boolean verificarEmails, boolean assistirTV, boolean acessarSistemaArquivos, boolean temTV) {
        super(preco, enviarMensagem, acessarInternet, verificarEmails, assistirTV, acessarSistemaArquivos);
        this.temTV = temTV;
    }

    // Implementação dos métodos da interface
    public void ligar() {
        System.out.println("Ligando o celular");
    }
}

