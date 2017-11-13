package ${package}.components.content.title;

import com.citytechinc.cq.component.annotations.Component;

@Component(
        value = "Title",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.title.v1.Title.RESOURCE_TYPE
)
class Title extends com.icfolson.aem.harbor.core.components.content.title.v1.Title {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/title";

}
