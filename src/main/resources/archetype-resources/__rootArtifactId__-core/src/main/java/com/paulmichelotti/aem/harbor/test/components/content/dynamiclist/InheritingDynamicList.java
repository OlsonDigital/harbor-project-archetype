package ${package}.components.content.dynamiclist;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.list.dynamic.v1.NewDynamicListItem;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Dynamic List",
        isContainer = true,
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.list.dynamic.v1.InheritingDynamicList.RESOURCE_TYPE,
        name = "dynamiclist/inheriting",
        actions = { "text:Dynamic List", "edit" },
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
public class InheritingDynamicList extends com.icfolson.aem.harbor.core.components.content.list.dynamic.v1.InheritingDynamicList {

    public static final String RESOURCE_TYPE = DynamicList.RESOURCE_TYPE + "/inheriting";

}
