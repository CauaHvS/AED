package OrdenacaoExterna.HeapOutro;

public class HeapMinTest {
    public static void main(String[] args) {

        Heap h = new Heap(15, false, -1);

        System.out.println("Capacity: " + h.getCapacity() +
                "\tNum.Elem: " + h.getNumElements() +
                "\tCan grow: " + h.getCanGrow());

        h.insert("A", new Empresa(1, "Empresa AAA"));
        h.insert("D", new Empresa(2, "Empresa DDD"));
        h.insert("C", new Empresa(3, "Empresa CCC"));
        h.insert("G", new Empresa(4, "Empresa GGG"));
        h.insert("F", new Empresa(5, "Empresa FFF"));
        h.insert("X", new Empresa(6, "Empresa XXX"));
        h.insert("T", new Empresa(7, "Empresa TTT"));
        h.insert("B", new Empresa(8, "Empresa BBB"));
        h.insert("E", new Empresa(9, "Empresa EEE"));

        System.out.println("Capacity: " + h.getCapacity() +
                "\tNum.Elem: " + h.getNumElements() +
                "\tCan grow: " + h.getCanGrow());

        while (h.getNumElements() > 0) {
            Empresa empr = (Empresa) h.remove();
            System.out.println(empr);
        }
    }
}
