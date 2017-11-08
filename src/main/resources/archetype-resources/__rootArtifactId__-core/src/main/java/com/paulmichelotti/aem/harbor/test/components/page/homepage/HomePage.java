package ${package}.components.page.homepage;

import com.icfolson.aem.harbor.api.content.page.HierarchicalPage;
import com.icfolson.aem.harbor.core.content.page.v1.DefaultHomePage;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,
        adapters = {com.icfolson.aem.harbor.api.content.page.HomePage.class, HierarchicalPage.class},
        resourceType = HomePage.RESOURCE_TYPE)
public class HomePage extends DefaultHomePage {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/page/homepage";

}
