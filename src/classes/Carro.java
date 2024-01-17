package classes;

public class Carro {
    // Atributos
    private String modelo;
    private Integer ano;
    private String cor;

    public Carro(){}

    public Carro(String modelo, Integer ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

/*
*       Métodos acessores:
* Public -> Indica que qualquer um pode acessar o elemento;
* Private -> Indica que apenas a classe consegue acessar o elemento
* Protect -> Indica que somente a classe e seus filhos conseguem acessar;
* Default -> Somente a classe, seus filhos e as classes no mesmo package conseguem acessar.
* */