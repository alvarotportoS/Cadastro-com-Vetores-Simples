import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Produto[] produtos = new Produto[quantidade];

        // Cadastro dos produtos
        for (int i = 0; i < quantidade; i++) {
            produtos[i] = new Produto();
            System.out.println("\nProduto " + (i + 1) + ":");
            System.out.print("Nome: ");
            produtos[i].nome = sc.nextLine();
            System.out.print("Preço: ");
            produtos[i].preco = sc.nextDouble();
            sc.nextLine(); // limpar buffer
        }

        System.out.println("\nProdutos Cadastrados");
        for (Produto p : produtos) {
            p.imprimirInformacoes();
        }

        // Encontrar o produto mais caro
        Produto maisCaro = produtos[0];
        for (int i = 1; i < produtos.length; i++) {
            if (produtos[i].preco > maisCaro.preco) {
                maisCaro = produtos[i];
            }
        }

        System.out.println("\nProduto mais caro: " + maisCaro.nome + " | Preço: " + maisCaro.preco);

        sc.close();
    }
}