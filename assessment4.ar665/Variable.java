import java.util.Scanner;
/**
 * Write a description of class Variable here.
 *
 * @author Andrejs Romanovskis
 * @version 02.04.2020
 */
public class Variable implements Evaluable
{

    private String name;
    private int value = -1;
    
    public Variable(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
    
    public int eval(){
        if (value >= 0){
            return value;
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.println("Could you please enter the value for this variable: " + name);
            value = scan.nextInt();
            return value;
        }
    }
}
