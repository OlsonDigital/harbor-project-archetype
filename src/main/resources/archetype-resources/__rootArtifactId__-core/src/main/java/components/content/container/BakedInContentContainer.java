package ${package}.components.content.container;

import com.citytechinc.cq.component.annotations.Component;

@Component(value = "Content Container",
        isContainer = true,
        group = ".hidden",
        name = "contentcontainer/bakedin",
        actions = { "text: Content Container" },
        resourceSuperType = ContentContainer.RESOURCE_TYPE)
public class BakedInContentContainer extends ContentContainer {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/contentcontainer/bakedin";

}
