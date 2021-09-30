package registrandovendas;

public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private float desconto, quantidadeItens,valor=0;


    public Venda(Produto produto, Vendedor vendedor,float quantidadeItens, float desconto) {
        this.produto = produto;
        this.vendedor = vendedor;
        this.desconto = desconto;
        this.quantidadeItens = quantidadeItens;
    }


    public float calcularValor() {
        if (produto.getPromocao() == 1) {
            valor = (quantidadeItens * produto.getvalorVenda()) - (efetuarDesconto(desconto));
        }
        else {
            valor = quantidadeItens * produto.getvalorVenda();
        }
        return valor;
    }

    public float calcularComissao() {
        float comissao;

        //Comissao sera 10% do valor da venda

        if (produto.getPromocao() == 1){
            comissao = (vendedor.getComissao()/100) * valor / 2;
        }

        else{
            comissao = (vendedor.getComissao()/100) * valor;
        }

        return comissao;
    }

    public float efetuarDesconto(float desconto) {
        float des;
        des = quantidadeItens*(produto.getvalorVenda() * (desconto /100));

        if (produto.getvalorVenda() - (produto.getvalorVenda() * (desconto / 100)) < produto.getvalorCusto()){
            des = 0;
        }
        return des;
    }

    public void imprimir() {
        int a;
        System.out.println("----------------------------------------------------------------");
        System.out.println("Codigo do Vendedor: "+vendedor.getCodigo());
        System.out.println("Vendedor: "+vendedor.getNome());
        System.out.println("Comissao do vendedor: "+ calcularComissao());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Quantidade de itens: "+quantidadeItens);
        System.out.println("Valor do produto: "+ produto.getvalorVenda());
        a = produto.getPromocao();
        if (a == 0){
            System.out.println("O produto nao esta em promocao.");
        }
        if (a == 1){
            System.out.println("O produto esta em promocao.");
            System.out.println("Valor antes dos descontos: "+ quantidadeItens*produto.getvalorVenda());
            System.out.println("Valor dos descontos: "+efetuarDesconto(desconto));
            if (efetuarDesconto(desconto)==0){
                System.out.println("Desconto invalido");
            }
        }
        System.out.println("Valor final: "+calcularValor());

    }







    /*
     *
     *
     *
     * -------------------------GETTERS AND SETTERS-----------------------
     *
     *
     * */

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(float quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
