package ${package}.components.content.accordion;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.accordion.v1.DefaultAccordion;

@Component(
        value = "Accordion Group",
        actions = { "text: Accordion Group", "-", "edit", "-", "copymove", "delete", "-", "insert" },
        isContainer = true,
        resourceSuperType = DefaultAccordion.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(
                        text = "Add Item",
                        handler = "function(){Harbor.Components.Accordion.v1.Accordion.addItem( this, '" + AccordionItem.RESOURCE_TYPE + "' )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        })
        }
)
public class Accordion extends DefaultAccordion {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/accordion";

}

