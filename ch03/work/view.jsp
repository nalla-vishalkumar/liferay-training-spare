<%@ include file="/init.jsp" %>

<%
	String svgPath = "<use xlink:href=\"themeDisplay.getPathThemeImages()/lexicon/icons\" />";

%>
<p>
	<b><liferay-ui:message key="training-book.caption"/></b>
	
	<b>Alerts</b> 
	
	<p>Alerts with Embedded Links</p>
	
	<div class="alert alert-danger">
	    <strong class="lead">Danger</strong> <a href="#" class="alert-link">Something</a> is not right.
	</div>
	
	<p>Dissimable alerts</p>
		
	<div class="alert alert-dismissible alert-danger" role="alert">
	    <button aria-label="Close" class="close" data-dismiss="alert" type="button">
	        <svg aria-hidden="true" class="icon-monospaced lexicon-icon  lexicon-icon-times">
	            <%=svgPath%>
	        </svg>
	        <span class="sr-only">Close</span>
	    </button>
	
	    <strong class="lead">Danger</strong> Something is not right.
	</div>
	
	<p>Alert Notifications</p>
	
	
	<div class="alert alert-dismissible alert-notification alert-danger" role="alert">
	        <button aria-label="Close" class="close" data-dismiss="alert" type="button">
	            <svg aria-hidden="true" class="icon-monospaced lexicon-icon lexicon-icon-times">
	                <% svgPath = svgPath + "" %>
	            </svg>
	        </button>
	
	        <strong class="lead">Danger:</strong>
	        <p>Your session has expired. Please <a class="alert-link" href="#1">log in</a>.</p>
	</div>
	
	<p>Badges</p>
	
	<span class="badge badge-default">Default</span>
	<span class="badge badge-primary">Primary</span>
	<span class="badge badge-success">Success</span>
	<span class="badge badge-info">Info</span>
	<span class="badge badge-warning">Warning</span>
	<span class="badge badge-danger">Danger</span>
	
	<span class="badge badge-default badge-sm">
	    Small Badge
	    <a class="icon-monospaced" href="#1">
	        <svg aria-hidden="true" class="lexicon-icon lexicon-icon-times">
				<%=svgPath%>
	        </svg>
	    </a>
	</span>
	
	<span class="badge badge-primary">
	    Default Badge
	    <a class="icon-monospaced" href="#1">
	        <svg aria-hidden="true" class="lexicon-icon lexicon-icon-times">
	            <%=svgPath%>
	        </svg>
	    </a>
	</span>
	
	<span class="badge badge-lg badge-success">
	    Large Badge
	    <a class="icon-monospaced" href="#1">
	        <svg aria-hidden="true" class="lexicon-icon lexicon-icon-times">
	            <%=svgPath%>
	        </svg>
	    </a>
	</span>	
	<p>
		<span class="badge badge-info badge-sm">12</span>
	</p>	
	
	<span class="label label-default">Default</span>
	<span class="label label-primary">Primary</span>
	<span class="label label-success">Success</span>
	<span class="label label-info">Info</span>
	<span class="label label-warning">Warning</span>
	<span class="label label-danger">Danger</span>
	
	
	<p>Bootstrap layout</p>

	<div class="container">
		<div class="row">
			<div class="col">1 of 2</div>
			<div class="col">1 of 2</div>
		</div>
		<div class="row">
			<div class="col">1 of 3</div>
			<div class="col">1 of 3</div>
			<div class="col">1 of 3</div>
		</div>
	</div>
</p>