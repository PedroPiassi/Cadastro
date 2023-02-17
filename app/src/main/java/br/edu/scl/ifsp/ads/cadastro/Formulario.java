package br.edu.scl.ifsp.ads.cadastro;

public class Formulario {
    private String nome, telefone, email, cidade, uf;
    private boolean ingressa;
    private String sexo;

    public Formulario(String nome, String telefone, String email, String cidade, String uf, boolean ingressa, String sexo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.uf = uf;
        this.ingressa = ingressa;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Formulario: " +
                "\nNome Completo: " + nome +
                "\nTelefone: " + telefone +
                "\nE-mail: " + email +
                "\nLista de e-mail: " + (ingressa ? "Sim" : "Não") +
                "\nSexo: " + sexo +
                "\nCidade: " + cidade +
                "\nUF: " + uf;
    }
}