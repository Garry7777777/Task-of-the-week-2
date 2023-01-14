

public class MyLinkedList<T> implements MyList<T> {
    int size ;
    Node<T> first;

    public static class Node <T> {
        public T item;
        public Node<T> node;
    }

    @Override
    public void add(T item) {
       Node<T> nextItem = new Node<>();
       nextItem.item = item ;
       switch ( size++) {
           case 1:  first = nextItem;  break;
           case 2:  first.node = nextItem; break;
           default: nextItem.node = first;
                    while (nextItem.node.node != null)
                        nextItem.node = nextItem.node.node;
                    nextItem.node.node = nextItem;
                    nextItem.node = null;
       }
    }

    @Override
    public T pop() {

        Node<T> tmp;
        tmp = first;
        if (size == 0) {
            first = null;
            return  tmp.item;
        }
        first = first.node;
        size--;
        return tmp.item;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }


}
