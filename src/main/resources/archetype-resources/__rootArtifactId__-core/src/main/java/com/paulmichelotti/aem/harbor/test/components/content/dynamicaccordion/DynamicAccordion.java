package ${package}.components.content.dynamicaccordion;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.dynamicaccordion.v1.DefaultDynamicAccordion;
import com.icfolson.aem.harbor.core.components.content.dynamicaccordion.v1.NewAccordionItem;

@Component(
        value = "Dynamic Accordion",
        actions = { "text: Dynamic Accordion", "edit", "-", "copymove", "delete", "-", "insert" },
        isContainer = true,
        resourceSuperType = DefaultDynamicAccordion.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Add Item",
                        handler = "function() { Harbor.Components.DynamicAccordion.v1.DynamicAccordion.addItem( this, '" + "/apps/" + NewAccordionItem.RESOURCE_TYPE + "/" + NewAccordionItem.DIALOG_FILE_NAME + "' ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        } )
        } )
public class DynamicAccordion extends DefaultDynamicAccordion {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/dynamicaccordion";

}
