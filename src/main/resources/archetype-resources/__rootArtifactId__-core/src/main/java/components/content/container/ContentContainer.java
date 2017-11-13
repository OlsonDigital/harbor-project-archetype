package ${package}.components.content.container;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.DialogField;
import com.citytechinc.cq.component.annotations.widgets.TagInputField;
import com.icfolson.aem.harbor.api.components.mixins.classifiable.Classification;
import com.icfolson.aem.harbor.core.components.content.container.v1.DefaultContainer;

@Component(value = "Content Container",
        isContainer = true,
        resourceSuperType = DefaultContainer.RESOURCE_TYPE)
class ContentContainer extends DefaultContainer {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/contentcontainer";

    @Override
    @DialogField(name = "icf:classification") @TagInputField
    public Classification getClassification() {
        return super.getClassification();
    }

}
