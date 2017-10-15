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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Tutor. This utility wraps
 * {@link training.book.sb.service.impl.TutorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Vishal Kumar Nalla
 * @see TutorLocalService
 * @see training.book.sb.service.base.TutorLocalServiceBaseImpl
 * @see training.book.sb.service.impl.TutorLocalServiceImpl
 * @generated
 */
@ProviderType
public class TutorLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link training.book.sb.service.impl.TutorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of tutors.
	*
	* @return the number of tutors
	*/
	public static int getTutorsCount() {
		return getService().getTutorsCount();
	}

	public static int getTutorsCount(long groupId, long trainingId) {
		return getService().getTutorsCount(groupId, trainingId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<training.book.sb.model.Tutor> getTutors(
		int start, int end) {
		return getService().getTutors(start, end);
	}

	public static java.util.List<training.book.sb.model.Tutor> getTutors(
		long groupId, long trainingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTutors(groupId, trainingId);
	}

	public static java.util.List<training.book.sb.model.Tutor> getTutors(
		long groupId, long trainingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTutors(groupId, trainingId, start, end);
	}

	public static java.util.List<training.book.sb.model.Tutor> getTutors(
		long groupId, long trainingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<training.book.sb.model.Tutor> obc) {
		return getService().getTutors(groupId, trainingId, start, end, obc);
	}

	/**
	* Returns all the tutors matching the UUID and company.
	*
	* @param uuid the UUID of the tutors
	* @param companyId the primary key of the company
	* @return the matching tutors, or an empty list if no matches were found
	*/
	public static java.util.List<training.book.sb.model.Tutor> getTutorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getTutorsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<training.book.sb.model.Tutor> getTutorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<training.book.sb.model.Tutor> orderByComparator) {
		return getService()
				   .getTutorsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static training.book.sb.model.Tutor addTutor(long userId,
		long trainingId, java.lang.String tutorName,
		java.lang.String tutorEmail,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addTutor(userId, trainingId, tutorName, tutorEmail,
			serviceContext);
	}

	/**
	* Adds the tutor to the database. Also notifies the appropriate model listeners.
	*
	* @param tutor the tutor
	* @return the tutor that was added
	*/
	public static training.book.sb.model.Tutor addTutor(
		training.book.sb.model.Tutor tutor) {
		return getService().addTutor(tutor);
	}

	/**
	* Creates a new tutor with the primary key. Does not add the tutor to the database.
	*
	* @param tutorId the primary key for the new tutor
	* @return the new tutor
	*/
	public static training.book.sb.model.Tutor createTutor(long tutorId) {
		return getService().createTutor(tutorId);
	}

	/**
	* Deletes the tutor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor that was removed
	* @throws PortalException if a tutor with the primary key could not be found
	*/
	public static training.book.sb.model.Tutor deleteTutor(long tutorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTutor(tutorId);
	}

	public static training.book.sb.model.Tutor deleteTutor(long tutorId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTutor(tutorId, serviceContext);
	}

	/**
	* Deletes the tutor from the database. Also notifies the appropriate model listeners.
	*
	* @param tutor the tutor
	* @return the tutor that was removed
	*/
	public static training.book.sb.model.Tutor deleteTutor(
		training.book.sb.model.Tutor tutor) {
		return getService().deleteTutor(tutor);
	}

	public static training.book.sb.model.Tutor fetchTutor(long tutorId) {
		return getService().fetchTutor(tutorId);
	}

	/**
	* Returns the tutor matching the UUID and group.
	*
	* @param uuid the tutor's UUID
	* @param groupId the primary key of the group
	* @return the matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static training.book.sb.model.Tutor fetchTutorByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchTutorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the tutor with the primary key.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor
	* @throws PortalException if a tutor with the primary key could not be found
	*/
	public static training.book.sb.model.Tutor getTutor(long tutorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTutor(tutorId);
	}

	/**
	* Returns the tutor matching the UUID and group.
	*
	* @param uuid the tutor's UUID
	* @param groupId the primary key of the group
	* @return the matching tutor
	* @throws PortalException if a matching tutor could not be found
	*/
	public static training.book.sb.model.Tutor getTutorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTutorByUuidAndGroupId(uuid, groupId);
	}

	public static training.book.sb.model.Tutor updateTutor(long userId,
		long trainingId, long tutorId, java.lang.String tutorName,
		java.lang.String tutorEmail,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTutor(userId, trainingId, tutorId, tutorName,
			tutorEmail, serviceContext);
	}

	/**
	* Updates the tutor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tutor the tutor
	* @return the tutor that was updated
	*/
	public static training.book.sb.model.Tutor updateTutor(
		training.book.sb.model.Tutor tutor) {
		return getService().updateTutor(tutor);
	}

	public static TutorLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TutorLocalService, TutorLocalService> _serviceTracker =
		ServiceTrackerFactory.open(TutorLocalService.class);
}