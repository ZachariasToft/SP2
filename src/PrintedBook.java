public class PrintedBook extends PhysicalTitle{
    private int pages;
    private int copies;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType);
        this.copies = copies;
        this.pages = pages;
    }

    @Override
    public double calculatePoints(){
        return pages * convertLiteratureType() * copies;
    }
}
