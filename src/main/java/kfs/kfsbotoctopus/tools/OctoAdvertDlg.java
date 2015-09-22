package kfs.kfsbotoctopus.tools;

import com.vaadin.ui.Field;
import com.vaadin.ui.UI;
import kfs.kfsbotoctopus.domain.*;
import kfs.kfsvaalib.dlg.SimpleDlgTemplate;
import kfs.kfsvaalib.fields.ObjectPropsInfoField;
import kfs.kfsvaalib.kfsForm.KfsField;
import kfs.kfsvaalib.kfsForm.MFieldGroup;
import kfs.kfsvaalib.utils.KfsI18n;

/**
 *
 * @author pavedrim
 */
public class OctoAdvertDlg extends SimpleDlgTemplate<OctoAdvert> {

    public OctoAdvertDlg(UI ui, KfsI18n i18n) {
        super(ui, i18n, "OctoAdvertDlg", new MFieldGroup(i18n, "OctoAdvertDlg", 
                new MFieldGroup.MFieldFactory() {

            @Override
            public Field createField(Class objectClass, String filedName, KfsField kfsField, Class fieldClass) {
                if (fieldClass.equals(OctoCategory.class)) {
                    return new ObjectPropsInfoField(fieldClass, "getCategoryName");
                }
                if (fieldClass.equals(OctoSubcategory.class)) {
                    return new ObjectPropsInfoField(fieldClass, "getSubCategoryName");
                }
                if (fieldClass.equals(OctoOfferType.class)) {
                    return new ObjectPropsInfoField(fieldClass, "getName");
                }
                if (fieldClass.equals(OctoCommercialMode.class)) {
                    return new ObjectPropsInfoField(fieldClass, "getCommercialModeName");
                }
                if (fieldClass.equals(OctoRegion.class)) {
                    return new ObjectPropsInfoField(fieldClass, "getRegionName");
                }
                if (fieldClass.equals(OctoSubRegion.class)) {
                    return new ObjectPropsInfoField(fieldClass, "getSubRegionName");
                }
                if (fieldClass.equals(OctoCountry.class)) {
                    return new ObjectPropsInfoField(fieldClass, "getName");
                }
                if (fieldClass.equals(OctoOwnership.class)) {
                    return new ObjectPropsInfoField(fieldClass, "getName");
                }
                return null;
            }
        }, OctoAdvert.class));
    }

    @Override
    protected void kfsSave(OctoAdvert data) {
        // not need
    }

    @Override
    public String getKfsInfo(OctoAdvert data) {
        return data.getDetailName() + " " + data.getDetailText();
    }

}
