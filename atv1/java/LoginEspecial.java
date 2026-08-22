package atv1.java;

public class LoginEspecial extends Login {
    private String dica;

    public LoginEspecial(String nome, String senha, String dica) {
        super(nome, senha);
        this.dica = dica;
    }

    public String getDica() {
        return "Dica: " + this.dica;
    }
}
