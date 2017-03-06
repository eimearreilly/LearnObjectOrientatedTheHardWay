public abstract class Ex43AbstractDoor {
    protected boolean isOpen;

    public Ex43AbstractDoor(boolean isOpen){
        this.isOpen = isOpen;
    }

    public void open(){
        isOpen = true;
    }

    public void close(){
        isOpen = false;
    }

    public abstract double soundProofing();

    public final String toString() {
        return "The door is " + (isOpen ? "open." : "closed.");
    }
}
