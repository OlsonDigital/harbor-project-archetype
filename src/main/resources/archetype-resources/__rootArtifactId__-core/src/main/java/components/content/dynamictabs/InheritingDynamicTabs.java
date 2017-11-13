package ${package}.components.content.dynamictabs;


import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.dynamictabs.v1.DefaultDynamicTabs;
import com.icfolson.aem.harbor.core.components.content.dynamictabs.v1.NewTab;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Dynamic Tabs",
        actions = { "text: Dynamic Tabs", "edit" },
        isContainer = true,
        name = "dynamictabs/inheriting",
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.dynamictabs.v1.InheritingDynamicTabs.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Add Tab",
                        handler = "function() { Harbor.Components.DynamicTabs.v1.DynamicTabs.addTab( this, '" + "/apps/" + NewTab.RESOURCE_TYPE + "/" + NewTab.DIALOG_FILE_NAME + "' ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        } ),
                @ActionConfig(text = "Previous Tab",
                        handler = "function() { Harbor.Components.DynamicTabs.v1.DynamicTabs.previousTab( this ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--rewindCircle")
                        } ),
                @ActionConfig(text = "Next Tab",
                        handler = "function() { Harbor.Components.DynamicTabs.v1.DynamicTabs.nextTab( this ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--fastForwardCircle")
                        } )
        } )
public class InheritingDynamicTabs extends com.icfolson.aem.harbor.core.components.content.dynamictabs.v1.InheritingDynamicTabs {

    public static final String RESOURCE_TYPE = DynamicTabs.RESOURCE_TYPE + "/inheriting";

}
