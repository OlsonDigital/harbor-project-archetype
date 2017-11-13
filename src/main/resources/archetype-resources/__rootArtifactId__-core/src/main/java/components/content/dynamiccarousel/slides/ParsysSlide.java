package ${package}.components.content.dynamiccarousel.slides;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;

@Component(value = "Parsys Slide",
        group = ".hidden",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.slides.parsysslide.v1.ParsysSlide.RESOURCE_TYPE,
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
        name = "dynamiccarousel/slides/parsysslide")
public class ParsysSlide extends com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.slides.parsysslide.v1.ParsysSlide {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/dynamiccarousel/slides/parsysslide";

}
