package ${package}.components.content.linklist;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Listable Link",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "linklist/listablelink/inheriting",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.list.linklist.v1.InheritingListableLink.RESOURCE_TYPE,
        actions = { "text: Listable Link", "-", "edit", "delete" },
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Move Up", handler = "function(){Harbor.Components.LinkList.v1.LinkList.moveUp( this )}",
                        additionalProperties = { @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionUp") }),
                @ActionConfig(text = "Move Down", handler = "function(){Harbor.Components.LinkList.v1.LinkList.moveDown( this )}",
                        additionalProperties = { @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionDown") })
        },
        listeners = {
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        }
)
public class InheritingListableLink extends com.icfolson.aem.harbor.core.components.content.list.linklist.v1.InheritingListableLink {

    public static final String RESOURCE_TYPE = ListableLink.RESOURCE_TYPE + "/inheriting";

}
