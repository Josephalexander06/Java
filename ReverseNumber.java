public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
        int result=0 ;
        for(;num !=0;){
            int id = num % 10;
            result = result * 10 + id;
            num /=10;
        }
        System.out.println("Reverse = "+result);
    }
}
