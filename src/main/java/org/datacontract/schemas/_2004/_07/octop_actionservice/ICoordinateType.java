
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iCoordinateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iCoordinateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JTSK"/&gt;
 *     &lt;enumeration value="WGS84"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "iCoordinateType")
@XmlEnum
public enum ICoordinateType {

    JTSK("JTSK"),
    @XmlEnumValue("WGS84")
    WGS_84("WGS84");
    private final String value;

    ICoordinateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ICoordinateType fromValue(String v) {
        for (ICoordinateType c: ICoordinateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
