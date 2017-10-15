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

import training.book.sb.exception.NoSuchTrainingException;
import training.book.sb.model.Training;

/**
 * The persistence interface for the training service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see training.book.sb.service.persistence.impl.TrainingPersistenceImpl
 * @see TrainingUtil
 * @generated
 */
@ProviderType
public interface TrainingPersistence extends BasePersistence<Training> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TrainingUtil} to access the training persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the trainings where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching trainings
	*/
	public java.util.List<Training> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the trainings where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @return the range of matching trainings
	*/
	public java.util.List<Training> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the trainings where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainings
	*/
	public java.util.List<Training> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns an ordered range of all the trainings where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainings
	*/
	public java.util.List<Training> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first training in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching training
	* @throws NoSuchTrainingException if a matching training could not be found
	*/
	public Training findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Returns the first training in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching training, or <code>null</code> if a matching training could not be found
	*/
	public Training fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns the last training in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching training
	* @throws NoSuchTrainingException if a matching training could not be found
	*/
	public Training findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Returns the last training in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching training, or <code>null</code> if a matching training could not be found
	*/
	public Training fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns the trainings before and after the current training in the ordered set where uuid = &#63;.
	*
	* @param trainingId the primary key of the current training
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next training
	* @throws NoSuchTrainingException if a training with the primary key could not be found
	*/
	public Training[] findByUuid_PrevAndNext(long trainingId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Removes all the trainings where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of trainings where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching trainings
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the training where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTrainingException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching training
	* @throws NoSuchTrainingException if a matching training could not be found
	*/
	public Training findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTrainingException;

	/**
	* Returns the training where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching training, or <code>null</code> if a matching training could not be found
	*/
	public Training fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the training where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching training, or <code>null</code> if a matching training could not be found
	*/
	public Training fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the training where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the training that was removed
	*/
	public Training removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTrainingException;

	/**
	* Returns the number of trainings where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching trainings
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the trainings where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching trainings
	*/
	public java.util.List<Training> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the trainings where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @return the range of matching trainings
	*/
	public java.util.List<Training> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the trainings where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainings
	*/
	public java.util.List<Training> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns an ordered range of all the trainings where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainings
	*/
	public java.util.List<Training> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first training in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching training
	* @throws NoSuchTrainingException if a matching training could not be found
	*/
	public Training findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Returns the first training in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching training, or <code>null</code> if a matching training could not be found
	*/
	public Training fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns the last training in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching training
	* @throws NoSuchTrainingException if a matching training could not be found
	*/
	public Training findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Returns the last training in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching training, or <code>null</code> if a matching training could not be found
	*/
	public Training fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns the trainings before and after the current training in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param trainingId the primary key of the current training
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next training
	* @throws NoSuchTrainingException if a training with the primary key could not be found
	*/
	public Training[] findByUuid_C_PrevAndNext(long trainingId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Removes all the trainings where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of trainings where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching trainings
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the trainings where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching trainings
	*/
	public java.util.List<Training> findByGroupId(long groupId);

	/**
	* Returns a range of all the trainings where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @return the range of matching trainings
	*/
	public java.util.List<Training> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the trainings where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainings
	*/
	public java.util.List<Training> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns an ordered range of all the trainings where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainings
	*/
	public java.util.List<Training> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first training in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching training
	* @throws NoSuchTrainingException if a matching training could not be found
	*/
	public Training findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Returns the first training in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching training, or <code>null</code> if a matching training could not be found
	*/
	public Training fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns the last training in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching training
	* @throws NoSuchTrainingException if a matching training could not be found
	*/
	public Training findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Returns the last training in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching training, or <code>null</code> if a matching training could not be found
	*/
	public Training fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns the trainings before and after the current training in the ordered set where groupId = &#63;.
	*
	* @param trainingId the primary key of the current training
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next training
	* @throws NoSuchTrainingException if a training with the primary key could not be found
	*/
	public Training[] findByGroupId_PrevAndNext(long trainingId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator)
		throws NoSuchTrainingException;

	/**
	* Removes all the trainings where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of trainings where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching trainings
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the training in the entity cache if it is enabled.
	*
	* @param training the training
	*/
	public void cacheResult(Training training);

	/**
	* Caches the trainings in the entity cache if it is enabled.
	*
	* @param trainings the trainings
	*/
	public void cacheResult(java.util.List<Training> trainings);

	/**
	* Creates a new training with the primary key. Does not add the training to the database.
	*
	* @param trainingId the primary key for the new training
	* @return the new training
	*/
	public Training create(long trainingId);

	/**
	* Removes the training with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingId the primary key of the training
	* @return the training that was removed
	* @throws NoSuchTrainingException if a training with the primary key could not be found
	*/
	public Training remove(long trainingId) throws NoSuchTrainingException;

	public Training updateImpl(Training training);

	/**
	* Returns the training with the primary key or throws a {@link NoSuchTrainingException} if it could not be found.
	*
	* @param trainingId the primary key of the training
	* @return the training
	* @throws NoSuchTrainingException if a training with the primary key could not be found
	*/
	public Training findByPrimaryKey(long trainingId)
		throws NoSuchTrainingException;

	/**
	* Returns the training with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param trainingId the primary key of the training
	* @return the training, or <code>null</code> if a training with the primary key could not be found
	*/
	public Training fetchByPrimaryKey(long trainingId);

	@Override
	public java.util.Map<java.io.Serializable, Training> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the trainings.
	*
	* @return the trainings
	*/
	public java.util.List<Training> findAll();

	/**
	* Returns a range of all the trainings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @return the range of trainings
	*/
	public java.util.List<Training> findAll(int start, int end);

	/**
	* Returns an ordered range of all the trainings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainings
	*/
	public java.util.List<Training> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator);

	/**
	* Returns an ordered range of all the trainings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrainingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainings
	* @param end the upper bound of the range of trainings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainings
	*/
	public java.util.List<Training> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Training> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the trainings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of trainings.
	*
	* @return the number of trainings
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}