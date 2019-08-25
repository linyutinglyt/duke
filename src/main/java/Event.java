import java.text.ParseException;
import java.util.Date;

public class Event extends Task {
    protected Date at;

    public Event(String description, String at) throws ParseException {
        super(description);
        this.at = Duke.formatter.parse(at);
    }

    public String getAt() {
        return Duke.formatter.format(at);
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + Duke.formatter.format(at) + ")";
    }
}
