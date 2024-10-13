/**
 * Class representing the Government section of the Goa Legislative Assembly.
 * This section includes various subsections such as "Governor" and "Chief Minister".
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

public class GovernmentSection extends Goa_legislative {
    private List<Subsection> subsections;

    /**
     * Constructs the Government section with predefined subsections.
     */
    public GovernmentSection() {
        super("Government");
        this.subsections = new ArrayList<>();

        subsections.add(new Subsection("Governor: Shri. P. S. Sreedharan Pillai"));
        subsections.add(new Subsection("Chief Minister: Shri. Pramod Sawant"));
    }

    /**
     * Returns the list of subsections in the Government section.
     *
     * @return a list of subsections
     */
    @Override
    public List<Subsection> getSubsections() {
        return subsections;
    }
}
