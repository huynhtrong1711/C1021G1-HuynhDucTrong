package ss10_array_list.bai_tap.phuong_thuc_arraylist;

public class MylistTestEx {
    public static void main(String[] args) {
        MyListEx<Integer> myListEx = new MyListEx<>();
        myListEx.add(7,0);
        myListEx.add(3,1);
        myListEx.add(5,2);
        myListEx.remove(1);
        myListEx.add(9);
        System.out.println(myListEx);
        myListEx.clear();
        System.out.println(myListEx);
        System.out.println(myListEx.size());



    }

}
