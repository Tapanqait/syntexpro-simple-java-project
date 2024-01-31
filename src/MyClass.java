public class MyClass {

    // Private variables
    private int privateInt;
    private double privateDouble;
    private String privateString;
    private boolean privateBoolean;
    private Object privateObject;

    // Constructor
    public MyClass(int privateInt, double privateDouble, String privateString, boolean privateBoolean, Object privateObject) {
        this.privateInt = privateInt;
        this.privateDouble = privateDouble;
        this.privateString = privateString;
        this.privateBoolean = privateBoolean;
        this.privateObject = privateObject;
    }

    // Getter and setter methods for each private variable (not mandatory for this example)
    public int getPrivateInt() {
        return privateInt;
    }

    public void setPrivateInt(int privateInt) {
        this.privateInt = privateInt;
    }

    public double getPrivateDouble() {
        return privateDouble;
    }

    public void setPrivateDouble(double privateDouble) {
        this.privateDouble = privateDouble;
    }

    public String getPrivateString() {
        return privateString;
    }

    public void setPrivateString(String privateString) {
        this.privateString = privateString;
    }

    public boolean isPrivateBoolean() {
        return privateBoolean;
    }

    public void setPrivateBoolean(boolean privateBoolean) {
        this.privateBoolean = privateBoolean;
    }

    public Object getPrivateObject() {
        return privateObject;
    }

    public void setPrivateObject(Object privateObject) {
        this.privateObject = privateObject;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "privateInt=" + privateInt +
                ", privateDouble=" + privateDouble +
                ", privateString='" + privateString + '\'' +
                ", privateBoolean=" + privateBoolean +
                ", privateObject=" + privateObject +
                '}';
    }
}




