package ${package}.components.page.sectionlandingpage;

import com.icfolson.aem.harbor.api.content.page.HierarchicalPage;
import com.icfolson.aem.harbor.core.content.page.v1.DefaultSectionLandingPage;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, adapters = {com.icfolson.aem.harbor.api.content.page.SectionLandingPage.class, HierarchicalPage.class}, resourceType = SectionLandingPage.RESOURCE_TYPE)
public class SectionLandingPage extends DefaultSectionLandingPage {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/page/sectionlandingpage";

}
