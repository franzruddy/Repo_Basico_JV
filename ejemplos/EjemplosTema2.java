public class EjemplosTema2
{
    int [] arr= {3,4,5};
    public void verificarArray(int n, int m){
        int tam = calcularTam (n,m);
        arr =new int[tam]; 
    }
    private int calcularTam(int n , int m){
        return m+n;
    }
}
