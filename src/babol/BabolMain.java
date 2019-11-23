package babol;

public class BabolMain {
    public static void main(String[] args) {
        int[] t = TableUtilities.createAndFillTable(10, 5, 20);
        BubbleSort bs = new BubbleSort();
        System.out.println("Tablica przed sortowaniem");
        TableUtilities.print(t);
        bs.sort(t);
        System.out.println("Tabica po sortowaniu");
        TableUtilities.print(t);
    }
}
