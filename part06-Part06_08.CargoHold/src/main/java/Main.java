
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!

        // Parte 1:
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);

        System.out.println("");
        // Parte 2:
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(10);
        System.out.println(suitcase); // 0 items (0kg)

        suitcase.addItem(book);
        System.out.println(suitcase); // 1 items (2kg)

        suitcase.addItem(phone);
        System.out.println(suitcase); // 2 items (3kg)

        //System.out.println("adicionar o brick");
        suitcase.addItem(brick);
        System.out.println(suitcase);

        System.out.println("");
        // Parte 4:
        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

        System.out.println("");
        // Parte 5:
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        System.out.println("");
        // Parte 6:
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);

        Item building = new Item("x", 4500);
        Suitcase enormous = new Suitcase(5000);
        enormous.addItem(building);
        hold.addSuitcase(enormous);

        System.out.println("aqui");
        System.out.println(hold);

        System.out.println("");
        // Parte 7:
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

}
