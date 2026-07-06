void main() {
    IO.print("Enter wide: ");
    double wide = Double.parseDouble(IO.readln());
    IO.print("Enter long: ");
    double longs = Double.parseDouble(IO.readln());
    double Total = wide * longs / 360;
    IO.println("BSA = %.2f".formatted(Total));
}