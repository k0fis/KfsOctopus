
package cz.octopuspro.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iTypNemovitosti.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iTypNemovitosti"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Jednotka"/&gt;
 *     &lt;enumeration value="Budova"/&gt;
 *     &lt;enumeration value="Parcela"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "iTypNemovitosti")
@XmlEnum
public enum ITypNemovitosti {

    @XmlEnumValue("Jednotka")
    JEDNOTKA("Jednotka"),
    @XmlEnumValue("Budova")
    BUDOVA("Budova"),
    @XmlEnumValue("Parcela")
    PARCELA("Parcela");
    private final String value;

    ITypNemovitosti(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ITypNemovitosti fromValue(String v) {
        for (ITypNemovitosti c: ITypNemovitosti.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
