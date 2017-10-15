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

package training.book.sb.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link training.book.sb.service.http.TutorServiceSoap}.
 *
 * @author Vishal Kumar Nalla
 * @see training.book.sb.service.http.TutorServiceSoap
 * @generated
 */
@ProviderType
public class TutorSoap implements Serializable {
	public static TutorSoap toSoapModel(Tutor model) {
		TutorSoap soapModel = new TutorSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTutorId(model.getTutorId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTutorName(model.getTutorName());
		soapModel.setTutorEmail(model.getTutorEmail());
		soapModel.setTrainingId(model.getTrainingId());

		return soapModel;
	}

	public static TutorSoap[] toSoapModels(Tutor[] models) {
		TutorSoap[] soapModels = new TutorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TutorSoap[][] toSoapModels(Tutor[][] models) {
		TutorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TutorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TutorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TutorSoap[] toSoapModels(List<Tutor> models) {
		List<TutorSoap> soapModels = new ArrayList<TutorSoap>(models.size());

		for (Tutor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TutorSoap[soapModels.size()]);
	}

	public TutorSoap() {
	}

	public long getPrimaryKey() {
		return _tutorId;
	}

	public void setPrimaryKey(long pk) {
		setTutorId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTutorId() {
		return _tutorId;
	}

	public void setTutorId(long tutorId) {
		_tutorId = tutorId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTutorName() {
		return _tutorName;
	}

	public void setTutorName(String tutorName) {
		_tutorName = tutorName;
	}

	public String getTutorEmail() {
		return _tutorEmail;
	}

	public void setTutorEmail(String tutorEmail) {
		_tutorEmail = tutorEmail;
	}

	public long getTrainingId() {
		return _trainingId;
	}

	public void setTrainingId(long trainingId) {
		_trainingId = trainingId;
	}

	private String _uuid;
	private long _tutorId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tutorName;
	private String _tutorEmail;
	private long _trainingId;
}