public class BooleanExpressionsDemo {
    public static void main(String[] args) {
	
	//declare boolean variables
	boolean isJavaFun = true;
	boolean isHomeworkTiring = false;

	//declare integer variables
	int a = 15;
	int b = 20;

	boolean isAGreater = a > b; //relational expression - greater than
	boolean areEqual = a == b; //relational expression - equal to
	boolean bothTrue = isJavaFun && (a < b); //logical expression - AND
	boolean eitherTrue = isJavaFun || isHomeworkTiring; //logical expression - OR
	boolean notTrue =!isHomeworkTiring; //logical expression - NOT
	boolean exclusiveOr = isJavaFun ^ isHomeworkTiring; //logical expression - XOR

	//display formatted output
	System.out.println("Is Java fun? " + isJavaFun);
	System.out.println("Is homework tiring? " + isHomeworkTiring);
	System.out.println("Is 'a' greater than 'b'? " + isAGreater);
	System.out.println("Are 'a' and 'b' equal? " + areEqual);
	System.out.println("Both conditions (isJavaFun && a<b): " + bothTrue);
	System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
	System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
	System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);

    }
}
