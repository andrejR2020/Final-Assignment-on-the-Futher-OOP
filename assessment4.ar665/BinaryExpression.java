
/**
 * Write a description of class BinaryExpression here.
 *
 * @author Andrejs Romanovskis
 * @version 02.04.2020
 */
public class BinaryExpression implements Evaluable
{
    private int x;
    private int y;
    private Operator op1;
    

    public BinaryExpression(int x, int y, Operator op1)
    {
        this.x = x;
        this.y = y;
        this.op1 = op1;
    }

    public String toString()
    {
        return "(" + x + "" + op1 + "" + y + ")";
    }
    
    public int eval(){
        return op1.applyAsInt(x,y);
    }
}
