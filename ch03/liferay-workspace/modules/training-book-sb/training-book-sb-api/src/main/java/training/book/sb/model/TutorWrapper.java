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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Tutor}.
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see Tutor
 * @generated
 */
@ProviderType
public class TutorWrapper implements Tutor, ModelWrapper<Tutor> {
	public TutorWrapper(Tutor tutor) {
		_tutor = tutor;
	}

	@Override
	public Class<?> getModelClass() {
		return Tutor.class;
	}

	@Override
	public String getModelClassName() {
		return Tutor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("tutorId", getTutorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tutorName", getTutorName());
		attributes.put("tutorEmail", getTutorEmail());
		attributes.put("trainingId", getTrainingId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long tutorId = (Long)attributes.get("tutorId");

		if (tutorId != null) {
			setTutorId(tutorId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String tutorName = (String)attributes.get("tutorName");

		if (tutorName != null) {
			setTutorName(tutorName);
		}

		String tutorEmail = (String)attributes.get("tutorEmail");

		if (tutorEmail != null) {
			setTutorEmail(tutorEmail);
		}

		Long trainingId = (Long)attributes.get("trainingId");

		if (trainingId != null) {
			setTrainingId(trainingId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _tutor.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tutor.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tutor.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tutor.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<training.book.sb.model.Tutor> toCacheModel() {
		return _tutor.toCacheModel();
	}

	@Override
	public int compareTo(training.book.sb.model.Tutor tutor) {
		return _tutor.compareTo(tutor);
	}

	@Override
	public int hashCode() {
		return _tutor.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tutor.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TutorWrapper((Tutor)_tutor.clone());
	}

	/**
	* Returns the tutor email of this tutor.
	*
	* @return the tutor email of this tutor
	*/
	@Override
	public java.lang.String getTutorEmail() {
		return _tutor.getTutorEmail();
	}

	/**
	* Returns the tutor name of this tutor.
	*
	* @return the tutor name of this tutor
	*/
	@Override
	public java.lang.String getTutorName() {
		return _tutor.getTutorName();
	}

	/**
	* Returns the user name of this tutor.
	*
	* @return the user name of this tutor
	*/
	@Override
	public java.lang.String getUserName() {
		return _tutor.getUserName();
	}

	/**
	* Returns the user uuid of this tutor.
	*
	* @return the user uuid of this tutor
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _tutor.getUserUuid();
	}

	/**
	* Returns the uuid of this tutor.
	*
	* @return the uuid of this tutor
	*/
	@Override
	public java.lang.String getUuid() {
		return _tutor.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _tutor.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tutor.toXmlString();
	}

	/**
	* Returns the create date of this tutor.
	*
	* @return the create date of this tutor
	*/
	@Override
	public Date getCreateDate() {
		return _tutor.getCreateDate();
	}

	/**
	* Returns the modified date of this tutor.
	*
	* @return the modified date of this tutor
	*/
	@Override
	public Date getModifiedDate() {
		return _tutor.getModifiedDate();
	}

	/**
	* Returns the company ID of this tutor.
	*
	* @return the company ID of this tutor
	*/
	@Override
	public long getCompanyId() {
		return _tutor.getCompanyId();
	}

	/**
	* Returns the group ID of this tutor.
	*
	* @return the group ID of this tutor
	*/
	@Override
	public long getGroupId() {
		return _tutor.getGroupId();
	}

	/**
	* Returns the primary key of this tutor.
	*
	* @return the primary key of this tutor
	*/
	@Override
	public long getPrimaryKey() {
		return _tutor.getPrimaryKey();
	}

	/**
	* Returns the training ID of this tutor.
	*
	* @return the training ID of this tutor
	*/
	@Override
	public long getTrainingId() {
		return _tutor.getTrainingId();
	}

	/**
	* Returns the tutor ID of this tutor.
	*
	* @return the tutor ID of this tutor
	*/
	@Override
	public long getTutorId() {
		return _tutor.getTutorId();
	}

	/**
	* Returns the user ID of this tutor.
	*
	* @return the user ID of this tutor
	*/
	@Override
	public long getUserId() {
		return _tutor.getUserId();
	}

	@Override
	public training.book.sb.model.Tutor toEscapedModel() {
		return new TutorWrapper(_tutor.toEscapedModel());
	}

	@Override
	public training.book.sb.model.Tutor toUnescapedModel() {
		return new TutorWrapper(_tutor.toUnescapedModel());
	}

	@Override
	public void persist() {
		_tutor.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tutor.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this tutor.
	*
	* @param companyId the company ID of this tutor
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tutor.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this tutor.
	*
	* @param createDate the create date of this tutor
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_tutor.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tutor.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tutor.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tutor.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this tutor.
	*
	* @param groupId the group ID of this tutor
	*/
	@Override
	public void setGroupId(long groupId) {
		_tutor.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this tutor.
	*
	* @param modifiedDate the modified date of this tutor
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_tutor.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_tutor.setNew(n);
	}

	/**
	* Sets the primary key of this tutor.
	*
	* @param primaryKey the primary key of this tutor
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tutor.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tutor.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the training ID of this tutor.
	*
	* @param trainingId the training ID of this tutor
	*/
	@Override
	public void setTrainingId(long trainingId) {
		_tutor.setTrainingId(trainingId);
	}

	/**
	* Sets the tutor email of this tutor.
	*
	* @param tutorEmail the tutor email of this tutor
	*/
	@Override
	public void setTutorEmail(java.lang.String tutorEmail) {
		_tutor.setTutorEmail(tutorEmail);
	}

	/**
	* Sets the tutor ID of this tutor.
	*
	* @param tutorId the tutor ID of this tutor
	*/
	@Override
	public void setTutorId(long tutorId) {
		_tutor.setTutorId(tutorId);
	}

	/**
	* Sets the tutor name of this tutor.
	*
	* @param tutorName the tutor name of this tutor
	*/
	@Override
	public void setTutorName(java.lang.String tutorName) {
		_tutor.setTutorName(tutorName);
	}

	/**
	* Sets the user ID of this tutor.
	*
	* @param userId the user ID of this tutor
	*/
	@Override
	public void setUserId(long userId) {
		_tutor.setUserId(userId);
	}

	/**
	* Sets the user name of this tutor.
	*
	* @param userName the user name of this tutor
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_tutor.setUserName(userName);
	}

	/**
	* Sets the user uuid of this tutor.
	*
	* @param userUuid the user uuid of this tutor
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_tutor.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this tutor.
	*
	* @param uuid the uuid of this tutor
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_tutor.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TutorWrapper)) {
			return false;
		}

		TutorWrapper tutorWrapper = (TutorWrapper)obj;

		if (Objects.equals(_tutor, tutorWrapper._tutor)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _tutor.getStagedModelType();
	}

	@Override
	public Tutor getWrappedModel() {
		return _tutor;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tutor.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tutor.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tutor.resetOriginalValues();
	}

	private final Tutor _tutor;
}