package celular;

public abstract class Celular implements CelularInterface {
    private double preco;
    private boolean enviarMensagem;
    private boolean acessarInternet;
    private boolean verificarEmails;
    private boolean assistirTV;
    private boolean acessarSistemaArquivos;

    public Celular(double preco, boolean enviarMensagem, boolean acessarInternet,
                   boolean verificarEmails, boolean assistirTV, boolean acessarSistemaArquivos) {
        this.preco = preco;
        this.enviarMensagem = enviarMensagem;
        this.acessarInternet = acessarInternet;
        this.verificarEmails = verificarEmails;
        this.assistirTV = assistirTV;
        this.acessarSistemaArquivos = acessarSistemaArquivos;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEnviarMensagem() {
        return enviarMensagem;
    }

    public void setEnviarMensagem(boolean enviarMensagem) {
        this.enviarMensagem = enviarMensagem;
    }

    public boolean isAcessarInternet() {
        return acessarInternet;
    }

    public void setAcessarInternet(boolean acessarInternet) {
        this.acessarInternet = acessarInternet;
    }

    public boolean isVerificarEmails() {
        return verificarEmails;
    }

    public void setVerificarEmails(boolean verificarEmails) {
        this.verificarEmails = verificarEmails;
    }

    public boolean isAssistirTV() {
        return assistirTV;
    }

    public void setAssistirTV(boolean assistirTV) {
        this.assistirTV = assistirTV;
    }

    public boolean isAcessarSistemaArquivos() {
        return acessarSistemaArquivos;
    }

    public void setAcessarSistemaArquivos(boolean acessarSistemaArquivos) {
        this.acessarSistemaArquivos = acessarSistemaArquivos;
    }
}

