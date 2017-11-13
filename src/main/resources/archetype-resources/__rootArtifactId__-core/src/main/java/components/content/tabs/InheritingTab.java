package ${package}.components.content.tabs;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Tab",
        name = "tabs/tab/inheriting",
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
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.tabs.v1.InheritingTab.RESOURCE_TYPE
)
public class InheritingTab extends com.icfolson.aem.harbor.core.components.content.tabs.v1.InheritingTab {

    public static final String RESOURCE_TYPE = Tab.RESOURCE_TYPE + "/inheriting";

}
