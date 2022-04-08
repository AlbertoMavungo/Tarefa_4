public class EX04_4 {
    public static void main(String[] args) {
        
        EX03_4 v1 = new EX03_4("Preto","BMW");
        EX03_4 v2 = new EX03_4("Branco","Chevrolet");

        v1.ExibirInformacoes();
        v1.ligarVeiculo();
       
        v2.ExibirInformacoes();
        v2.ligarVeiculo();

        v1.getCor();

        v2.getCor();
        v2.getMarca();
    }
}
