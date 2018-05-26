public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExecao ex) {
        	System.out.println(ex.getMessage());
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
        
    }

    private static void metodo1() throws MinhaExecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExecao {
        System.out.println("Ini do metodo2");
        //tem que usar o throw na assinatura do metodo
        new MinhaExecao("ERROOOOO");
        //Usando na classe MinhaExecao RuntimeException
        //throw new MinhaExecao("ERROOOOOOO");
        //throw new ArithmeticException("teste de ta muito errado");
        //System.out.println("Fim do metodo2");        
    }
}