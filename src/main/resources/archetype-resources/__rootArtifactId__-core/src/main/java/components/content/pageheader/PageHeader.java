package ${package}.components.content.pageheader;

import com.citytechinc.cq.component.annotations.Component;

@Component(value = "Page Header",
        group = ".hidden",
        actions = { "text: Page Header" },
        isContainer = true,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.pageheader.v1.PageHeader.RESOURCE_TYPE)
class PageHeader extends com.icfolson.aem.harbor.core.components.content.pageheader.v1.PageHeader {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/pageheader";

}
