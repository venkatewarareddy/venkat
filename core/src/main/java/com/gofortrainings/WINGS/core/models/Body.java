package com.gofortrainings.WINGS.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class Body {
	@ValueMapValue
	private String image;

	public String getImage() {
		return image;
	}
}
