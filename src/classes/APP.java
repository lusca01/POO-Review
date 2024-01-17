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

        Carro meuCarro1 = new Carro("Golf", 2023, "Chumbo");
        Carro meuCarro = new Carro();
        meuCarro.setAno(2024);
        meuCarro.setModelo("Golf");
        meuCarro.setCor("Chumbo");

        System.out.println("Ano -> " + meuCarro.getAno() + " | Modelo -> " + meuCarro.getModelo() + " | Cor -> " + meuCarro.getCor());
        System.out.println("Ano -> " + meuCarro1.getAno() + " | Modelo -> " + meuCarro1.getModelo() + " | Cor -> " + meuCarro1.getCor());

    }

}
