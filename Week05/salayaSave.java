void main() {
    IO.print("Enter Initial Saving: ");
    double InitialSaving = Double.parseDouble(IO.readln());
    IO.print("Enter MonthlySaving: ");
    double MonthlySaving = Double.parseDouble(IO.readln());
    IO.print("Enter Months: ");
    double Months = Double.parseDouble(IO.readln());
    IO.print("Enter Interest percent: ");
    double InterestPercent = Double.parseDouble(IO.readln());
    double TotalSaving = InitialSaving + MonthlySaving * Months;
    double Interest = TotalSaving * InterestPercent / 100;
    double FinalSaving = TotalSaving + Interest;
    IO.println("TotalSaving = " + TotalSaving);
    IO.println("Interest = " + Interest);
    IO.println("FinalSaving = " + FinalSaving);
}