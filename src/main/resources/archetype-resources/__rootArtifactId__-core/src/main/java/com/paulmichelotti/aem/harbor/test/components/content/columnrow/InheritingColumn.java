package ${package}.components.content.columnrow;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Column",
        group = ComponentConstants.GROUP_HIDDEN,
        actions = { "text:Column", "edit", "delete" },
        name = "columnrow/column/inheriting",
        listeners = {
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        },
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.columnrow.v1.InheritingColumn.RESOURCE_TYPE,
        isContainer = true
)
public class InheritingColumn extends com.icfolson.aem.harbor.core.components.content.columnrow.v1.InheritingColumn {

    public static final String RESOURCE_TYPE = Column.RESOURCE_TYPE + "/inheriting";

}
