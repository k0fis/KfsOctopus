
package cz.octopuspro.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Failure"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgeType")
@XmlEnum
public enum AcknowledgeType {

    @XmlEnumValue("Failure")
    FAILURE("Failure"),
    @XmlEnumValue("Success")
    SUCCESS("Success");
    private final String value;

    AcknowledgeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcknowledgeType fromValue(String v) {
        for (AcknowledgeType c: AcknowledgeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
