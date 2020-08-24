package PractiveProxy;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy mathCalculatorProxy = new MathCalculatorProxy();
        double result = mathCalculatorProxy.add(1,2);
        System.out.println("kết quả là: "+result);
        result = mathCalculatorProxy.add(1,Double.MAX_VALUE);
        System.out.println(result);
    }
}
