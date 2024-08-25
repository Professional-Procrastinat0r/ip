public class Deadline extends Task {

    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    /**
     * Returns a formatted string representation
     *
     * @return data format
     */
    @Override
    public String toDataFormat() {
        return "deadline | " + super.toDataFormat() + " | " + by;
    }

    /**
     * Returns a formatted message with status icon
     * and description
     *
     * @return display message
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}
