
import java.util.Scanner;

public class EX02_4{
    public static void main(String[] args) {

        EX01_4 v1 = new EX01_4();
        EX01_4 v2 = new EX01_4();

        Scanner scn = new Scanner(System.in);
    
        System.out.printf("Cor do 1º veiculo: ");
        String cor = scn.nextLine();
        System.out.printf("\nmarca do 1º veiculo: ");
        String marca =scn.nextLine();
        v1.setCor(cor);
        v1.setMarca(marca);
       
        System.out.printf("Cor do veiculo 1: ");
        String cor2 = scn.nextLine();
        System.out.printf("\nmarca do veiculo 1: ");
        String marca2 =scn.nextLine();
        v2.setCor(cor2);
        v2.setMarca(marca2);

        v1.ExibirInformacoes();
        v1.ligarVeiculo();
    
        System.out.println();
        v2.ExibirInformacoes();
        v2.ligarVeiculo();
        v1.getCor();
        v1.getMarca();
        v2.getCor();
        v2.getMarca();
        scn.close();
    }
}
