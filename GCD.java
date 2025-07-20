public class GCD {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        while(num1 != num2){
            if(num1 > num2){
            num1 -= num2;
        }else{
            num2 -= num1;
        }
    }
        System.err.println("GCD = "+num1);
    }
}
