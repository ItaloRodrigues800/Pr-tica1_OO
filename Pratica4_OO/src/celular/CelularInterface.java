package celular;

public interface CelularInterface {
    void ligar();
    void desligar();
    void usarCamera(boolean simNao);
    void usarFoneDeOuvido(boolean simNao);
    void controlarVolume(boolean simNao);
    boolean enviarMensagem();
    boolean acessarInternet();
    boolean verificarEmails();
    boolean assistirTV(boolean simNao);
    boolean acessarSistemaArquivos();
}

