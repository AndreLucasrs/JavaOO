public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
        	//System.out.println("ArithmeticException" + ex.getMessage());
        	System.out.println(ex.getMessage());
        	//ex.printStackTrace();
        } //catch (NullPointerException ex) {
        	//System.out.println("NullPointerException " + ex.getMessage());
        	//ex.printStackTrace();
		//}
        System.out.println("Fim do main");
        
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        //try {
			metodo2();
		//} catch (ArithmeticException ex) {
			//System.out.println("ArithmeticException");
		//}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
    	System.out.println("Ini metodo 2");
    	metodo2();
    	System.out.println("Fim metodo 2");
    }
}