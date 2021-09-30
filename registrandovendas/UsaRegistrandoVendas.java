package registrandovendas;

public class UsaRegistrandoVendas {
    public static void main(String[] args) {
        Produto sabaoIPE = new Produto("Sabao em po IPE",0001,12,4,0);
        Vendedor leonardinho = new Vendedor("Leonardinho","Avenida das torres 120",327);
        Venda venda1 = new Venda(sabaoIPE, leonardinho, 2,0);
        venda1.calcularValor();
        venda1.calcularComissao();
        venda1.imprimir();

        Produto ps4 = new Produto("Ps4 novinho, promocao", 0002, 100, 80, 1);
        Vendedor luispezas = new Vendedor("Luiz Pezas", "Rua das flores 140", 420);
        Venda venda2 = new Venda(ps4,luispezas,3,10);
        venda2.calcularValor();
        venda2.calcularComissao();
        venda2.imprimir();

        Venda venda3 = new Venda(ps4, luispezas, 2, 30);
        venda3.calcularValor();
        venda3.calcularComissao();
        venda3.imprimir();
        
    }

}
