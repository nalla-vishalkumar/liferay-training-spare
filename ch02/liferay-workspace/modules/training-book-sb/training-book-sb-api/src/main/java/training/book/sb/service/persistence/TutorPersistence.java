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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import training.book.sb.exception.NoSuchTutorException;
import training.book.sb.model.Tutor;

/**
 * The persistence interface for the tutor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see training.book.sb.service.persistence.impl.TutorPersistenceImpl
 * @see TutorUtil
 * @generated
 */
@ProviderType
public interface TutorPersistence extends BasePersistence<Tutor> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TutorUtil} to access the tutor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tutors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tutors
	*/
	public java.util.List<Tutor> findByUuid(java.lang.String uuid);

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
	public java.util.List<Tutor> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Tutor> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

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
	public java.util.List<Tutor> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tutor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public Tutor findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Returns the first tutor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public Tutor fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

	/**
	* Returns the last tutor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public Tutor findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Returns the last tutor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public Tutor fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

	/**
	* Returns the tutors before and after the current tutor in the ordered set where uuid = &#63;.
	*
	* @param tutorId the primary key of the current tutor
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tutor
	* @throws NoSuchTutorException if a tutor with the primary key could not be found
	*/
	public Tutor[] findByUuid_PrevAndNext(long tutorId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Removes all the tutors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of tutors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tutors
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the tutor where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTutorException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public Tutor findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTutorException;

	/**
	* Returns the tutor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public Tutor fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the tutor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public Tutor fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the tutor where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the tutor that was removed
	*/
	public Tutor removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTutorException;

	/**
	* Returns the number of tutors where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching tutors
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the tutors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching tutors
	*/
	public java.util.List<Tutor> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Tutor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Tutor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

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
	public java.util.List<Tutor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public Tutor findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Returns the first tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public Tutor fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

	/**
	* Returns the last tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public Tutor findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Returns the last tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public Tutor fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

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
	public Tutor[] findByUuid_C_PrevAndNext(long tutorId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Removes all the tutors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of tutors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching tutors
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the tutors where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @return the matching tutors
	*/
	public java.util.List<Tutor> findByG_G(long groupId, long trainingId);

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
	public java.util.List<Tutor> findByG_G(long groupId, long trainingId,
		int start, int end);

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
	public java.util.List<Tutor> findByG_G(long groupId, long trainingId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

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
	public java.util.List<Tutor> findByG_G(long groupId, long trainingId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public Tutor findByG_G_First(long groupId, long trainingId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Returns the first tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public Tutor fetchByG_G_First(long groupId, long trainingId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

	/**
	* Returns the last tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor
	* @throws NoSuchTutorException if a matching tutor could not be found
	*/
	public Tutor findByG_G_Last(long groupId, long trainingId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Returns the last tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	*/
	public Tutor fetchByG_G_Last(long groupId, long trainingId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

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
	public Tutor[] findByG_G_PrevAndNext(long tutorId, long groupId,
		long trainingId,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException;

	/**
	* Removes all the tutors where groupId = &#63; and trainingId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	*/
	public void removeByG_G(long groupId, long trainingId);

	/**
	* Returns the number of tutors where groupId = &#63; and trainingId = &#63;.
	*
	* @param groupId the group ID
	* @param trainingId the training ID
	* @return the number of matching tutors
	*/
	public int countByG_G(long groupId, long trainingId);

	/**
	* Caches the tutor in the entity cache if it is enabled.
	*
	* @param tutor the tutor
	*/
	public void cacheResult(Tutor tutor);

	/**
	* Caches the tutors in the entity cache if it is enabled.
	*
	* @param tutors the tutors
	*/
	public void cacheResult(java.util.List<Tutor> tutors);

	/**
	* Creates a new tutor with the primary key. Does not add the tutor to the database.
	*
	* @param tutorId the primary key for the new tutor
	* @return the new tutor
	*/
	public Tutor create(long tutorId);

	/**
	* Removes the tutor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor that was removed
	* @throws NoSuchTutorException if a tutor with the primary key could not be found
	*/
	public Tutor remove(long tutorId) throws NoSuchTutorException;

	public Tutor updateImpl(Tutor tutor);

	/**
	* Returns the tutor with the primary key or throws a {@link NoSuchTutorException} if it could not be found.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor
	* @throws NoSuchTutorException if a tutor with the primary key could not be found
	*/
	public Tutor findByPrimaryKey(long tutorId) throws NoSuchTutorException;

	/**
	* Returns the tutor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tutorId the primary key of the tutor
	* @return the tutor, or <code>null</code> if a tutor with the primary key could not be found
	*/
	public Tutor fetchByPrimaryKey(long tutorId);

	@Override
	public java.util.Map<java.io.Serializable, Tutor> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tutors.
	*
	* @return the tutors
	*/
	public java.util.List<Tutor> findAll();

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
	public java.util.List<Tutor> findAll(int start, int end);

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
	public java.util.List<Tutor> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator);

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
	public java.util.List<Tutor> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tutor> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tutors from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tutors.
	*
	* @return the number of tutors
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}