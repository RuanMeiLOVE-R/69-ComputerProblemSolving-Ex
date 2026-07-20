void main() {
    IO.print(("Enter num 1: "));
    int num1 = Integer.parseInt(IO.readln());
    IO.print(("Enter num 2: "));
    int num2 = Integer.parseInt(IO.readln());
    if (num1 > num2) {
        int total = num1 - num2;
        IO.println(num1 + " - " + num2 + " = " + total);
    } else if (num1 < num2) {
        int total = num1 + num2;
        IO.println(num1 + " + " + num2 + " = " + total);
    }
}