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

package training.book.sb.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import training.book.sb.model.Tutor;

import java.util.List;

/**
 * The persistence utility for the tutor service. This utility wraps {@link training.book.sb.service.persistence.impl.TutorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see TutorPersistence
 * @see training.book.sb.service.persistence.impl.TutorPersistenceImpl
 * @generated
 */
@ProviderType
public class TutorUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Tutor tutor) {
		getPersistence().clearCache(tutor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Tutor> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tutor> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tutor> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Tutor> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Tutor update(Tutor tutor) {
		return getPersistence().update(tutor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Tutor update(Tutor tutor, ServiceContext serviceContext) {
		return getPersistence().update(tutor, serviceContext);
	}

	/**
	* Returns all the tutors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tutors
	*/
	public static List<Tutor> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the tutors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @return the range of matching tutors
	*/
	public static List<Tutor> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the tutors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tutors
	*/
	public static List<Tutor> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Tutor> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tutors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tutors
	*/
	public static List<Tutor> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Tutor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first tutor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public static Tutor findByUuid_First(java.lang.String uuid,
		OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first tutor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static Tutor fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Tutor> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last tutor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public static Tutor findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last tutor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static Tutor fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Tutor> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the tutors before and after the current tutor in the ordered set where uuid = &#63;.
	*
	* @param tutorId the primary key of the current tutor
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tutor
	* @throws NoSuchTutorException if a tutor with the primary key could not be found
	*/
	public static Tutor[] findByUuid_PrevAndNext(long tutorId,
		java.lang.String uuid, OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence()
				   .findByUuid_PrevAndNext(tutorId, uuid, orderByComparator);
	}

	/**
	* Removes all the tutors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of tutors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tutors
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the tutor where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTutorException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public static Tutor findByUUID_G(java.lang.String uuid, long groupId)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the tutor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static Tutor fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the tutor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static Tutor fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the tutor where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the tutor that was removed
	*/
	public static Tutor removeByUUID_G(java.lang.String uuid, long groupId)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of tutors where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching tutors
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the tutors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching tutors
	*/
	public static List<Tutor> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the tutors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @return the range of matching tutors
	*/
	public static List<Tutor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the tutors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tutors
	*/
	public static List<Tutor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Tutor> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tutors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tutors
	*/
	public static List<Tutor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Tutor> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public static Tutor findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static Tutor fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Tutor> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public static Tutor findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static Tutor fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Tutor> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the tutors before and after the current tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param tutorId the primary key of the current tutor
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tutor
	* @throws NoSuchTutorException if a tutor with the primary key could not be found
	*/
	public static Tutor[] findByUuid_C_PrevAndNext(long tutorId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(tutorId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the tutors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of tutors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching tutors
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the tutors where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @return the matching tutors
	*/
	public static List<Tutor> findByG_G(long groupId, long trainingId) {
		return getPersistence().findByG_G(groupId, trainingId);
	}

	/**
	* Returns a range of all the tutors where groupId = &#63; and trainingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @return the range of matching tutors
	*/
	public static List<Tutor> findByG_G(long groupId, long trainingId,
		int start, int end) {
		return getPersistence().findByG_G(groupId, trainingId, start, end);
	}

	/**
	* Returns an ordered range of all the tutors where groupId = &#63; and trainingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tutors
	*/
	public static List<Tutor> findByG_G(long groupId, long trainingId,
		int start, int end, OrderByComparator<Tutor> orderByComparator) {
		return getPersistence()
				   .findByG_G(groupId, trainingId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tutors where groupId = &#63; and trainingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tutors
	*/
	public static List<Tutor> findByG_G(long groupId, long trainingId,
		int start, int end, OrderByComparator<Tutor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_G(groupId, trainingId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public static Tutor findByG_G_First(long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence()
				   .findByG_G_First(groupId, trainingId, orderByComparator);
	}

	/**
	* Returns the first tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static Tutor fetchByG_G_First(long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator) {
		return getPersistence()
				   .fetchByG_G_First(groupId, trainingId, orderByComparator);
	}

	/**
	* Returns the last tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public static Tutor findByG_G_Last(long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence()
				   .findByG_G_Last(groupId, trainingId, orderByComparator);
	}

	/**
	* Returns the last tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public static Tutor fetchByG_G_Last(long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator) {
		return getPersistence()
				   .fetchByG_G_Last(groupId, trainingId, orderByComparator);
	}

	/**
	* Returns the tutors before and after the current tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param tutorId the primary key of the current tutor
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tutor
	* @throws NoSuchTutorException if a tutor with the primary key could not be found
	*/
	public static Tutor[] findByG_G_PrevAndNext(long tutorId, long groupId,
		long trainingId, OrderByComparator<Tutor> orderByComparator)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence()
				   .findByG_G_PrevAndNext(tutorId, groupId, trainingId,
			orderByComparator);
	}

	/**
	* Removes all the tutors where groupId = &#63; and trainingId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	*/
	public static void removeByG_G(long groupId, long trainingId) {
		getPersistence().removeByG_G(groupId, trainingId);
	}

	/**
	* Returns the number of tutors where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @return the number of matching tutors
	*/
	public static int countByG_G(long groupId, long trainingId) {
		return getPersistence().countByG_G(groupId, trainingId);
	}

	/**
	* Caches the tutor in the entity cache if it is enabled.
	*
	* @param tutor the tutor
	*/
	public static void cacheResult(Tutor tutor) {
		getPersistence().cacheResult(tutor);
	}

	/**
	* Caches the tutors in the entity cache if it is enabled.
	*
	* @param tutors the tutors
	*/
	public static void cacheResult(List<Tutor> tutors) {
		getPersistence().cacheResult(tutors);
	}

	/**
	* Creates a new tutor with the primary key. Does not add the tutor to the database.
	*
	* @param tutorId the primary key for the new tutor
	* @return the new tutor
	*/
	public static Tutor create(long tutorId) {
		return getPersistence().create(tutorId);
	}

	/**
	* Removes the tutor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor that was removed
	* @throws NoSuchTutorException if a tutor with the primary key could not be found
	*/
	public static Tutor remove(long tutorId)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence().remove(tutorId);
	}

	public static Tutor updateImpl(Tutor tutor) {
		return getPersistence().updateImpl(tutor);
	}

	/**
	* Returns the tutor with the primary key or throws a {@link NoSuchTutorException} if it could not be found.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor
	* @throws NoSuchTutorException if a tutor with the primary key could not be found
	*/
	public static Tutor findByPrimaryKey(long tutorId)
		throws training.book.sb.exception.NoSuchTutorException {
		return getPersistence().findByPrimaryKey(tutorId);
	}

	/**
	* Returns the tutor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor, or <code>null</code> if a tutor with the primary key could not be found
	*/
	public static Tutor fetchByPrimaryKey(long tutorId) {
		return getPersistence().fetchByPrimaryKey(tutorId);
	}

	public static java.util.Map<java.io.Serializable, Tutor> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tutors.
	*
	* @return the tutors
	*/
	public static List<Tutor> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tutors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @return the range of tutors
	*/
	public static List<Tutor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tutors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tutors
	*/
	public static List<Tutor> findAll(int start, int end,
		OrderByComparator<Tutor> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tutors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TutorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tutors
	* @param end the upper bound of the range of tutors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tutors
	*/
	public static List<Tutor> findAll(int start, int end,
		OrderByComparator<Tutor> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tutors from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tutors.
	*
	* @return the number of tutors
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TutorPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TutorPersistence, TutorPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TutorPersistence.class);
}