package ${package}.components.content.navigation.primarynavigation;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.navigation.bootstrapnavigation.bootstrapprimarynavigation.v1.DefaultBootstrapPrimaryNavigation;

@Component(value = "Primary Navigation",
        resourceSuperType = DefaultBootstrapPrimaryNavigation.RESOURCE_TYPE,
        name = "navigation/primarynavigation",
        editConfig = false)
public class PrimaryNavigation extends DefaultBootstrapPrimaryNavigation {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/navigation/primarynavigation";

}
