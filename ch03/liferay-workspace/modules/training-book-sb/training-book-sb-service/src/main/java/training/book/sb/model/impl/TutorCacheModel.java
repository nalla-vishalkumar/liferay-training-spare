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

import training.book.sb.model.Tutor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Tutor in entity cache.
 *
 * @author Vishal Kumar Nalla
 * @see Tutor
 * @generated
 */
@ProviderType
public class TutorCacheModel implements CacheModel<Tutor>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TutorCacheModel)) {
			return false;
		}

		TutorCacheModel tutorCacheModel = (TutorCacheModel)obj;

		if (tutorId == tutorCacheModel.tutorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tutorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", tutorId=");
		sb.append(tutorId);
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
		sb.append(", tutorName=");
		sb.append(tutorName);
		sb.append(", tutorEmail=");
		sb.append(tutorEmail);
		sb.append(", trainingId=");
		sb.append(trainingId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tutor toEntityModel() {
		TutorImpl tutorImpl = new TutorImpl();

		if (uuid == null) {
			tutorImpl.setUuid(StringPool.BLANK);
		}
		else {
			tutorImpl.setUuid(uuid);
		}

		tutorImpl.setTutorId(tutorId);
		tutorImpl.setGroupId(groupId);
		tutorImpl.setCompanyId(companyId);
		tutorImpl.setUserId(userId);

		if (userName == null) {
			tutorImpl.setUserName(StringPool.BLANK);
		}
		else {
			tutorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tutorImpl.setCreateDate(null);
		}
		else {
			tutorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tutorImpl.setModifiedDate(null);
		}
		else {
			tutorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tutorName == null) {
			tutorImpl.setTutorName(StringPool.BLANK);
		}
		else {
			tutorImpl.setTutorName(tutorName);
		}

		if (tutorEmail == null) {
			tutorImpl.setTutorEmail(StringPool.BLANK);
		}
		else {
			tutorImpl.setTutorEmail(tutorEmail);
		}

		tutorImpl.setTrainingId(trainingId);

		tutorImpl.resetOriginalValues();

		return tutorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		tutorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tutorName = objectInput.readUTF();
		tutorEmail = objectInput.readUTF();

		trainingId = objectInput.readLong();
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

		objectOutput.writeLong(tutorId);

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

		if (tutorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tutorName);
		}

		if (tutorEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tutorEmail);
		}

		objectOutput.writeLong(trainingId);
	}

	public String uuid;
	public long tutorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tutorName;
	public String tutorEmail;
	public long trainingId;
}