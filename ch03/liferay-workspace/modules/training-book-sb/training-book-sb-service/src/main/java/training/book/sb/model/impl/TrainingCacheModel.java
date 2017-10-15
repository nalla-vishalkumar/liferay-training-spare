/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package training.book.sb.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import training.book.sb.model.Training;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Training in entity cache.
 *
 * @author Vishal Kumar Nalla
 * @see Training
 * @generated
 */
@ProviderType
public class TrainingCacheModel implements CacheModel<Training>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TrainingCacheModel)) {
			return false;
		}

		TrainingCacheModel trainingCacheModel = (TrainingCacheModel)obj;

		if (trainingId == trainingCacheModel.trainingId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, trainingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", trainingId=");
		sb.append(trainingId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", trainingName=");
		sb.append(trainingName);
		sb.append(", trainingDescription=");
		sb.append(trainingDescription);
		sb.append(", tutorId=");
		sb.append(tutorId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Training toEntityModel() {
		TrainingImpl trainingImpl = new TrainingImpl();

		if (uuid == null) {
			trainingImpl.setUuid(StringPool.BLANK);
		}
		else {
			trainingImpl.setUuid(uuid);
		}

		trainingImpl.setTrainingId(trainingId);
		trainingImpl.setGroupId(groupId);
		trainingImpl.setCompanyId(companyId);
		trainingImpl.setUserId(userId);

		if (userName == null) {
			trainingImpl.setUserName(StringPool.BLANK);
		}
		else {
			trainingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			trainingImpl.setCreateDate(null);
		}
		else {
			trainingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			trainingImpl.setModifiedDate(null);
		}
		else {
			trainingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (trainingName == null) {
			trainingImpl.setTrainingName(StringPool.BLANK);
		}
		else {
			trainingImpl.setTrainingName(trainingName);
		}

		if (trainingDescription == null) {
			trainingImpl.setTrainingDescription(StringPool.BLANK);
		}
		else {
			trainingImpl.setTrainingDescription(trainingDescription);
		}

		trainingImpl.setTutorId(tutorId);

		trainingImpl.resetOriginalValues();

		return trainingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		trainingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		trainingName = objectInput.readUTF();
		trainingDescription = objectInput.readUTF();

		tutorId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(trainingId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (trainingName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trainingName);
		}

		if (trainingDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trainingDescription);
		}

		objectOutput.writeLong(tutorId);
	}

	public String uuid;
	public long trainingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String trainingName;
	public String trainingDescription;
	public long tutorId;
}