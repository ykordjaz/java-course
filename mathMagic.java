public class Magic {
	public static void main(String[] args) {
    int myNumber = 6;
    // Choose a random integer other than 0. We will refer to myNumber as the        original number from now on

    int stepOne = myNumber * myNumber;
    // Set it equal to the original number (myNumber) multiplied by itself.

		int stepTwo = stepOne + myNumber;

    int stepThree = stepTwo / myNumber;

    int stepFour = stepThree + 17;

    int stepFive = stepFour - myNumber;

    int stepSix = stepFive / 6;

    System.out.println(stepSix);

    // Now, go back to your code and change myNumber to any other integer. Run your program again. Math magic!
	}
}
