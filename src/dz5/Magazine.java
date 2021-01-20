package dz5;

public class Magazine extends Subject {
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
        notifyObserver();
    }
    @Override
    protected void notifyObserver() {
        observers.forEach((observer) -> {
            observer.update(number);
        });
    }
}