package com.gofortrainings.WINGS.core.models;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import java.util.List;
import javax.annotation.PostConstruct;
@Model(adaptables=Resource.class)
public class Header {
	@ChildResource
	List<Field>field;
	
	
	public List<Field> getField() {
		return field;
	}


	@PostConstruct
	public void init() {
		
	}
}
