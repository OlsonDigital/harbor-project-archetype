package ${package}.components.content.carousel;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Carousel",
        actions = { "text: Carousel", "edit" },
        isContainer = true,
        group = ComponentConstants.GROUP_HIDDEN,
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.carousel.v1.InheritingCarousel.RESOURCE_TYPE,
        name = "carousel/inheriting",
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Add Slide",
                        handler = "function() { Harbor.Components.Carousel.v1.Carousel.addSlide(this, '" + InheritingCarouselSlide.RESOURCE_TYPE + "') }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        } ),
                @ActionConfig(text = "Previous Slide",
                        handler = "function() { Harbor.Components.Carousel.v1.Carousel.previousSlide( this ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--rewindCircle")
                        } ),
                @ActionConfig(text = "Next Slide",
                        handler = "function() { Harbor.Components.Carousel.v1.Carousel.nextSlide( this ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--fastForwardCircle")
                        } )})
public class InheritingCarousel extends com.icfolson.aem.harbor.core.components.content.carousel.v1.InheritingCarousel {

    public static final String RESOURCE_TYPE = Carousel.RESOURCE_TYPE + "/inheriting";

}
