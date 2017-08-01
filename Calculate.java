public class Calculate {
public static void main(String[]arg){
System.out.println("Calculate...");
int first = Integer.valueOf(arg[0]);
int second = Integer.valueOf(arg[1]);
int summ = first + second;
int subt  = first - second;
int mult  = first * second;
double div  = (double)first / (double)second;

System.out.println("Summa="+ summ);
System.out.println("Subttaction="+ subt);
System.out.println("Multiplication="+ mult);
System.out.println("Division="+ div);

}
}