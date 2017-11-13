package ${package}.components.content.heading;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.heading.v1.DefaultHeading;

@Component(
        value = "Heading",
        resourceSuperType = DefaultHeading.RESOURCE_TYPE
)
class Heading extends DefaultHeading {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/heading";

}
