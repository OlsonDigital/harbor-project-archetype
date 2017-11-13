package ${package}.components.content.childpagelist;

import com.citytechinc.cq.component.annotations.Component;

@Component(value = "Child Page List",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.list.page.v1.ChildPageList.RESOURCE_TYPE
)
public class ChildPageList extends com.icfolson.aem.harbor.core.components.content.list.page.v1.ChildPageList {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/childpagelist";

}
