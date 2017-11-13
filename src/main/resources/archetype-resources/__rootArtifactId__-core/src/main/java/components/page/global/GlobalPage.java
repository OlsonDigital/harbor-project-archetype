package ${package}.components.page.global;

import com.icfolson.aem.harbor.api.content.page.HierarchicalPage;
import com.icfolson.aem.harbor.core.content.page.v1.DefaultHierarchicalPage;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, adapters = HierarchicalPage.class, resourceType = GlobalPage.RESOURCE_TYPE)
public class GlobalPage extends DefaultHierarchicalPage {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/page/global";

}
