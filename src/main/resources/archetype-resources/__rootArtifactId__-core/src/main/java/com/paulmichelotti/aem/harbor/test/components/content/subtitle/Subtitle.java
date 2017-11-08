package ${package}.components.content.subtitle;

import com.citytechinc.cq.component.annotations.Component;

@Component(
        value = "Subtitle",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.subtitle.v1.Subtitle.RESOURCE_TYPE
)
class Subtitle extends com.icfolson.aem.harbor.core.components.content.subtitle.v1.Subtitle {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/subtitle";

}
