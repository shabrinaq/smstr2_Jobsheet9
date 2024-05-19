/**
 * SLLMain21
 */
public class SLLMain21 {

    public static void main(String[] args) {
        SingleLinkedList21 singLL=new SingleLinkedList21();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAfter(3, 833);
        singLL.print();
    }
}