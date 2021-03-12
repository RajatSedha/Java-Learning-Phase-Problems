public class Sum3And5 {
    public static void main(String[] args) {
        System.out.println(sum35(1,10));
    }
    public static int sum35(int a, int b){
        int sum = 0;
        if(a>=0 && b>=0){
            for(int i =a;i<=b;i++){
                if(i%3==0){
                    if(i%5==0){
                        sum+=i;
                    }
                }
            }
        }
        return sum;
    }
}
