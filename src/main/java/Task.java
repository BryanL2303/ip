public class Task {
    protected String description;
    protected boolean isDone;
    protected String type;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatus() {
        String statusIcon = (isDone ? "X" : " ");
        return "[" + statusIcon + "] " + description;
    }

    public boolean done() {
        return isDone;
    }

    public String type() { return type; }

    public String toText() {
        return type + " / " + (isDone ? "1" : "0") + " / " + description;
    }

    public void mark() {
        isDone = true;
    }

    public void unMark() {
        isDone = false;
    }
}
