// Задача недели - Реализовать Односвязный список MyLinkedList.
// 1. Реализовать интерфейс MyList
// 2. Класс MyLinkedList не должен использовать массивы
// 3. В классе Main продемонстрировать работу MyLinkedList
// Подсказка -
// В классе MyLinkedList нужен приватный вложенный класс Node<T>,
// который будет содержать значение и ссылку на следующий элемент


public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLL = new MyLinkedList<>();

        myLL.add(11);
        myLL.add(12);
        myLL.add(13);
        myLL.add(14);
        myLL.add(15);

        System.out.println(myLL);
//        System.out.println( myLL.pop() );
//        System.out.println( myLL.get(3) );
//        System.out.println( myLL.size() );
    }
}