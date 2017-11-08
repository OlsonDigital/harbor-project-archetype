package ${package}.components.content.navigation.primarynavbar;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.api.components.content.navigation.bootstrapnavigation.navbar.BootstrapPrimaryNavbar;
import com.icfolson.aem.harbor.core.components.content.navigation.bootstrapnavigation.navbar.v1.DefaultBootstrapPrimaryNavbar;
import ${package}.components.content.navigation.brand.Brand;
import ${package}.components.content.navigation.primarynavigation.PrimaryNavigation;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Component(value = "Primary Navigation Bar",
        resourceSuperType = DefaultBootstrapPrimaryNavbar.RESOURCE_TYPE,
        name = "navigation/primarynavbar",
        isContainer = true)
@Model(adaptables = Resource.class, adapters = BootstrapPrimaryNavbar.class, resourceType = PrimaryNavBar.RESOURCE_TYPE)
public class PrimaryNavBar extends DefaultBootstrapPrimaryNavbar {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/navigation/primarynavbar";

    @Override
    public String getBrandResourceType() {
        return Brand.RESOURCE_TYPE;
    }

    @Override
    public String getPrimaryNavigationResourceType() {
        return PrimaryNavigation.RESOURCE_TYPE;
    }

}
