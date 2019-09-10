public abstract class Task {

    private String description;
    private boolean isDone;

    /**
     * constructor.
     * @param description of the task.
     */
    Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    abstract String getStoredForm();

    /**
     * return a symbol showing when the task is done or not.
     * @return a tick of X symbol.
     */
    String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    /**
     * mark the task as done.
     */
    void markAsDone() {
        this.isDone = true;
    }

    /**
     * how the task is described.
     * @return description of the task.
     */
    String getDescription() {
        return this.description;
    }

    /**
     * tells whether task is done or not.
     * @return true or false of whether the task is done
     */
    boolean isDone() {
        return this.isDone;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.getDescription();
    }
}
