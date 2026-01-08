package dam.ed;

public class Calculadora {

    /**
     * Sumamos dos números con decimales y devolvemos su resultado.
     * @param a Primer número con decimales.
     * @param b Segundo número con decimales.
     * @return Resultado de sumar a y b.
     */
    double suma(double a, double b) {
        return a + b;
    }

    /**
     * Restamos dos números con decimales y devolvemos el resultado.
     * @param minuendo Número decimal del que partimos.
     * @param sustraendo Número decimal el cual sustraemos al minuendo.
     * @return Resultado de la resta.
     */
    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    /**
     * Multiplicamos dos números decimales.
     * @param a Primer número decimal a multiplicar.
     * @param b Segundo número decimal a multiplicar.
     * @return Devolvemos su resultado.
     */
    double multiplica(double a, double b) {
        return (a * b);
    }

    /**
     * Dividimos dos números decimales.
     * @param dividendo Primer número decimal del cual partimos.
     * @param divisor Segundo número decimal el cual divide.
     * @return Devolvemos su resultado.
     */
    double divide(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("El divisor es 0");
        }
        return dividendo / divisor;
    }

    /**
     * Método que calcula el factorial de un entero
     * @param numero
     * @return
     * @throws Exception
     */
    int factorial (int numero) throws Exception {
        int resultado = 1;
        if(numero>0){
            for (int i=1; i <= numero; i++) {
                resultado *= i;
            }
        }else{
            throw new Exception("No se puede hacer el factorial de un número negativo o cero");
        }
        return resultado;
    }

    /**
     * Método que comprueba si un número es primo o no
     * @param numero
     * @return
     * @throws Exception
     */
    boolean esPrimo (int numero) throws Exception {
        boolean esNumeroPrimo = true;
        if(numero<0){
            throw new Exception("Un número negativo no puede ser primo");
        }else{
            for (int i = 2; i < numero && esNumeroPrimo; i++) {
                if (numero % i == 0) {
                    esNumeroPrimo = false;
                }
            }
        }
        return esNumeroPrimo;
    }

    /**
     * Método que calcula la raíz cuadrada de un número.
     * @param radicando Número para dividir la raíz cuadrada.
     * @return Resultado de la división de la raíz cuadrada encontrada.
     */
    double raizCuadrada(double radicando) throws Exception {
        boolean stop = false;
        double resultado = 0.0;
        if (radicando < 0){
            throw new Exception("El radicando no puede ser negativo.");
        } else if (radicando==1) {
            resultado=radicando;
        }
        resultado= Math.sqrt(radicando);

        return resultado;
    }
}