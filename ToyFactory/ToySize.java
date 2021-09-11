package ToyFactory;

public enum ToySize {
    SMALL(1),
    MEDIUM(1.5),
    LARGE(2);

    private double code ;

    ToySize(double code) {
        this.code = code;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }
}
