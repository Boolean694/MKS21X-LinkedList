public class Driver {
    public static void main(String[] forntite) {
        int[] ia = {0,1,2,3,4,5,6,7,8,9};
        MyLinkedList bean = new MyLinkedList(ia);
        /*System.out.println("Created new MyLinkedList: " + bean.toString());
        System.out.println("Size: " + bean.size());
        System.out.println("Added element 10: " + bean.add(10));
        System.out.println(bean.toString());
        System.out.println("Added element 12: " + bean.add(12));
        System.out.println(bean.toString());
        System.out.println("Element changed, old element: " + bean.set(11, 11));
        System.out.println(bean.toString());*/
        System.out.println("Contains element 7? " + bean.contains(7));
    }
}
