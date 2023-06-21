class UsuarioComum extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public UsuarioComum(String nome, String email, String senha, String cpf, String dataNascimento) {
        super(nome, email, senha);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}