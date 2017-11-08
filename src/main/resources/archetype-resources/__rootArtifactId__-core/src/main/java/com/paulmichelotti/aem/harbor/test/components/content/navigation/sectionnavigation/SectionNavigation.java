package ${package}.components.content.navigation.sectionnavigation;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.navigation.bootstrapnavigation.bootstrapsectionnavigation.v1.DefaultBootstrapSectionNavigation;

@Component(value = "Section Navigation", resourceSuperType = DefaultBootstrapSectionNavigation.RESOURCE_TYPE, name = "navigation/sectionnavigation")
public class SectionNavigation extends DefaultBootstrapSectionNavigation {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/navigation/sectionnavigation";

}
