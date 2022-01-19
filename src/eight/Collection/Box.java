package eight.Collection;
//T je generički tip, možemo ga koristiti na nivou klase Box
public class Box<T> {
    private T field;


    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
