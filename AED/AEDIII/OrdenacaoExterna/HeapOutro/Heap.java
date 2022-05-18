package OrdenacaoExterna.HeapOutro;


class Heap {

    private int capacity;
    private final boolean canGrow;

    private HeapElement[] heapElements;
    private int numElements;

    private final int typeHeap; // 1 => MAX	  -1 => MIN

    public Heap(int capacity, boolean cangrow, int type) {
        this.capacity = capacity;
        canGrow = cangrow;
        typeHeap = type;
        heapElements = new HeapElement[capacity + 1];
        numElements = 0;
    }


    public int getCapacity() {
        return capacity;
    }

    public boolean getCanGrow() {
        return canGrow;
    }

    public int getNumElements() {
        return numElements;
    }

    public void insert(Comparable<String> prio, Object elem) {
        if (numElements == capacity && canGrow) {
            HeapElement[] newHeap = new HeapElement[2 * capacity + 1];
            for (int i = 1; i <= capacity; i++)
                newHeap[i] = heapElements[i];
            capacity *= 2;
            heapElements = newHeap;
        } else if (numElements == capacity) {
            throw new RuntimeException("Heap overflow !!!");
        }
        numElements++;
        heapElements[numElements] = new HeapElement(prio, elem);
        upHeap(numElements);
    }

    public Object remove() {
        if (numElements == 0)
            throw new RuntimeException("Heap underflow !!!");
        HeapElement morePriority = heapElements[1];
        heapElements[1] = heapElements[numElements];
        numElements--;
        downHeap();
        return morePriority.getElement();
    }

    private void upHeap(int i) {
        int j = i / 2;
        HeapElement aux = heapElements[i];
        Comparable prio = aux.getPriority();

        while (j >= 1) {
            System.out.print((typeHeap * prio.compareTo(heapElements[j].getPriority()) > 0) + " ");
            if (typeHeap * prio.compareTo(heapElements[j].getPriority()) > 0) {
                heapElements[i] = heapElements[j];
                i = j;
                j = i / 2;
            } else
                j = 0;
        }
        System.out.println();
        heapElements[i] = aux;
    }

    private void downHeap() {
        int i = 1;
        int j = 2;
        HeapElement aux = heapElements[i];
        Comparable prio = aux.getPriority();

        while (j <= numElements) {
            if (j < numElements) {
                if (typeHeap * heapElements[j + 1].getPriority().compareTo(heapElements[j].getPriority()) > 0)
                    j++;
            }
            if (typeHeap * prio.compareTo(heapElements[j].getPriority()) < 0) {
                heapElements[i] = heapElements[j];
                i = j;
                j = 2 * i;
            } else
                j = numElements + 1;
        }
        heapElements[i] = aux;
    }

    public String toString() {
        String aux = "";
        for (int i = 1; i <= numElements; i++)
            aux += heapElements[i].toString() + "\n";
        return aux;
    }

    private static class HeapElement {
        private Comparable Priority;
        private Object Element;

        public HeapElement(Comparable<String> prio, Object elem) {
            setPriority(prio);
            setElement(elem);
        }

        public Comparable getPriority() {
            return Priority;
        }

        public Object getElement() {
            return Element;
        }

        public void setPriority(Comparable prio) {
            Priority = prio;
        }

        public void setElement(Object elem) {
            Element = elem;
        }

        public String toString() {
            return Priority.toString() + " - " +
                    Element.toString();
        }
    }
}

