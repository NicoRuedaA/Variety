package es.cide.programacio;

public class Calculadora {
        //atributos
        double operador1, operador2;

        //constructor
        public Calculadora(double op1, double op2){
            this.operador1 = op1;
            this.operador2 = op2;
        }

        //getter y setter
        public void setOperator1(int opet){
            this.operador1=opet;
        }

        public void setOperator2(int opet){
            this.operador2=opet;
        }

        public double getOperator1(){
            return this.operador1;
        }

        public double getOperator2(){
            return this.operador2;
        }

        //metodos
        public double Sumar(){
            double resultado = operador1 + operador2;
            return resultado;
        }

        public double Restar(){
            double resultado = operador1 - operador2;
            return resultado;
        }

        public double Multiplicar(){
            double resultado = operador1 * operador2;
            return resultado;
        }

        public double Dividir(){
            double resultado = operador1 / operador2;
            return resultado;
        }

}
