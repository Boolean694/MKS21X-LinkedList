public class Driver {
    public static void main(String[] forntite) {
        int[] ia = {0,1,2,3,4,5,6,7,8,9};
        MyLinkedList bean = new MyLinkedList(ia);
        System.out.println("Size: " + bean.size());
        System.out.println("Added element 10: " + bean.add(10));
        System.out.println(bean.toString());
    }
}
