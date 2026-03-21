package org.example;

public class GovernoPais {

    private GovernoPais() {};

    private static GovernoPais instance = new GovernoPais();

    public static GovernoPais getInstance() {
        return instance;
    }

    private String nomePais;
    private String nomePresidente;

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getNomePresidente() {
        return nomePresidente;
    }

    public void setNomePresidente(String nomePresidente) {
        this.nomePresidente = nomePresidente;
    }
}
