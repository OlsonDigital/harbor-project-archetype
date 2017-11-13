package ${package}.components.content.tabs;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.tabs.v1.DefaultTab;
import com.icfolson.aem.library.core.constants.ComponentConstants;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Component(
        value = "Tab",
        name = "tabs/tab",
        actions = { "text: Tab", "-", "edit", "delete" },
        isContainer = true,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Move Up", handler = "function(){Harbor.Components.Tabs.v1.Tabs.moveUp( this )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionUp")
                        }),
                @ActionConfig(text = "Move Down", handler = "function(){Harbor.Components.Tabs.v1.Tabs.moveDown( this )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionDown")
                        })
        },
        listeners = {
                @Listener(name = "afterinsert", value = "REFRESH_PARENT"),
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        },
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = DefaultTab.RESOURCE_TYPE
)
@Model(adaptables = Resource.class, adapters = com.icfolson.aem.harbor.api.components.content.tabs.Tab.class, resourceType = Tab.RESOURCE_TYPE)
public class Tab extends DefaultTab {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/tabs/tab";

    @Override
    public String getType() {
        return RESOURCE_TYPE;
    }

}
