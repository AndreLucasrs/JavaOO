package bytebank;

public class TestaEmpresa {

    public static void main (String[] args) {
        Empresa empresa = new Empresa(12);
        empresa.setEmpregados( new Funcionario[10]);

        Funcionario f1 = new Funcionario();
        f1.setSalario(1000);
        f1.dataEntrada = new Data();
        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario();
        f2.setSalario(1700);
        f2.dataEntrada = new Data();
        empresa.adiciona(f2);

        empresa.getEmpregados()[0].mostra();
        empresa.getEmpregados()[1].mostra();
        
        empresa.mostraEmpregados();
        empresa.mostraTodasAsInformacoes();
    }
}
