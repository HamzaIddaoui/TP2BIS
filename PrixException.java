public class PrixException extends Exception{
    @Override
    public String toString() {
        return "PrixException{ Prix < 0 }";
    }
}
