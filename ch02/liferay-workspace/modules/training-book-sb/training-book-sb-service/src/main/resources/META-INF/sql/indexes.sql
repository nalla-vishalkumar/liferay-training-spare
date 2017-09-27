create index IX_B71AF719 on TB_Training (groupId);
create index IX_7ACF4C65 on TB_Training (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_5419A827 on TB_Training (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1499DEC8 on TB_Tutor (groupId, trainingId);
create index IX_A7AC35BF on TB_Tutor (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_89F52001 on TB_Tutor (uuid_[$COLUMN_LENGTH:75$], groupId);