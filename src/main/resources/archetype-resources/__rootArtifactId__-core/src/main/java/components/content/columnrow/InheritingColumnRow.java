package ${package}.components.content.columnrow;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Column Row",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "columnrow/inheriting",
        actions = { "text: Column Row", "-", "edit" },
        actionConfigs = {
                @ActionConfig(
                        handler = "function() { Harbor.Components.ColumnRow.v1.ColumnRow.addColumn( this, '" + InheritingColumn.RESOURCE_TYPE + "' ); }",
                        text = "Add Column",
                        additionalProperties ={@ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")}
                )
        },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.columnrow.v1.InheritingColumnRow.RESOURCE_TYPE,
        isContainer = true
)
public class InheritingColumnRow extends com.icfolson.aem.harbor.core.components.content.columnrow.v1.InheritingColumnRow {

    public static final String RESOURCE_TYPE = ColumnRow.RESOURCE_TYPE + "/inheriting";

}
