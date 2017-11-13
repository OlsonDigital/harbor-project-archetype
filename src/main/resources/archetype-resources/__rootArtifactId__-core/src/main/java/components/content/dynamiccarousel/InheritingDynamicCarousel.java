package ${package}.components.content.dynamiccarousel;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfig;
import com.citytechinc.cq.component.annotations.editconfig.ActionConfigProperty;
import com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.NewSlide;
import com.icfolson.aem.library.core.constants.ComponentConstants;

@Component(
        value = "Inheriting Dynamic Carousel",
        group = ComponentConstants.GROUP_HIDDEN,
        actions = { "text: Dynamic Carousel", "edit" },
        isContainer = true,
        name = "dynamiccarousel/inheriting",
        resourceSuperType = com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.InheritingDynamicCarousel.RESOURCE_TYPE,
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
public class InheritingDynamicCarousel extends com.icfolson.aem.harbor.core.components.content.dynamiccarousel.v1.InheritingDynamicCarousel {

    public static final String RESOURCE_TYPE = DynamicCarousel.RESOURCE_TYPE + "/inheriting";

}
