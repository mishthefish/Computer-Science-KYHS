import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> expressions;
		expressions = new ArrayList<String>(); 
		while (scanner.hasNext()) {

			String line = scanner.nextLine();

			expressions.add(line);

			}

			//now looping through each expression

			for (String str : expressions) {

			//creating an ExpressionSolver object, passing theexpression

			ExpressionSolver solver = new ExpressionSolver(str);

			//solving

			solver.solveExpression();

			//printing result

			System.out.println(solver);

			}
	}
}