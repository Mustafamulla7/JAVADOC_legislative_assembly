/**
 * Class representing the House section of the Goa Legislative Assembly.
 * This section includes various subsections such as "Session Information" and "Assembly Bills".
 * 
 * @author Mustafa Mulla
 * Roll No : 27
 * Title : Goa Legislative Assembly
 * Start date : 15/07/2024
 * Modified date :  22/07/2024
 * Description : Goa Legislative Assembly's various sections using Java
 */
import java.util.ArrayList;
import java.util.List;

public class HouseSection extends Goa_legislative {
    private List<Subsection> subsections;

    /**
     * Constructs the House section with predefined subsections.
     */
    public HouseSection() {
        super("House");
        this.subsections = new ArrayList<>();

        subsections.add(new Subsection("Session Information"));
        subsections.add(new Subsection("Question List"));
        subsections.add(new Subsection("Assembly Bills"));
        subsections.add(new Subsection("Papers laid in the house"));
    }

    /**
     * Returns the list of subsections in the House section.
     *
     * @return a list of subsections
     */
    @Override
    public List<Subsection> getSubsections() {
        return subsections;
    }
}
