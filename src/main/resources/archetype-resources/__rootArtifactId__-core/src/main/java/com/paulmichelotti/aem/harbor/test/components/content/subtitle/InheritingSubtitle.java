package ${package}.components.content.subtitle;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Subtitle",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "subtitle/inheriting",
        actions = { "text:Subtitle", "edit" },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.subtitle.v1.InheritingSubtitle.RESOURCE_TYPE)
public class InheritingSubtitle extends com.icfolson.aem.harbor.core.components.content.subtitle.v1.InheritingSubtitle {

    public static final String RESOURCE_TYPE = Subtitle.RESOURCE_TYPE + "/inheriting";

}
