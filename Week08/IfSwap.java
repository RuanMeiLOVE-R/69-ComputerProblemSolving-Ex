void main() {
    int num3 = 0;
    IO.print("Enter Number 1: ");
    int num1 = Integer.parseInt(IO.readln());
    IO.print("Enter Number 2: ");
    int num2 = Integer.parseInt(IO.readln());
    if (num2 > num1) {
        IO.println("The second number is more than the first number ... Do nothing .. Bye bye !!!");
    } else {
        IO.println("Current -> number 1 = " + num1 + " and Number 2 = " + num2);
        IO.println("Swapping . . . . . . . ");
        num3 = num1;
        num1 = num2;
        num2 = num3;
        IO.println("Now -> Number 1 = " + num1 + " Number 2 = " + num2);
    }
}