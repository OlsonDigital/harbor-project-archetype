package ${package}.components.content.linklist;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Link List",
        isContainer = true,
        group = ComponentConstants.GROUP_HIDDEN,
        name = "linklist/inheriting",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.list.linklist.v1.InheritingLinkList.RESOURCE_TYPE,
        actions = { "text:Link List", "edit" },
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(
                        text = "Add Link",
                        handler = "function() { Harbor.Components.LinkList.v1.LinkList.addLink( this, '" + InheritingListableLink.RESOURCE_TYPE + "' ); }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        })
        }
)
public class InheritingLinkList extends com.icfolson.aem.harbor.core.components.content.list.linklist.v1.InheritingLinkList {

    public static final String RESOURCE_TYPE = LinkList.RESOURCE_TYPE + "/inheriting";

}
