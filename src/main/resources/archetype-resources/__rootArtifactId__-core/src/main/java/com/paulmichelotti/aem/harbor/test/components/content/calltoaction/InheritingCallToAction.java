package ${package}.components.content.calltoaction;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Call to Action",
        group = ComponentConstants.GROUP_HIDDEN,
        name = "calltoaction/inheriting",
        actions = { "text:Call to Action", "edit" },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.calltoaction.v1.InheritingCallToAction.RESOURCE_TYPE)
public class InheritingCallToAction extends com.icfolson.aem.harbor.core.components.content.calltoaction.v1.InheritingCallToAction {

    public static final String RESOURCE_TYPE = CallToAction.RESOURCE_TYPE + "/inheriting";

}
