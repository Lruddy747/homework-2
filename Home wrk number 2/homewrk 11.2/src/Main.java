public class Main {
    public static void main(String[] args) {

        Student aria = new Student("aria", "123 qwerty", 4547, "aria@email", "Freshman");

        for(Student a : aria){
            System.out.println(a);
        }

    }
}