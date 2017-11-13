package ${package}.components.content.html;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting HTML",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "html/inheriting",
        actions = { "text:HTML", "edit" },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.html.v1.InheritingHTML.RESOURCE_TYPE)
public class InheritingHTML extends com.icfolson.aem.harbor.core.components.content.html.v1.InheritingHTML {

    public static final String RESOURCE_TYPE = HTML.RESOURCE_TYPE + "/inheriting";

}
