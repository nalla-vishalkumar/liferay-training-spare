<%@include file="../init.jsp"%>

<%
long trainingId = Long.valueOf((Long) renderRequest
        .getAttribute("trainingId"));
System.out.println("trainingId - " + trainingId);
%>

<aui:button-row cssClass="training-buttons">

    <portlet:renderURL var="addTutorURL">
        <portlet:param name="mvcPath" value="/training-book/edit_training.jsp" />
        <portlet:param name="trainingId"
            value="<%=String.valueOf(trainingId)%>" />
    </portlet:renderURL>

    <aui:button onClick="<%=addTutorURL.toString()%>" value="Add Tutor"></aui:button>

</aui:button-row>

<%
int tutorsCount = TutorLocalServiceUtil.getTutorsCount();
System.out.println("tutorsCount - " + tutorsCount);

System.out.println("tutorsCount by groupId and trainingId - " + TutorLocalServiceUtil.getTutorsCount(20143, trainingId));
%>
<liferay-ui:search-container total="<%=tutorsCount%>">
<liferay-ui:search-container-results
    results="<%=TutorLocalServiceUtil.getTutors(scopeGroupId.longValue(),
            trainingId, searchContainer.getStart(),
            searchContainer.getEnd())%>" />

<liferay-ui:search-container-row
    className="training.book.sb.model.Tutor" modelVar="tutor">

    <liferay-ui:search-container-column-text property="tutorName" />

    <liferay-ui:search-container-column-text property="tutorEmail" />

</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>