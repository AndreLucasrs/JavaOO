public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (Exception ex) {
        	//System.out.println("ArithmeticException" + ex.getMessage());
        	System.out.println(ex.getMessage());
        	//ex.printStackTrace();
        } //catch (NullPointerException ex) {
        	//System.out.println("NullPointerException " + ex.getMessage());
        	//ex.printStackTrace();
		//}
        System.out.println("Fim do main");
        
    }

    private static void metodo1() throws MinhaExecao {
        System.out.println("Ini do metodo1");
        //try {
			metodo2();
		//} catch (ArithmeticException ex) {
			//System.out.println("ArithmeticException");
		//}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExecao {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //try {
            	Conta c = null;
            	c.deposita();
            	int a = i/0;
            //}catch (ArithmeticException ex) {
				//System.out.println("ArithmeticException");
			//}
            
        }
        System.out.println("Fim do metodo2");        
    }
}