public class Test {
    static int sum(int n){
        if(n<=0){
        return 0;
        }
    
    return n  % 10+sum(n/10);
    
}
public static void main(String[] args) {
   System.out.println( Test.sum(-1-2-3-4-5));
    
}
}
