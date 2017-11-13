package ${package}.components.content.title;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Title",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "title/inheriting",
        actions = { "text:Title", "edit" },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.title.v1.InheritingTitle.RESOURCE_TYPE)
public class InheritingTitle extends com.icfolson.aem.harbor.core.components.content.title.v1.InheritingTitle {

    public static final String RESOURCE_TYPE = Title.RESOURCE_TYPE + "/inheriting";

}
