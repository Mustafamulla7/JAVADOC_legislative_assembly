/**
 * Abstract class representing a section of the Goa Legislative Assembly.
 * Each section has a name and a list of subsections.
 * 
 * @author Mustafa Mulla
 * Roll No : 27
 * Title : Goa Legislative Assembly
 * Start date : 15/07/2024
 * Modified date :  22/07/2024
 * Description : Goa Legislative Assembly's various sections using Java
 */
import java.util.List;

public abstract class Goa_legislative {
    private String sectionName;

    /**
     * Constructs a section of the Goa Legislative Assembly with the specified name.
     *
     * @param sectionName the name of the section
     */
    public Goa_legislative(String sectionName) {
        this.sectionName = sectionName;
    }

    /**
     * Returns the name of the section.
     *
     * @return the section name
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Returns the list of subsections for this section.
     *
     * @return a list of subsections
     */
    public abstract List<Subsection> getSubsections();
}
