void main() {
    IO.print("Enter the price of product (per unit): ");
    double price = Double.parseDouble(IO.readln());
    IO.print("Enter quantity of the product: ");
    double quantity = Double.parseDouble(IO.readln());
    if (quantity > 10) {
        IO.println("You get a 10 % discount!");
        double total = price * quantity;
        double netTotal = total * 0.9;
        IO.println("Total Price: %.2f".formatted(netTotal));
    } else {
        double netTotal = price * quantity;
        IO.println("Total Price: %.2f".formatted(netTotal));
    }
}