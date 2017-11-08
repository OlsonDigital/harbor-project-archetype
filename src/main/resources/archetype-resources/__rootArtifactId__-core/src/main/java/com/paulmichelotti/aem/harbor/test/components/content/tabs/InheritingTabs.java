package ${package}.components.content.tabs;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Tabs",
        actions = { "text: Tabs", "-", "edit" },
        group = ComponentConstants.GROUP_HIDDEN,
        isContainer = true,
        name = "tabs/inheriting",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.tabs.v1.InheritingTabs.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(
                        text = "Add Tab",
                        handler = "function(){Harbor.Components.Tabs.v1.Tabs.addTab( this, '" + InheritingTab.RESOURCE_TYPE + "' ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        } ),
                @ActionConfig(text = "Previous Tab",
                        handler = "function() { Harbor.Components.Tabs.v1.Tabs.previousTab( this ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--rewindCircle")
                        } ),
                @ActionConfig(text = "Next Tab",
                        handler = "function() { Harbor.Components.Tabs.v1.Tabs.nextTab( this ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--fastForwardCircle")
                        } )
        })
public class InheritingTabs extends com.icfolson.aem.harbor.core.components.content.tabs.v1.InheritingTabs {

    public static final String RESOURCE_TYPE = Tabs.RESOURCE_TYPE + "/inheriting";

}
