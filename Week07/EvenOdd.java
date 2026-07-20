void main() {
    IO.print(("Enter Number: "));
    int number = Integer.parseInt(IO.readln());
    if (number % 2 == 0) {
        IO.println("The number " + number + " is  even");
    } else {
        IO.println("The number " + number + " is odd");
    }
    IO.println("จบโปรแกรม");
}