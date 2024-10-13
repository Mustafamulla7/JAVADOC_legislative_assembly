/**
 * Class representing the Legislature section of the Goa Legislative Assembly.
 * This section includes various subsections such as "Speaker" and "Secretary".
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

public class LegislatureSection extends Goa_legislative {
    private List<Subsection> subsections;

    /**
     * Constructs the Legislature section with predefined subsections.
     */
    public LegislatureSection() {
        super("Legislature");
        this.subsections = new ArrayList<>();

        subsections.add(new Subsection("Speaker: Shri. Ramesh Tawadkar"));
        subsections.add(new Subsection("Deputy Speaker: Shri. Joshua De Souza"));
        subsections.add(new Subsection("Secretary: Smt. Namrata Ulman"));
    }

    /**
     * Returns the list of subsections in the Legislature section.
     *
     * @return a list of subsections
     */
    @Override
    public List<Subsection> getSubsections() {
        return subsections;
    }
}
