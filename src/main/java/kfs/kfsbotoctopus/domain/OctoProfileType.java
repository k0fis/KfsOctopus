package kfs.kfsbotoctopus.domain;


/**
 *
 * @author pavedrim
 */
public enum OctoProfileType {

    SoukromaInzerce(1, "Soukromá Inzerce"),
    Exekuce(2, "Exekuce"),
    Drazby(3, "Dražby"),
    Privatizace(4, "Privatizace"),
    HlidacLV(5, "Hlídač LV"),
    HlidacCenNemovitosti(6, "Hlídač Cen Nemovitostí"),
    TipovaHypotek(7, "Tipova Hypotek"),
    PodobnaNemovitostvOkoli(8, "Podobna Nemovitost v Okoli"),
    VyhledavacVlastnikaNemovitosti(9, "Vyhledavac Vlastnika Nemovitosti"),
    HlidacNemovitostiVlastnika(10, "Hlidac Nemovitosti Vlastnika"),
    parovaniNemovitosti(11, "Párování nemovitostí"),
    ESO_BezplatnaInzerce(117, "ESO_ BezplatnaInzerce"),
    ESO_OsobniMakler(118, "ESO Osobní Makléř"),
    ESO_openMLS(119, "ESO openMLS"),
    ESO_CenoveMapy(120, "ESO Cenové Mapy");

    public final int id;
    public final String name;

    private OctoProfileType(int id, String name) {
        this.name = name;
        this.id = id;
    }
    
}
