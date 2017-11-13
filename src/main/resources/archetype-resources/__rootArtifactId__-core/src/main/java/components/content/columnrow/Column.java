package ${package}.components.content.columnrow;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.DialogField;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.widgets.TagInputField;
import com.icfolson.aem.harbor.api.components.mixins.classifiable.Classification;
import com.icfolson.aem.harbor.core.components.content.columnrow.v1.DefaultColumn;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Column",
        group = ComponentConstants.GROUP_HIDDEN,
        actions = { "text:Column", "edit", "delete" },
        name = "columnrow/column",
        listeners = {
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        },
        resourceSuperType = DefaultColumn.RESOURCE_TYPE,
        isContainer = true
)
class Column extends DefaultColumn {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/columnrow/column";

    @DialogField(fieldLabel = "Classification", name = "./icf:classification") @TagInputField // TODO: Get name constant from namespace module
    @Override
    public Classification getClassification() {
        return super.getClassification();
    }

}
