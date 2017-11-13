package ${package}.components.content.dynamiclist;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.list.dynamic.v1.DefaultDynamicList;
import com.icfolson.aem.harbor.core.components.content.list.dynamic.v1.NewDynamicListItem;
import com.icfolson.aem.harbor.core.constants.groups.ComponentGroups;

@Component(
        value = "Dynamic List",
        isContainer = true,
        resourceSuperType = DefaultDynamicList.RESOURCE_TYPE,
        actions = { "text:Dynamic List", "edit", "-", "copymove", "delete", "insert" },
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(
                        text = "Add Item",
                        handler = "function() { Harbor.Components.DynamicList.v1.DynamicList.addItem( this, '/apps/" + NewDynamicListItem.RESOURCE_TYPE + "/" + NewDynamicListItem.DIALOG_FILE_NAME + "' ); }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        })
        }
)
public class DynamicList extends DefaultDynamicList {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/dynamiclist";

}
