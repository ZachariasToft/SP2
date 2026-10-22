public abstract class Title{
    protected String title;
    protected String literatureType;
    public static final double RATE = 0.06757;

    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty(){
        return calculatePoints() * RATE;
    }

    public abstract double calculatePoints();

    public double convertLiteratureType(){
        switch (literatureType){
            case "BI":
            case "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                throw new IllegalArgumentException("Unknown literature type");
        }
    }
}
