public class ParcialDivision {
    public static void main(String[] args) {
        int dividendo = 8; 
        int divisor = 3; 

        int cociente = 0;
        int resto = dividendo;

        while (resto - divisor >= 0) {
            resto = resto - divisor;
            cociente = cociente + 1;
        }

        String tipoDivision;
        if (resto == 0) {
            tipoDivision = "exacta";
        } else {
            tipoDivision = "inexacta";
        }

        System.out.println("Tipo de división: " + tipoDivision);
        System.out.println("Resultado: " + cociente);
        if (tipoDivision == "inexacta") {
            System.out.println("Residuo: " + resto);
        }
    }
}
   

