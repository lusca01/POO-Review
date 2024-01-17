package classes;

public class APP {
    public static void main(String[] args) {

        System.out.println("Aprendendo POO com Java");

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Lucas");
        pessoa1.setIdade(20);

        System.out.println("O nome da pessoa 1 é -> " + pessoa1.getNome());

        Pessoa pessoa2 = new Pessoa();

        pessoa2.setNome("Piguineu");
        pessoa2.setIdade(35);

        Carro meuCarro = new Carro();
        meuCarro.ano = 2024;
        meuCarro.modelo = "Golf";
        meuCarro.cor = "Chumbo";

        System.out.println("Ano -> " + meuCarro.ano + " | Modelo -> " + meuCarro.modelo + " | Cor -> " + meuCarro.cor);

    }

}
