package Exceptions;

public class TestConexao {

    public static void main(String[] args) {

        Conexao con = null;
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }

    }


}

