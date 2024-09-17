abstract class Operacao {
    abstract double calcular(double a, double b) throws Exception;
}

// Subclasse para soma
class Soma extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a + b;
    }
}

// Subclasse para subtração
class Subtracao extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a - b;
    }
}

// Subclasse para multiplicação
class Multiplicacao extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a * b;
    }
}

// Subclasse para divisão
class Divisao extends Operacao {
    @Override
    double calcular(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }
}

// Subclasse para raiz quadrada
class RaizQuadrada extends Operacao {
    @Override
    double calcular(double a, double b) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Raiz quadrada de número negativo não permitida.");
        }
        return Math.sqrt(a);
    }
}
