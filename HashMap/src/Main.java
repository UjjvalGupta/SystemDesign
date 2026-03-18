//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(5, "Ujjval");
        map.put(6, "Gupta");
        System.out.println("5th value: " + map.get(5));
        System.out.println("6th value: " + map.get(6));
        System.out.println("7th value: " + map.get(7));
    }
}