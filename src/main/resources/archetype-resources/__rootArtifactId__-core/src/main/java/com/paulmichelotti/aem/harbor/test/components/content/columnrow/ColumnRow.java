package ${package}.components.content.columnrow;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.DialogField;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.citytechinc.cq.component.annotations.widgets.TagInputField;
import com.icfolson.aem.harbor.api.components.mixins.classifiable.Classification;
import com.icfolson.aem.harbor.core.components.content.columnrow.v1.DefaultColumnRow;

@Component(
        value = "Column Row",
        actions = { "text: Column Row", "-", "edit", "-", "copymove", "delete", "-", "insert" },
        actionConfigs = {
                @ActionConfig(
                        handler = "function() { Harbor.Components.ColumnRow.v1.ColumnRow.addColumn( this, '" + Column.RESOURCE_TYPE + "' ); }",
                        text = "Add Column",
                        additionalProperties ={@ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")}
                )
        },
        resourceSuperType = DefaultColumnRow.RESOURCE_TYPE,
        isContainer = true
)
class ColumnRow extends DefaultColumnRow {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/columnrow";

    @DialogField(fieldLabel = "Classification", name = "./icf:classification") @TagInputField
    @Override
    public Classification getClassification() {
        return super.getClassification();
    }

}
