package ${package}.components.content.text;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.text.v1.DefaultText;

@Component(
        value = "Text",
        resourceSuperType = DefaultText.RESOURCE_TYPE,
        inPlaceEditingEditorType = "text")
public class Text extends DefaultText {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/text";

}
