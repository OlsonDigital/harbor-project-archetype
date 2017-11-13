package ${package}.components.content.pagefooter;

import com.citytechinc.cq.component.annotations.Component;

@Component(value = "Page Footer",
        isContainer = true,
        group = ".hidden",
        actions = { "text: Page Footer" },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.pagefooter.v1.PageFooter.RESOURCE_TYPE)
class PageFooter extends com.icfolson.aem.harbor.core.components.content.pagefooter.v1.PageFooter {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/pagefooter";

}
