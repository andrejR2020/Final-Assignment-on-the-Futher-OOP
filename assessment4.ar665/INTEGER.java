
/**
 * Write a description of class INTEGER here.
 *
 * @author Andrejs Romanovskis
 * @version 02.04.2020
 */
public class INTEGER implements Evaluable
{
    private int x;
    public INTEGER(int x){
        this.x = x;
    }
    
    public String toString(){
        return Integer.toString(x);
    }

    public int eval()
    {
        return x;
    }
}
