package ${package}.components.content.accordion;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Accordion Group",
        group = ComponentConstants.GROUP_HIDDEN,
        actions = { "text: Accordion Group", "-", "edit" },
        isContainer = true,
        name = "accordion/inheriting",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.accordion.v1.InheritingAccordion.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(
                        text = "Add Item",
                        handler = "function(){Harbor.Components.Accordion.v1.Accordion.addItem( this, '" + InheritingAccordionItem.RESOURCE_TYPE + "' )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        })
        }
)
public class InheritingAccordion extends com.icfolson.aem.harbor.core.components.content.accordion.v1.InheritingAccordion {

    public static final String RESOURCE_TYPE = Accordion.RESOURCE_TYPE + "/inheriting";

}
