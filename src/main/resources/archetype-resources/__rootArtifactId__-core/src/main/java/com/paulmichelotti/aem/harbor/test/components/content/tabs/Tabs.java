package ${package}.components.content.tabs;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.tabs.v1.DefaultTabs;

@Component(
        value = "Tabs",
        actions = { "text: Tabs", "-", "edit", "-", "copymove", "delete", "-", "insert" },
        isContainer = true,
        resourceSuperType = DefaultTabs.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(
                        text = "Add Tab",
                        handler = "function(){Harbor.Components.Tabs.v1.Tabs.addTab( this, '" + Tab.RESOURCE_TYPE + "' ) }",
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
public class Tabs extends DefaultTabs {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/tabs";

}
