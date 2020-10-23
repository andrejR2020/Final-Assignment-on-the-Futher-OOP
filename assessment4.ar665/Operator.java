import java.util.function.IntBinaryOperator;

/**
 * Write a description of interface Evaluable here.
 *
 * @author Andrejs Romanovskis
 * @version 02.04.2020
 */
public enum Operator{
    PLUS("+", (x,y)->x +y),
    
    MINUS("-", (x,y)->x -y),
    
    TIMES("*", (x,y)->x *y);
    
    private String name;
    private IntBinaryOperator op;
    
    private Operator (String name, IntBinaryOperator op){
       this.name = name;
       this.op = op;
    }
    
    public String toString(){
        return name;
    }
    
    public int applyAsInt(int x, int y){
        return op.applyAsInt(x,y);
    }
}