package ${package}.components.content.dynamictabs.tabs;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(value = "Inheriting Parsys Tab",
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.dynamictabs.tabs.parsystab.v1.InheritingParsysTab.RESOURCE_TYPE,
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
        name = "dynamictabs/tabs/parsystab/inheriting",
        listeners = {
                @Listener(name = "afterinsert", value = "REFRESH_PARENT"),
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        })
public class InheritingParsysTab extends com.icfolson.aem.harbor.core.components.content.dynamictabs.tabs.parsystab.v1.InheritingParsysTab {

    public static final String RESOURCE_TYPE = ParsysTab.RESOURCE_TYPE + "/inheriting";

}
