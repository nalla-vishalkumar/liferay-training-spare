create table TB_Training (
	uuid_ VARCHAR(75) null,
	trainingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	trainingName VARCHAR(75) null,
	trainingDescription VARCHAR(75) null,
	tutorId LONG
);

create table TB_Tutor (
	uuid_ VARCHAR(75) null,
	tutorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tutorName VARCHAR(75) null,
	tutorEmail VARCHAR(75) null,
	trainingId LONG
);