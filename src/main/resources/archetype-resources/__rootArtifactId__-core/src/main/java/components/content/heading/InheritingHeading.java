package ${package}.components.content.heading;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Heading",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "heading/inheriting",
        actions = { "text:Heading", "edit" },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.heading.v1.InheritingHeading.RESOURCE_TYPE)
public class InheritingHeading extends com.icfolson.aem.harbor.core.components.content.heading.v1.InheritingHeading {

    public static final String RESOURCE_TYPE = Heading.RESOURCE_TYPE + "/inheriting";

}
