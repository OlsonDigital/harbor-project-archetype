package ${package}.components.content.calltoaction;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.calltoaction.v1.DefaultCallToAction;

@Component(
        value = "Call to Action",
        resourceSuperType = DefaultCallToAction.RESOURCE_TYPE)
public class CallToAction extends DefaultCallToAction {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/calltoaction";

}
