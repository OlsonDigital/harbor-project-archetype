package ${package}.components.content.title

import ${package}.annotations.HarborComponent
import com.icfolson.aem.harbor.core.components.content.title.Title as HarborTitle

@HarborComponent(value = "Title", resourceSuperType = HarborTitle.RESOURCE_TYPE)
class Title extends HarborTitle {
}
