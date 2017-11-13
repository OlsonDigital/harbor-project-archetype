package ${package}.components.content.breadcrumbnavigation;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.breadcrumbnavigation.v1.DefaultBreadcrumbNavigation;

@Component(value = "Breadcrumb Navigation", resourceSuperType = DefaultBreadcrumbNavigation.RESOURCE_TYPE)
public class BreadcrumbNavigation extends DefaultBreadcrumbNavigation {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/breadcrumbnavigation";

}
