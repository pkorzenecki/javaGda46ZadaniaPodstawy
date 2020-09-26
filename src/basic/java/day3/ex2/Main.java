package basic.java.day3.ex2;

public class Main {
    public static void main(String[] args) {
        Poem[] poems = new Poem[3];
        Author author1 = new Author("Tuwim", "PL");
        Author author2 = new Author("Chotomska", "PL");
        Author author3 = new Author("Keats", "GB");
        poems[0] = new Poem(author1, 230);
        poems[1] = new Poem(author2, 45);
        poems[2] = new Poem(author3, 540);

        String author = getSurnameWithLongestPoem(poems);
        System.out.println("Author with the longest poem is: " + author);
    }

    private static String getSurnameWithLongestPoem(Poem[] poems) {
        int counter = 0;
        Author author = null;
        for (Poem poem : poems) {
            if (poem.getStropheNumber() > counter) {
                counter = poem.getStropheNumber();
                author = poem.getCreator();

            }
        }
        return author.getSurname();
    }


}
