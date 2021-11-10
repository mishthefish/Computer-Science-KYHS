import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	private String question; 
	private ArrayList<String> expression;
	private String answer;
	
	//add in instance variables

	public ExpressionSolver(String s)
	{
		setExpression(s);

		answer = "";
	}

	public void setExpression(String s)
	{
		question = s;
		expression = new ArrayList<String>();
		String fields[] = s.split(" ");
		for (String str : fields) {

			expression.add(str);

			}

			answer = "";
	}

	public void solveExpression()
	{
		while (expression.contains("/")) {

			// finding index of /

			int index = expression.indexOf("/");

			// finding operands before and after index

			int operand1 = Integer.parseInt(expression.get(index - 1));

			int operand2 = Integer.parseInt(expression.get(index + 1));

			// performing division operation

			int result = operand1 / operand2;

			// replacing second operand

			expression.set(index + 1, "" + result);

			// removing operator

			expression.remove(index);

			// removing first operand

			expression.remove(index - 1);

			}
		while (expression.contains("*")) {

			int index = expression.indexOf("*");

			int operand1 = Integer.parseInt(expression.get(index - 1));

			int operand2 = Integer.parseInt(expression.get(index + 1));

			int result = operand1 * operand2;

			expression.set(index + 1, "" + result);

			expression.remove(index);

			expression.remove(index - 1);

			}
		while (expression.contains("-")) {

			int index = expression.indexOf("-");

			int operand1 = Integer.parseInt(expression.get(index - 1));

			int operand2 = Integer.parseInt(expression.get(index + 1));

			int result = operand1 - operand2;

			expression.set(index + 1, "" + result);

			expression.remove(index);

			expression.remove(index - 1);

			}
		// doing the same for + operator

		while (expression.contains("+")) {

		int index = expression.indexOf("+");

		int operand1 = Integer.parseInt(expression.get(index - 1));

		int operand2 = Integer.parseInt(expression.get(index + 1));

		int result = operand1 + operand2;

		expression.set(index + 1, "" + result);

		expression.remove(index);

		expression.remove(index - 1);

		}
		answer = expression.get(0);
	}

	public String toString( )
	{
		return question + " = " + answer;
	}	
}