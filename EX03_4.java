public class EX03_4 {
  
    private String cor;
    private String marca;

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public EX03_4(String cor, String marca){
        this.cor = cor;
        this.marca = marca;
    }

    public void ExibirInformacoes(){
        System.out.println("Informações do veículo");
        System.out.printf("\nCor: %s\nmarca: %s", this.cor, this.marca);
    }

    public void ligarVeiculo(){
        System.out.println("\nO veículo está ligado");
    }

}
