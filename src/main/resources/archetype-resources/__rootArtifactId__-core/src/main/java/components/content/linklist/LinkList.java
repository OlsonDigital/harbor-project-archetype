package ${package}.components.content.linklist;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.list.linklist.v1.DefaultLinkList;

@Component(
        value = "Link List",
        isContainer = true,
        resourceSuperType = DefaultLinkList.RESOURCE_TYPE,
        actions = { "text:Link List", "edit", "-", "copymove", "delete", "insert" },
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(
                        text = "Add Link",
                        handler = "function() { Harbor.Components.LinkList.v1.LinkList.addLink( this, '" + ListableLink.RESOURCE_TYPE + "' ); }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        })
        }
)
public class LinkList extends DefaultLinkList {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/linklist";

}
