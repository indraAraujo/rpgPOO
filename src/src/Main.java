package src;


import src.Login;



public class Main {

    public static void main(String[] args) {
        Loja loja = new Loja();
        Produto produto;
        produto = new Produto(Descricao.ATAQUE);
        produto.setPreco(2.50);
        loja.adicionarProduto(produto);
        
        produto = new Produto(Descricao.DEFESA);
        produto.setPreco(3.75);
        loja.adicionarProduto(produto);
        
        produto = new Produto(Descricao.CURA);
        produto.setPreco(4.00);
        loja.adicionarProduto(produto);
        
        System.out.println(loja.produtos);
        Login start = new Login();
        start.setVisible(true);
        
    }
    
}
