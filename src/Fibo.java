public class Fibo {

    int f0;
    int f1;
    int f2;
    int fiboInteretivo(int N){
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;

        for(int K = 1; K <= N + 1 ; K++){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;

        }
        return f0;
    }

    int fiboRecursivo(int N){
        if(N <= 1){
            return N;
        } else
            return fiboRecursivo(N- 1) + fiboRecursivo(N - 2);
    }
}
