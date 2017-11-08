package ${package}.components.content.dynamicaccordion;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.dynamicaccordion.v1.NewAccordionItem;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Dynamic Accordion",
        actions = { "text: Dynamic Accordion", "edit" },
        isContainer = true,
        group = ComponentConstants.GROUP_HIDDEN,
        name = "dynamicaccordion/inheriting",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.dynamicaccordion.v1.InheritingDynamicAccordion.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Add Item",
                        handler = "function() { Harbor.Components.DynamicAccordion.v1.DynamicAccordion.addItem( this, '" + "/apps/" + NewAccordionItem.RESOURCE_TYPE + "/" + NewAccordionItem.DIALOG_FILE_NAME + "' ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        } )
        } )
public class InheritingDynamicAccordion extends com.icfolson.aem.harbor.core.components.content.dynamicaccordion.v1.InheritingDynamicAccordion {

    public static final String RESOURCE_TYPE = DynamicAccordion.RESOURCE_TYPE + "/inheriting";

}
