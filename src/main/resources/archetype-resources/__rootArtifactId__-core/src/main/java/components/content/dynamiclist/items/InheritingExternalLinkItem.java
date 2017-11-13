package ${package}.components.content.dynamiclist.items;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting External Link Item",
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.list.dynamic.items.v1.InheritingExternalLinkItem.RESOURCE_TYPE,
        name = "dynamiclist/items/externallinkitem/inheriting",
        actions = { "text: External Link Item", "-", "edit", "delete" },
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Move Up", handler = "function(){Harbor.Components.DynamicList.v1.DynamicList.moveUp( this )}",
                        additionalProperties = { @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionUp") }),
                @ActionConfig(text = "Move Down", handler = "function(){Harbor.Components.DynamicList.v1.DynamicList.moveDown( this )}",
                        additionalProperties = { @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionDown") })
        },
        listeners = {
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        })
public class InheritingExternalLinkItem extends com.icfolson.aem.harbor.core.components.content.list.dynamic.items.v1.InheritingExternalLinkItem {

    public static final String RESOURCE_TYPE = ExternalLinkItem.RESOURCE_TYPE + "/inheriting";

}
