package bytebank;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Hugo");
        f1.setSalario(100);
        f1.recebeAumento(50);

        // adicionando a data como tipo
        f1.dataEntrada = new Data();
        f1.dataEntrada.preencheData(1, 7, 2009);

        f1.mostra();
        
        Funcionario f2 = new Funcionario("Jorge");
        System.out.println(f2.getNome());
    }
}
