package hilos;

/**
 *
 * @author cmateo
 */
public class THilo2 extends Thread{

    private ISumatoria suma;

    public THilo2() {
        super();
        suma = null;
    }

    public void setSuma(ISumatoria suma) {
        this.suma = suma;
    }

    public ISumatoria getSumatoria() {
        return suma;
    }

    @Override
    public void run() {
        int i, n;
        long res;
        res = 0;
        n = suma.getN();
        for (i = 1; i <= n; i++) {
            res += i;
        }
        suma.onResultado(res);
    }
}
