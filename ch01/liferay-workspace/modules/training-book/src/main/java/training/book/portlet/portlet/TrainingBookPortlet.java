package training.book.portlet.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import training.book.model.Entry;
import training.book.portlet.constants.TrainingBookPortletKeys;

/**
 * @author vishalkumar.n
 */
@Component(immediate = true, property = {
        "com.liferay.portlet.display-category=category.sample",
        "com.liferay.portlet.instanceable=true",
        "javax.portlet.display-name=training-book Portlet",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/view.jsp",
        "javax.portlet.name=" + TrainingBookPortletKeys.TrainingBook,
        "javax.portlet.resource-bundle=content.Language",        
        "javax.portlet.security-role-ref=power-user,user"
}, service = Portlet.class)
public class TrainingBookPortlet extends MVCPortlet {

    @Override
    public void render(RenderRequest renderRequest,
            RenderResponse renderResponse)
            throws IOException, PortletException {

        PortletPreferences prefs = renderRequest.getPreferences();
        String[] trainingbookEntries = prefs.getValues("trainingbook-entries",
                new String[1]);

        if (trainingbookEntries != null) {

            List<Entry> entries = parseEntries(trainingbookEntries);

            renderRequest.setAttribute("entries", entries);
        }

        super.render(renderRequest, renderResponse);
    }

    private List<Entry> parseEntries(String[] trainingbookEntries) {

        List<Entry> entries = new ArrayList<Entry>();

        for (String entry : trainingbookEntries) {
            if (entry != null) {
                String[] parts = entry.split("\\^", 2);
                Entry gbEntry = new Entry(parts[0], parts[1]);
                entries.add(gbEntry);
            }
        }

        return entries;
    }

    public void addTraining(ActionRequest request, ActionResponse response)
            throws PortalException, SystemException {
        try {

            PortletPreferences prefs = request.getPreferences();

            // Returns 1 string array element if it does not exist
            String[] trainingBookEntries = prefs
                    .getValues("trainingbook-entries", new String[1]);

            List<String> entries = new ArrayList<String>();

            if (trainingBookEntries != null) {

                entries = new ArrayList<String>(Arrays.asList(prefs
                        .getValues("trainingbook-entries", new String[1])));

            }

            String trainingName = ParamUtil.getString(request, "trainingName");
            String trainingDescription = ParamUtil.getString(request,
                    "trainingDescription");
            String entry = trainingName + "^" + trainingDescription;

            entries.add(entry);

            String[] array = entries.toArray(new String[entries.size()]);

            prefs.setValues("trainingbook-entries", array);

            try {

                prefs.store();

            } catch (IOException ex) {

                Logger.getLogger(TrainingBookPortlet.class.getName())
                        .log(Level.SEVERE, null, ex);

            } catch (ValidatorException ex) {

                Logger.getLogger(TrainingBookPortlet.class.getName())
                        .log(Level.SEVERE, null, ex);

            }

        } catch (ReadOnlyException ex) {

            Logger.getLogger(TrainingBookPortlet.class.getName())
                    .log(Level.SEVERE, null, ex);

        }

    }

}