package ${package}.components.content.accordion;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Accordion Item",
        name = "accordion/accordionitem/inheriting",
        actions = { "text: Accordion Item", "-", "edit", "delete" },
        isContainer = true,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.accordion.v1.InheritingAccordionItem.RESOURCE_TYPE,
        listeners = {
                @Listener(name = "afteredit", value = "REFRESH_SELF"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        },
        group = ComponentConstants.GROUP_HIDDEN,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Move Up", handler = "function(){Harbor.Components.Accordion.v1.Accordion.moveUp( this )}",
                        additionalProperties = { @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionUp") }),
                @ActionConfig(text = "Move Down", handler = "function(){Harbor.Components.Accordion.v1.Accordion.moveDown( this )}",
                        additionalProperties = { @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionDown") })
        }
)
public class InheritingAccordionItem extends com.icfolson.aem.harbor.core.components.content.accordion.v1.InheritingAccordionItem {

    public static final String RESOURCE_TYPE = AccordionItem.RESOURCE_TYPE + "/inheriting";

}
