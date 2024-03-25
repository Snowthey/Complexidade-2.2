public class Fibo {

    int f0;
    int f1;
    int f2;
    int fiboIterativo(int n){
        f0 = 0;
        f1 = 1;
        for (int k = 1; k <= n; k++){
            f2 = f0 +f1;
            f0 = f1;
            f1 = f2;
        }
        return f0;
    }

    int fiboRecursivo(int n){
        if(n <= 1){
            return n;
        } else{
            return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
        }
    }
}
