package ${package}.components.content.dynamictabs.tabs;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.api.components.content.dynamictabs.DynamicTab;
import com.icfolson.aem.library.core.constants.ComponentConstants;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Component(value = "Archetype Test - Parsys Tab",
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.dynamictabs.tabs.parsystab.v1.ParsysTab.RESOURCE_TYPE,
        actions = { "text: Parsys Tab", "edit", "-", "delete" },
        isContainer = true,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Move Up", handler = "function(){Harbor.Components.DynamicTabs.v1.DynamicTabs.moveUp( this )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionUp")
                        }),
                @ActionConfig(text = "Move Down", handler = "function(){Harbor.Components.DynamicTabs.v1.DynamicTabs.moveDown( this )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionDown")
                        })
        },
        name = "dynamictabs/tabs/parsystab",
        listeners = {
                @Listener(name = "afterinsert", value = "REFRESH_PARENT"),
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        })
@Model(adaptables = Resource.class, adapters = DynamicTab.class, resourceType = ParsysTab.RESOURCE_TYPE)
public class ParsysTab extends com.icfolson.aem.harbor.core.components.content.dynamictabs.tabs.parsystab.v1.ParsysTab {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/dynamictabs/tabs/parsystab";

    @Override
    public String getType() {
        return RESOURCE_TYPE;
    }

}
