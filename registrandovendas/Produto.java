package registrandovendas;

public class Produto {
    private String descricao;
    private double codigo;
    private float valorVenda, valorCusto;
    //private boolean promocao; TRUE OR FALSE;
    private int promocao; // 1 = TRUE, 0 = FALSE

    public Produto(String descricao, double codigo, float valorVenda, float valorCusto, int promocao) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }


    /*
    *
    *
    *
    * -------------------------GETTERS AND SETTERS-----------------------
    *
    *
    * */

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrisao) {
        this.descricao = descrisao;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public float getvalorVenda() {
        return valorVenda;
    }

    public void setvalorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getvalorCusto() {
        return valorCusto;
    }

    public void setvalorCusto(int valorCusto) {
        valorCusto = valorCusto;
    }

    public int getPromocao() {
        return promocao;
    }

    public void setPromocao(int promocao) {
        if (promocao == 1 || promocao == 0) {
            this.promocao = promocao;
        }
        else{
            System.out.println("Favor usar 1 ou 0 para informar se o objeto esta em promocao ou nao.");
        }
    }
}
