public class Calculator {
    private int a, b;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void getAdd(){
        System.out.println(a + b);
    }
    public void getSub(){
        System.out.println(a - b);
    }
    public void getMul(){
        System.out.println(a * b);
    }
    public void getDiv(){
        if(b == 0){
            System.out.println(-1);
        }
        float result = (float) a / b;
        System.out.println(result);
    }

}
