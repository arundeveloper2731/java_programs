package trafficsignalsystem;

public enum Signal 
{
    RED("Stop"),
    YELLOW("Wait"),
    GREEN("Go");
    
    private final String meaning;

    Signal(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }

    public boolean canGo() {
        return this == GREEN;
    }
}
