package cursohuetamo;

public class EjemploVariable {

    public static void main(String[] args) {
        //Declaramos variables

        //Entero
        int varEntera;
        //Decimal
        double varDecimal;
        //Cadenas
        String varCadena;
        //Booleana
        boolean varBoleana;

        //Asignar
        varEntera = 2;
        varDecimal = 2.3;
        varCadena = "Soy una cadena";
        varBoleana = true;
        double res;

        //Devolvemos la variable
        System.out.println(varEntera);
        System.out.println(varDecimal);
        System.out.println(varCadena);
        System.out.println(varBoleana);

        //Operaciones
        //Suma
        res = varEntera + varDecimal;
        System.out.println("La suma de " + varEntera + " + " + varDecimal + " es: " + res);
        
         //Multiplicacion
        res = varEntera * varDecimal;
        System.out.println("La Multiplicacion de " + varEntera + " * " + varDecimal + " es: " + res);
        
         //Division
        res = varEntera / varDecimal;
        System.out.println("La division de " + varEntera + " / " + varDecimal + " es: " + res);
        
         //Resto de la division
        res = varEntera % varDecimal;
        System.out.println("El resto de " + varEntera + " % " + varDecimal + " es: " + res);
        
         //Resta
        res = varEntera - varDecimal;
        System.out.println("La resta de " + varEntera + " - " + varDecimal + " es: " + res);

    }
}
