package ${package}.components.content.text;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.text.v1.DefaultText;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Text",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "text/inheriting",
        actions = { "text:Text", "edit" },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.text.v1.InheritingText.RESOURCE_TYPE,
        inPlaceEditingEditorType = "text")
public class InheritingText extends com.icfolson.aem.harbor.core.components.content.text.v1.InheritingText {

    public static final String RESOURCE_TYPE = Text.RESOURCE_TYPE + "/inheriting";

}
