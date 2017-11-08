package ${package}.components.content.carousel;


import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.carousel.v1.DefaultCarousel;

@Component(
        value = "Carousel",
        actions = { "text: Carousel", "edit", "-", "copymove", "delete", "-", "insert" },
        isContainer = true,
        resourceSuperType = DefaultCarousel.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Add Slide",
                        handler = "function() { Harbor.Components.Carousel.v1.Carousel.addSlide(this, '" + CarouselSlide.RESOURCE_TYPE + "') }",
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
public class Carousel extends DefaultCarousel {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/carousel";

}
