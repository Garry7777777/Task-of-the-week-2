

public class MyLinkedList<T> implements MyList<T> {
    int size ;
    Node<T> ll ;

    public static class Node <T> {
        public T item;
        public Node<T> node;
    }

    @Override
    public void add(T item) {
       Node<T> nextItem = new Node<>();
       nextItem.item = item ;
       switch ( size++) {
           case 1:  ll = nextItem;  break;
           case 2:  ll.node = nextItem; break;
           default: nextItem.node = ll;
                    while (nextItem.node.node != null)
                        nextItem.node = nextItem.node.node;
                    nextItem.node.node = nextItem;
                    nextItem.node = null;
       }
    }

    @Override
    public T pop() {
        Node<T> tmp;
        tmp = ll.node;
        ll.node = ll.node.node;
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
        return (int)ll.item;
    }

    @Override
    public String toString() {
        String  tmp ="";
        for (int i=1; ll.size ;i++) {
        tmp = tmp +
        }
        return "MyLinkedList{" + "size=" + size + ", ll=" + ll + '}';
    }
}
