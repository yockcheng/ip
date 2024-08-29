/**
 * The abstract {@code Task} class represents a task with a description and a status indicating whether it is done.
 * It provides methods to manage the task's completion status and to convert it to a string representation or data representation for saving and loading.
 */

public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void changeStatus(boolean b) {
        this.isDone = b;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", this.getStatusIcon(), this.description);
    }

    /**
     * Converts the task to a string format suitable for saving to a data file.
     * This method must be implemented by subclasses to provide their specific data format.
     *
     * @return A string representing the task in a format suitable for data storage.
     */
    public abstract String toData();
}