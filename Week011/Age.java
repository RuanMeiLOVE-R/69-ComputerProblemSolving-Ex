void main() {
    IO.print("Enter Age: ");
    int age = Integer.parseInt(IO.readln());

    String genAge;

    if (age <= 0 || age > 109) {
        genAge = "Error Input";
    } else if (age <= 9) {
        genAge = "child";
    } else if (age <= 19) {
        genAge = "Teenage";
    } else if (age <= 59) {
        genAge = "Adult";
    } else {
        genAge = "Senior";
    }

    IO.println("Your gen age is " + genAge);
}