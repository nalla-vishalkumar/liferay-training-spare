<%@ include file="/init.jsp" %>

<jsp:useBean id="entries" class="java.util.ArrayList" scope="request"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
    results="<%= entries %>"
/>

    <liferay-ui:search-container-row
        className="training.book.model.Entry"
        modelVar="entry"
    >
        <liferay-ui:search-container-column-text property="trainingName" />

        <liferay-ui:search-container-column-text property="trainingDescription" />
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

	<liferay-portlet:renderURL var="addTrainingURL">
		<portlet:param name="mvcPath" value="/edit_training.jsp"></portlet:param>
		<%--<portlet:param name="redirect" value="<%= currentURL %>" /> --%>
	</liferay-portlet:renderURL>

<aui:button-row cssClass="task-buttons">
	<aui:button onClick="<%= addTrainingURL.toString() %>" value="Add Training"></aui:button>
</aui:button-row>