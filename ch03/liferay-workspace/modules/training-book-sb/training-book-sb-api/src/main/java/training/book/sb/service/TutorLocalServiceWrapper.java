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

package training.book.sb.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TutorLocalService}.
 *
 * @author Vishal Kumar Nalla
 * @see TutorLocalService
 * @generated
 */
@ProviderType
public class TutorLocalServiceWrapper implements TutorLocalService,
	ServiceWrapper<TutorLocalService> {
	public TutorLocalServiceWrapper(TutorLocalService tutorLocalService) {
		_tutorLocalService = tutorLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tutorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tutorLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _tutorLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tutorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tutorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tutorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of tutors.
	*
	* @return the number of tutors
	*/
	@Override
	public int getTutorsCount() {
		return _tutorLocalService.getTutorsCount();
	}

	@Override
	public int getTutorsCount(long groupId, long trainingId) {
		return _tutorLocalService.getTutorsCount(groupId, trainingId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tutorLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _tutorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link training.book.sb.model.impl.TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _tutorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link training.book.sb.model.impl.TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _tutorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the tutors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link training.book.sb.model.impl.TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @return the range of tutors
	*/
	@Override
	public java.util.List<training.book.sb.model.Tutor> getTutors(int start,
		int end) {
		return _tutorLocalService.getTutors(start, end);
	}

	@Override
	public java.util.List<training.book.sb.model.Tutor> getTutors(
		long groupId, long trainingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tutorLocalService.getTutors(groupId, trainingId);
	}

	@Override
	public java.util.List<training.book.sb.model.Tutor> getTutors(
		long groupId, long trainingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tutorLocalService.getTutors(groupId, trainingId, start, end);
	}

	@Override
	public java.util.List<training.book.sb.model.Tutor> getTutors(
		long groupId, long trainingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<training.book.sb.model.Tutor> obc) {
		return _tutorLocalService.getTutors(groupId, trainingId, start, end, obc);
	}

	/**
	* Returns all the tutors matching the UUID and company.
	*
	* @param uuid the UUID of the tutors
	* @param companyId the primary key of the company
	* @return the matching tutors, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<training.book.sb.model.Tutor> getTutorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _tutorLocalService.getTutorsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of tutors matching the UUID and company.
	*
	* @param uuid the UUID of the tutors
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching tutors, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<training.book.sb.model.Tutor> getTutorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<training.book.sb.model.Tutor> orderByComparator) {
		return _tutorLocalService.getTutorsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _tutorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _tutorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public training.book.sb.model.Tutor addTutor(long userId, long trainingId,
		java.lang.String tutorName, java.lang.String tutorEmail,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tutorLocalService.addTutor(userId, trainingId, tutorName,
			tutorEmail, serviceContext);
	}

	/**
	* Adds the tutor to the database. Also notifies the appropriate model listeners.
	*
	* @param tutor the tutor
	* @return the tutor that was added
	*/
	@Override
	public training.book.sb.model.Tutor addTutor(
		training.book.sb.model.Tutor tutor) {
		return _tutorLocalService.addTutor(tutor);
	}

	/**
	* Creates a new tutor with the primary key. Does not add the tutor to the database.
	*
	* @param tutorId the primary key for the new tutor
	* @return the new tutor
	*/
	@Override
	public training.book.sb.model.Tutor createTutor(long tutorId) {
		return _tutorLocalService.createTutor(tutorId);
	}

	/**
	* Deletes the tutor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor that was removed
	* @throws PortalException if a tutor with the primary key could not be found
	*/
	@Override
	public training.book.sb.model.Tutor deleteTutor(long tutorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tutorLocalService.deleteTutor(tutorId);
	}

	@Override
	public training.book.sb.model.Tutor deleteTutor(long tutorId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tutorLocalService.deleteTutor(tutorId, serviceContext);
	}

	/**
	* Deletes the tutor from the database. Also notifies the appropriate model listeners.
	*
	* @param tutor the tutor
	* @return the tutor that was removed
	*/
	@Override
	public training.book.sb.model.Tutor deleteTutor(
		training.book.sb.model.Tutor tutor) {
		return _tutorLocalService.deleteTutor(tutor);
	}

	@Override
	public training.book.sb.model.Tutor fetchTutor(long tutorId) {
		return _tutorLocalService.fetchTutor(tutorId);
	}

	/**
	* Returns the tutor matching the UUID and group.
	*
	* @param uuid the tutor's UUID
	* @param groupId the primary key of the group
	* @return the matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	@Override
	public training.book.sb.model.Tutor fetchTutorByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _tutorLocalService.fetchTutorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the tutor with the primary key.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor
	* @throws PortalException if a tutor with the primary key could not be found
	*/
	@Override
	public training.book.sb.model.Tutor getTutor(long tutorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tutorLocalService.getTutor(tutorId);
	}

	/**
	* Returns the tutor matching the UUID and group.
	*
	* @param uuid the tutor's UUID
	* @param groupId the primary key of the group
	* @return the matching tutor
	* @throws PortalException if a matching tutor could not be found
	*/
	@Override
	public training.book.sb.model.Tutor getTutorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tutorLocalService.getTutorByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public training.book.sb.model.Tutor updateTutor(long userId,
		long trainingId, long tutorId, java.lang.String tutorName,
		java.lang.String tutorEmail,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tutorLocalService.updateTutor(userId, trainingId, tutorId,
			tutorName, tutorEmail, serviceContext);
	}

	/**
	* Updates the tutor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tutor the tutor
	* @return the tutor that was updated
	*/
	@Override
	public training.book.sb.model.Tutor updateTutor(
		training.book.sb.model.Tutor tutor) {
		return _tutorLocalService.updateTutor(tutor);
	}

	@Override
	public TutorLocalService getWrappedService() {
		return _tutorLocalService;
	}

	@Override
	public void setWrappedService(TutorLocalService tutorLocalService) {
		_tutorLocalService = tutorLocalService;
	}

	private TutorLocalService _tutorLocalService;
}