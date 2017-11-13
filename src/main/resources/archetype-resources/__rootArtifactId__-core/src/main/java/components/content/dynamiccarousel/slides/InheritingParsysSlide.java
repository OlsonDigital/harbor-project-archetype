package ${package}.components.content.dynamiccarousel.slides;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(value = "Inheriting Parsys Slide",
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.slides.parsysslide.v1.InheritingParsysSlide.RESOURCE_TYPE,
        actions = { "text: Parsys Slide", "-", "edit", "delete" },
        isContainer = true,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Move Up", handler = "function(){Harbor.Components.DynamicCarousel.v1.DynamicCarousel.moveUp( this )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionUp")
                        }),
                @ActionConfig(text = "Move Down", handler = "function(){Harbor.Components.DynamicCarousel.v1.DynamicCarousel.moveDown( this )}",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--accordionDown")
                        })
        },
        listeners = {
                @Listener(name = "afterinsert", value = "REFRESH_PARENT"),
                @Listener(name = "afteredit", value = "REFRESH_PARENT"),
                @Listener(name = "afterdelete", value = "REFRESH_PARENT")
        },
        name = "dynamiccarousel/slides/parsysslide/inheriting")
public class InheritingParsysSlide extends com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.slides.parsysslide.v1.InheritingParsysSlide {

    public static final String RESOURCE_TYPE = ParsysSlide.RESOURCE_TYPE + "/inheriting";

}
