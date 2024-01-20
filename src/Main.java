import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("a", 5));
        list.add(new Member("b", 6));
        list.add(new Member("c", 7));
        list.add(new Member("d", 8));
        list.add(new Member("e", 9));
        list.add(new Member("f", 5));
        // stream map1
        list.stream()
                .map(member -> member.getName())
                .forEach(System.out::println);

        // stream map2
        list.stream()
                .map(member -> member.getAge())
                .forEach(System.out::println);
    }
}

record Member(String name, int age) {
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}