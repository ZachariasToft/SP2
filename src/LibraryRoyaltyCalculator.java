public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author author = new Author("Olga Ravn");

        PrintedBook printedBook1 = new PrintedBook("Celestine", "SKØN",140,166);
        AudioBook audioBook = new AudioBook("Celestine", "SKØN",140,192);
        PrintedBook printedBook2 = new PrintedBook("Celestine 2","SKØN",100,300);

        author.addTitle(printedBook1);
        author.addTitle(audioBook);
        author.addTitle(printedBook2);

        double royalties = author.calculateRoyalties();
        System.out.printf("%s:2fkr%n", author.getName(), royalties);

        author.addTitle(new EBook("e-book", "FAG",97,50,205,360000, false));

        author.addTitle(new EAudioBook("E-Audio-Book", "FAG", 97,50,205,240));
    }

}
