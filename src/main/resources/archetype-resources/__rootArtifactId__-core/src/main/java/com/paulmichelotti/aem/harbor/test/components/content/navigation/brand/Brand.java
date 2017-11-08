package ${package}.components.content.navigation.brand;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.navigation.brand.bootstrapbrand.v1.DefaultBootstrapBrand;

@Component(value = "Brand",
        //actions = { "text: Brand", "-", "edit" },
        name = "navigation/brand",
        resourceSuperType = DefaultBootstrapBrand.RESOURCE_TYPE)
public class Brand extends DefaultBootstrapBrand {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/navigation/brand";

}
