package training.lfr.liferaymvc.web.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import training.lfr.liferaymvc.web.constants.LiferayMVCPortletKeys;

/**
 * @author vishalkumar.n
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=training.lfr.liferaymvc.web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LiferayMVCPortletKeys.LiferayMVC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LiferayMVCPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest,
	        RenderResponse renderResponse) throws PortletException, IOException {
			renderRequest.setAttribute("testAttribute", "LiferayMVC Portlet");
	}
	
}