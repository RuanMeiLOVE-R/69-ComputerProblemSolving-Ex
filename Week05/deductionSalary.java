void main() {
    IO.print("Enter Salary: ");
    double salary = Double.parseDouble(IO.readln());
    IO.print("Enter Deduction percent: ");
    double deductionPercent = Double.parseDouble(IO.readln());
    double deduction = salary * deductionPercent / 100;
    double netSalary = salary - deduction;
    IO.println("Deduction = " + deduction);
    IO.println("Net salary = " + netSalary);
}