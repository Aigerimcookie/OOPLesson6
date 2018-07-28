public class Factorial {

    void fact( int n){
        int res = 1;
        for (int i = 1; i <=n ; i++) {
            res *= i;

        }
        System.out.println("Fact:"+res);
    }

    public static void main(String[] args) {
        new Factorial().fact(5);
    }

}
