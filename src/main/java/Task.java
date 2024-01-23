public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public boolean done() {
        return isDone;
    }

    public void mark() {
        isDone = true;
    }

    public void unMark() {
        isDone = false;
    }
}
