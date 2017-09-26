<%@ include file="/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addTraining" var="addTrainingURL"></portlet:actionURL>

<aui:form action="<%= addTrainingURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>

            <aui:input name="trainingName"></aui:input>
            <aui:input name="trainingDescription"></aui:input>
            
        </aui:fieldset>

        <aui:button-row>

            <aui:button type="submit"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

        </aui:button-row>
</aui:form>