package ${package}.components.content.dynamiccarousel;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.DefaultDynamicCarousel;
import com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.NewSlide;

@Component(
        value = "Dynamic Carousel",
        actions = { "text: Dynamic Carousel", "edit", "-", "copymove", "delete", "-", "insert" },
        isContainer = true,
        resourceSuperType = DefaultDynamicCarousel.RESOURCE_TYPE,
        actionConfigs = {
                @ActionConfig(xtype = "tbseparator"),
                @ActionConfig(text = "Add Slide",
                        handler = "function() { Harbor.Components.DynamicCarousel.v1.DynamicCarousel.addSlide( this, '" + "/apps/" + NewSlide.RESOURCE_TYPE + "/" + NewSlide.DIALOG_FILE_NAME + "' ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--experienceAdd")
                        } ),
                @ActionConfig(text = "Previous Slide",
                        handler = "function() { Harbor.Components.DynamicCarousel.v1.DynamicCarousel.previousSlide( this ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--rewindCircle")
                        } ),
                @ActionConfig(text = "Next Slide",
                        handler = "function() { Harbor.Components.DynamicCarousel.v1.DynamicCarousel.nextSlide( this ) }",
                        additionalProperties = {
                                @ActionConfigProperty(name = "icon", value = "coral-Icon--fastForwardCircle")
                        } )
        } )
public class DynamicCarousel extends DefaultDynamicCarousel {

    public static final String RESOURCE_TYPE = "${rootArtifactId}/components/content/dynamiccarousel";

}
