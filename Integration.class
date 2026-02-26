package com.purpl.prog3;

public final class Integration {
    private Integration() {}

    public static class ResIntegral {
        double MIN = 0.000001;
        double MAX = 1000000.0;
        
        private double a;
        private double b;
        private double h;
        private Double result;

        public ResIntegral(double a, double b, double h) throws OutOfLimitException, ReversedSection, StepGreaterThenDiapason {
            if(a < MIN) {
                throw new OutOfLimitException("Неверное значение а число должно быть в диапазоне: 0,000001-1000000. а = ", a);
            }
            
            if(b > MAX) {
                throw new OutOfLimitException("Неверное значение b - числа должно быть в диапазоне: 0,000001-1000000. b = ", b);
            }
            
            if(a > b) {
                throw new ReversedSection("Нижняя граница a должна быть меньше верхней b");
            }
            
            if(h >(b-a)) {
                throw new StepGreaterThenDiapason("Шаг должен быть меньше диапозна интегрирования.");
            }

            
            this.a = a;
            this.b = b;
            this.h = h;
        }
        public double getA(){
            return this.a;
        }
        public double getB(){
            return this.b;
        }
        public double getH(){
            return this.h;
        }
        
        public Double getRes(){
            return this.result;
        }
        
        public void setA(double num){
            this.a = num;
        }
        public void setB(double num){
            this.b = num;
        }
        public void setH(double num){
            this.h = num;
        }
        public void setRes(double num){
            this.result = num;
        }
    }
    
        

    public static double integrateSin(double a, double b, double h) {
        if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(h)) {
            throw new IllegalArgumentException("Параметры должны быть конечными числами.");
        }
        if (h <= 0) throw new IllegalArgumentException("Шаг должен быть > 0.");
        if (a == b) return 0.0;

        double sign = 1.0;
        if (a > b) {
            double tmp = a; a = b; b = tmp;
            sign = -1.0;
        }

        double sum = 0.0;
        double x = a;

        while (x < b) {
            double x2 = Math.min(x + h, b);
            sum += (Math.cos(x*x) + Math.cos(x2*x2)) * 0.5 * (x2 - x);
            x = x2;
        }
        return sign * sum;
    }
}
