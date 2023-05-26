package interpreter;

public class Concessionaria {

    public static String formula = "potencia * tempo * 0.80 / 1000";

    public static double calcularConta(double potencia, double tempo) {
        String expressao;
        expressao = formula.replace("potencia", Double.toString(potencia));
        expressao = expressao.replace("tempo", Double.toString(tempo));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

