package basic.java.day3.ex6;

public class Main {
    public static void main(String[] args) {
        Email email = new Email.Builder()
                .receiver("sda")
                .title("new course")
                .bodyMsg("text")
                .attachment("lesson.pdf")
                .build();

        System.out.println(email);
        Email email2 = new Email.Builder()
                .receiver("John Doe")
                .bodyMsg("Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
                .build();

        System.out.println(email2);

    }
}
