
package hilos;

/**
 *
 * @author cmateo
 */
public class THilo1 extends Thread {
    
    private int n;
    private long resultado;
    
    public THilo1(){
        super();
        n = 0;
        resultado = 0;
    }
    
    public void setN(int n){
        this.n = n;
    }
    
    public int getN(){
        return n;
    }
    
    public long getResultado(){
        return resultado;
    }
    
    @Override
    public void run(){
        int i; 
        resultado = 0;
        for(i = 1; i <= n; i++){
            resultado += i;
        }
    }
}
