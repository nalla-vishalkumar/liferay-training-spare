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
 * This class is a wrapper for {@link Training}.
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see Training
 * @generated
 */
@ProviderType
public class TrainingWrapper implements Training, ModelWrapper<Training> {
	public TrainingWrapper(Training training) {
		_training = training;
	}

	@Override
	public Class<?> getModelClass() {
		return Training.class;
	}

	@Override
	public String getModelClassName() {
		return Training.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("trainingId", getTrainingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("trainingName", getTrainingName());
		attributes.put("trainingDescription", getTrainingDescription());
		attributes.put("tutorId", getTutorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long trainingId = (Long)attributes.get("trainingId");

		if (trainingId != null) {
			setTrainingId(trainingId);
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

		String trainingName = (String)attributes.get("trainingName");

		if (trainingName != null) {
			setTrainingName(trainingName);
		}

		String trainingDescription = (String)attributes.get(
				"trainingDescription");

		if (trainingDescription != null) {
			setTrainingDescription(trainingDescription);
		}

		Long tutorId = (Long)attributes.get("tutorId");

		if (tutorId != null) {
			setTutorId(tutorId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _training.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _training.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _training.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _training.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<training.book.sb.model.Training> toCacheModel() {
		return _training.toCacheModel();
	}

	@Override
	public int compareTo(training.book.sb.model.Training training) {
		return _training.compareTo(training);
	}

	@Override
	public int hashCode() {
		return _training.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _training.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TrainingWrapper((Training)_training.clone());
	}

	/**
	* Returns the training description of this training.
	*
	* @return the training description of this training
	*/
	@Override
	public java.lang.String getTrainingDescription() {
		return _training.getTrainingDescription();
	}

	/**
	* Returns the training name of this training.
	*
	* @return the training name of this training
	*/
	@Override
	public java.lang.String getTrainingName() {
		return _training.getTrainingName();
	}

	/**
	* Returns the user name of this training.
	*
	* @return the user name of this training
	*/
	@Override
	public java.lang.String getUserName() {
		return _training.getUserName();
	}

	/**
	* Returns the user uuid of this training.
	*
	* @return the user uuid of this training
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _training.getUserUuid();
	}

	/**
	* Returns the uuid of this training.
	*
	* @return the uuid of this training
	*/
	@Override
	public java.lang.String getUuid() {
		return _training.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _training.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _training.toXmlString();
	}

	/**
	* Returns the create date of this training.
	*
	* @return the create date of this training
	*/
	@Override
	public Date getCreateDate() {
		return _training.getCreateDate();
	}

	/**
	* Returns the modified date of this training.
	*
	* @return the modified date of this training
	*/
	@Override
	public Date getModifiedDate() {
		return _training.getModifiedDate();
	}

	/**
	* Returns the company ID of this training.
	*
	* @return the company ID of this training
	*/
	@Override
	public long getCompanyId() {
		return _training.getCompanyId();
	}

	/**
	* Returns the group ID of this training.
	*
	* @return the group ID of this training
	*/
	@Override
	public long getGroupId() {
		return _training.getGroupId();
	}

	/**
	* Returns the primary key of this training.
	*
	* @return the primary key of this training
	*/
	@Override
	public long getPrimaryKey() {
		return _training.getPrimaryKey();
	}

	/**
	* Returns the training ID of this training.
	*
	* @return the training ID of this training
	*/
	@Override
	public long getTrainingId() {
		return _training.getTrainingId();
	}

	/**
	* Returns the tutor ID of this training.
	*
	* @return the tutor ID of this training
	*/
	@Override
	public long getTutorId() {
		return _training.getTutorId();
	}

	/**
	* Returns the user ID of this training.
	*
	* @return the user ID of this training
	*/
	@Override
	public long getUserId() {
		return _training.getUserId();
	}

	@Override
	public training.book.sb.model.Training toEscapedModel() {
		return new TrainingWrapper(_training.toEscapedModel());
	}

	@Override
	public training.book.sb.model.Training toUnescapedModel() {
		return new TrainingWrapper(_training.toUnescapedModel());
	}

	@Override
	public void persist() {
		_training.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_training.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this training.
	*
	* @param companyId the company ID of this training
	*/
	@Override
	public void setCompanyId(long companyId) {
		_training.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this training.
	*
	* @param createDate the create date of this training
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_training.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_training.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_training.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_training.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this training.
	*
	* @param groupId the group ID of this training
	*/
	@Override
	public void setGroupId(long groupId) {
		_training.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this training.
	*
	* @param modifiedDate the modified date of this training
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_training.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_training.setNew(n);
	}

	/**
	* Sets the primary key of this training.
	*
	* @param primaryKey the primary key of this training
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_training.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_training.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the training description of this training.
	*
	* @param trainingDescription the training description of this training
	*/
	@Override
	public void setTrainingDescription(java.lang.String trainingDescription) {
		_training.setTrainingDescription(trainingDescription);
	}

	/**
	* Sets the training ID of this training.
	*
	* @param trainingId the training ID of this training
	*/
	@Override
	public void setTrainingId(long trainingId) {
		_training.setTrainingId(trainingId);
	}

	/**
	* Sets the training name of this training.
	*
	* @param trainingName the training name of this training
	*/
	@Override
	public void setTrainingName(java.lang.String trainingName) {
		_training.setTrainingName(trainingName);
	}

	/**
	* Sets the tutor ID of this training.
	*
	* @param tutorId the tutor ID of this training
	*/
	@Override
	public void setTutorId(long tutorId) {
		_training.setTutorId(tutorId);
	}

	/**
	* Sets the user ID of this training.
	*
	* @param userId the user ID of this training
	*/
	@Override
	public void setUserId(long userId) {
		_training.setUserId(userId);
	}

	/**
	* Sets the user name of this training.
	*
	* @param userName the user name of this training
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_training.setUserName(userName);
	}

	/**
	* Sets the user uuid of this training.
	*
	* @param userUuid the user uuid of this training
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_training.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this training.
	*
	* @param uuid the uuid of this training
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_training.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TrainingWrapper)) {
			return false;
		}

		TrainingWrapper trainingWrapper = (TrainingWrapper)obj;

		if (Objects.equals(_training, trainingWrapper._training)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _training.getStagedModelType();
	}

	@Override
	public Training getWrappedModel() {
		return _training;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _training.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _training.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_training.resetOriginalValues();
	}

	private final Training _training;
}