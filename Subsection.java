/**
 * Class representing a subsection within a section of the Goa Legislative Assembly.
 * A subsection is a part of a larger section, such as "Governor" or "Speaker".
 * 
 * @author Mustafa Mulla
 * Roll No : 27
 * Title : Goa Legislative Assembly
 * Start date : 15/07/2024
 * Modified date :  22/07/2024
 * Description : Goa Legislative Assembly's various sections using Java
 */
public class Subsection {
    private String subsectionName;

    /**
     * Constructs a subsection with the specified name.
     *
     * @param subsectionName the name of the subsection
     */
    public Subsection(String subsectionName) {
        this.subsectionName = subsectionName;
    }

    /**
     * Returns the name of the subsection.
     *
     * @return the subsection name
     */
    public String getSubsectionName() {
        return subsectionName;
    }
}
