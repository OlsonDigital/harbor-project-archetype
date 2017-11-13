package ${package}.components.content.html;

import com.citytechinc.cq.component.annotations.Component;
import com.icfolson.aem.harbor.core.components.content.html.v1.DefaultHTML;

@Component(value = "HTML",
        resourceSuperType = DefaultHTML.RESOURCE_TYPE)
public class HTML extends DefaultHTML {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/html";

}
