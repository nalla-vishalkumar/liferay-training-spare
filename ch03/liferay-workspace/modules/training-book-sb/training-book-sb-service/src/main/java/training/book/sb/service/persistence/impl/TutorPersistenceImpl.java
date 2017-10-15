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

package training.book.sb.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import training.book.sb.exception.NoSuchTutorException;
import training.book.sb.model.Tutor;
import training.book.sb.model.impl.TutorImpl;
import training.book.sb.model.impl.TutorModelImpl;
import training.book.sb.service.persistence.TutorPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the tutor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see TutorPersistence
 * @see training.book.sb.service.persistence.TutorUtil
 * @generated
 */
@ProviderType
public class TutorPersistenceImpl extends BasePersistenceImpl<Tutor>
	implements TutorPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TutorUtil} to access the tutor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TutorImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TutorModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tutors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tutors
	 */
	@Override
	public List<Tutor> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Tutor> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Tutor> findByUuid(String uuid, int start, int end,
		OrderByComparator<Tutor> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Tutor> findByUuid(String uuid, int start, int end,
		OrderByComparator<Tutor> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Tutor> list = null;

		if (retrieveFromCache) {
			list = (List<Tutor>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Tutor tutor : list) {
					if (!Objects.equals(uuid, tutor.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TUTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TutorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Tutor>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Tutor>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first tutor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tutor
	 * @throws NoSuchTutorException if a matching tutor could not be found
	 */
	@Override
	public Tutor findByUuid_First(String uuid,
		OrderByComparator<Tutor> orderByComparator) throws NoSuchTutorException {
		Tutor tutor = fetchByUuid_First(uuid, orderByComparator);

		if (tutor != null) {
			return tutor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTutorException(msg.toString());
	}

	/**
	 * Returns the first tutor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	 */
	@Override
	public Tutor fetchByUuid_First(String uuid,
		OrderByComparator<Tutor> orderByComparator) {
		List<Tutor> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tutor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tutor
	 * @throws NoSuchTutorException if a matching tutor could not be found
	 */
	@Override
	public Tutor findByUuid_Last(String uuid,
		OrderByComparator<Tutor> orderByComparator) throws NoSuchTutorException {
		Tutor tutor = fetchByUuid_Last(uuid, orderByComparator);

		if (tutor != null) {
			return tutor;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTutorException(msg.toString());
	}

	/**
	 * Returns the last tutor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	 */
	@Override
	public Tutor fetchByUuid_Last(String uuid,
		OrderByComparator<Tutor> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Tutor> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Tutor[] findByUuid_PrevAndNext(long tutorId, String uuid,
		OrderByComparator<Tutor> orderByComparator) throws NoSuchTutorException {
		Tutor tutor = findByPrimaryKey(tutorId);

		Session session = null;

		try {
			session = openSession();

			Tutor[] array = new TutorImpl[3];

			array[0] = getByUuid_PrevAndNext(session, tutor, uuid,
					orderByComparator, true);

			array[1] = tutor;

			array[2] = getByUuid_PrevAndNext(session, tutor, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tutor getByUuid_PrevAndNext(Session session, Tutor tutor,
		String uuid, OrderByComparator<Tutor> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TUTOR_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TutorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tutor);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tutor> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tutors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Tutor tutor : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tutor);
		}
	}

	/**
	 * Returns the number of tutors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tutors
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TUTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "tutor.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "tutor.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(tutor.uuid IS NULL OR tutor.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			TutorModelImpl.UUID_COLUMN_BITMASK |
			TutorModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the tutor where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTutorException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tutor
	 * @throws NoSuchTutorException if a matching tutor could not be found
	 */
	@Override
	public Tutor findByUUID_G(String uuid, long groupId)
		throws NoSuchTutorException {
		Tutor tutor = fetchByUUID_G(uuid, groupId);

		if (tutor == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTutorException(msg.toString());
		}

		return tutor;
	}

	/**
	 * Returns the tutor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tutor, or <code>null</code> if a matching tutor could not be found
	 */
	@Override
	public Tutor fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the tutor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching tutor, or <code>null</code> if a matching tutor could not be found
	 */
	@Override
	public Tutor fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Tutor) {
			Tutor tutor = (Tutor)result;

			if (!Objects.equals(uuid, tutor.getUuid()) ||
					(groupId != tutor.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TUTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Tutor> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Tutor tutor = list.get(0);

					result = tutor;

					cacheResult(tutor);

					if ((tutor.getUuid() == null) ||
							!tutor.getUuid().equals(uuid) ||
							(tutor.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, tutor);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Tutor)result;
		}
	}

	/**
	 * Removes the tutor where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the tutor that was removed
	 */
	@Override
	public Tutor removeByUUID_G(String uuid, long groupId)
		throws NoSuchTutorException {
		Tutor tutor = findByUUID_G(uuid, groupId);

		return remove(tutor);
	}

	/**
	 * Returns the number of tutors where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tutors
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TUTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "tutor.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "tutor.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(tutor.uuid IS NULL OR tutor.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "tutor.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			TutorModelImpl.UUID_COLUMN_BITMASK |
			TutorModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tutors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tutors
	 */
	@Override
	public List<Tutor> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Tutor> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Tutor> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Tutor> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Tutor> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Tutor> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Tutor> list = null;

		if (retrieveFromCache) {
			list = (List<Tutor>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Tutor tutor : list) {
					if (!Objects.equals(uuid, tutor.getUuid()) ||
							(companyId != tutor.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TUTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TutorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Tutor>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Tutor>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Tutor findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Tutor> orderByComparator) throws NoSuchTutorException {
		Tutor tutor = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (tutor != null) {
			return tutor;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTutorException(msg.toString());
	}

	/**
	 * Returns the first tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	 */
	@Override
	public Tutor fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Tutor> orderByComparator) {
		List<Tutor> list = findByUuid_C(uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Tutor findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Tutor> orderByComparator) throws NoSuchTutorException {
		Tutor tutor = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (tutor != null) {
			return tutor;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTutorException(msg.toString());
	}

	/**
	 * Returns the last tutor in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	 */
	@Override
	public Tutor fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Tutor> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Tutor> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Tutor[] findByUuid_C_PrevAndNext(long tutorId, String uuid,
		long companyId, OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException {
		Tutor tutor = findByPrimaryKey(tutorId);

		Session session = null;

		try {
			session = openSession();

			Tutor[] array = new TutorImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, tutor, uuid, companyId,
					orderByComparator, true);

			array[1] = tutor;

			array[2] = getByUuid_C_PrevAndNext(session, tutor, uuid, companyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tutor getByUuid_C_PrevAndNext(Session session, Tutor tutor,
		String uuid, long companyId,
		OrderByComparator<Tutor> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_TUTOR_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TutorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tutor);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tutor> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tutors where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Tutor tutor : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tutor);
		}
	}

	/**
	 * Returns the number of tutors where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tutors
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TUTOR_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "tutor.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "tutor.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(tutor.uuid IS NULL OR tutor.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "tutor.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_G = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, TutorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			TutorModelImpl.GROUPID_COLUMN_BITMASK |
			TutorModelImpl.TRAININGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_G = new FinderPath(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tutors where groupId = &#63; and trainingId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param trainingId the training ID
	 * @return the matching tutors
	 */
	@Override
	public List<Tutor> findByG_G(long groupId, long trainingId) {
		return findByG_G(groupId, trainingId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Tutor> findByG_G(long groupId, long trainingId, int start,
		int end) {
		return findByG_G(groupId, trainingId, start, end, null);
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
	@Override
	public List<Tutor> findByG_G(long groupId, long trainingId, int start,
		int end, OrderByComparator<Tutor> orderByComparator) {
		return findByG_G(groupId, trainingId, start, end, orderByComparator,
			true);
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
	@Override
	public List<Tutor> findByG_G(long groupId, long trainingId, int start,
		int end, OrderByComparator<Tutor> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G;
			finderArgs = new Object[] { groupId, trainingId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_G;
			finderArgs = new Object[] {
					groupId, trainingId,
					
					start, end, orderByComparator
				};
		}

		List<Tutor> list = null;

		if (retrieveFromCache) {
			list = (List<Tutor>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Tutor tutor : list) {
					if ((groupId != tutor.getGroupId()) ||
							(trainingId != tutor.getTrainingId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TUTOR_WHERE);

			query.append(_FINDER_COLUMN_G_G_GROUPID_2);

			query.append(_FINDER_COLUMN_G_G_TRAININGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TutorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(trainingId);

				if (!pagination) {
					list = (List<Tutor>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Tutor>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Tutor findByG_G_First(long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator) throws NoSuchTutorException {
		Tutor tutor = fetchByG_G_First(groupId, trainingId, orderByComparator);

		if (tutor != null) {
			return tutor;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", trainingId=");
		msg.append(trainingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTutorException(msg.toString());
	}

	/**
	 * Returns the first tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param trainingId the training ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tutor, or <code>null</code> if a matching tutor could not be found
	 */
	@Override
	public Tutor fetchByG_G_First(long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator) {
		List<Tutor> list = findByG_G(groupId, trainingId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Tutor findByG_G_Last(long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator) throws NoSuchTutorException {
		Tutor tutor = fetchByG_G_Last(groupId, trainingId, orderByComparator);

		if (tutor != null) {
			return tutor;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", trainingId=");
		msg.append(trainingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTutorException(msg.toString());
	}

	/**
	 * Returns the last tutor in the ordered set where groupId = &#63; and trainingId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param trainingId the training ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tutor, or <code>null</code> if a matching tutor could not be found
	 */
	@Override
	public Tutor fetchByG_G_Last(long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator) {
		int count = countByG_G(groupId, trainingId);

		if (count == 0) {
			return null;
		}

		List<Tutor> list = findByG_G(groupId, trainingId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Tutor[] findByG_G_PrevAndNext(long tutorId, long groupId,
		long trainingId, OrderByComparator<Tutor> orderByComparator)
		throws NoSuchTutorException {
		Tutor tutor = findByPrimaryKey(tutorId);

		Session session = null;

		try {
			session = openSession();

			Tutor[] array = new TutorImpl[3];

			array[0] = getByG_G_PrevAndNext(session, tutor, groupId,
					trainingId, orderByComparator, true);

			array[1] = tutor;

			array[2] = getByG_G_PrevAndNext(session, tutor, groupId,
					trainingId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tutor getByG_G_PrevAndNext(Session session, Tutor tutor,
		long groupId, long trainingId,
		OrderByComparator<Tutor> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_TUTOR_WHERE);

		query.append(_FINDER_COLUMN_G_G_GROUPID_2);

		query.append(_FINDER_COLUMN_G_G_TRAININGID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TutorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(trainingId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tutor);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tutor> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tutors where groupId = &#63; and trainingId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param trainingId the training ID
	 */
	@Override
	public void removeByG_G(long groupId, long trainingId) {
		for (Tutor tutor : findByG_G(groupId, trainingId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tutor);
		}
	}

	/**
	 * Returns the number of tutors where groupId = &#63; and trainingId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param trainingId the training ID
	 * @return the number of matching tutors
	 */
	@Override
	public int countByG_G(long groupId, long trainingId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_G;

		Object[] finderArgs = new Object[] { groupId, trainingId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TUTOR_WHERE);

			query.append(_FINDER_COLUMN_G_G_GROUPID_2);

			query.append(_FINDER_COLUMN_G_G_TRAININGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(trainingId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_G_GROUPID_2 = "tutor.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_G_TRAININGID_2 = "tutor.trainingId = ?";

	public TutorPersistenceImpl() {
		setModelClass(Tutor.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the tutor in the entity cache if it is enabled.
	 *
	 * @param tutor the tutor
	 */
	@Override
	public void cacheResult(Tutor tutor) {
		entityCache.putResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorImpl.class, tutor.getPrimaryKey(), tutor);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { tutor.getUuid(), tutor.getGroupId() }, tutor);

		tutor.resetOriginalValues();
	}

	/**
	 * Caches the tutors in the entity cache if it is enabled.
	 *
	 * @param tutors the tutors
	 */
	@Override
	public void cacheResult(List<Tutor> tutors) {
		for (Tutor tutor : tutors) {
			if (entityCache.getResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
						TutorImpl.class, tutor.getPrimaryKey()) == null) {
				cacheResult(tutor);
			}
			else {
				tutor.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tutors.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TutorImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tutor.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Tutor tutor) {
		entityCache.removeResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorImpl.class, tutor.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TutorModelImpl)tutor, true);
	}

	@Override
	public void clearCache(List<Tutor> tutors) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Tutor tutor : tutors) {
			entityCache.removeResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
				TutorImpl.class, tutor.getPrimaryKey());

			clearUniqueFindersCache((TutorModelImpl)tutor, true);
		}
	}

	protected void cacheUniqueFindersCache(TutorModelImpl tutorModelImpl) {
		Object[] args = new Object[] {
				tutorModelImpl.getUuid(), tutorModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			tutorModelImpl, false);
	}

	protected void clearUniqueFindersCache(TutorModelImpl tutorModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					tutorModelImpl.getUuid(), tutorModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((tutorModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					tutorModelImpl.getOriginalUuid(),
					tutorModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new tutor with the primary key. Does not add the tutor to the database.
	 *
	 * @param tutorId the primary key for the new tutor
	 * @return the new tutor
	 */
	@Override
	public Tutor create(long tutorId) {
		Tutor tutor = new TutorImpl();

		tutor.setNew(true);
		tutor.setPrimaryKey(tutorId);

		String uuid = PortalUUIDUtil.generate();

		tutor.setUuid(uuid);

		tutor.setCompanyId(companyProvider.getCompanyId());

		return tutor;
	}

	/**
	 * Removes the tutor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tutorId the primary key of the tutor
	 * @return the tutor that was removed
	 * @throws NoSuchTutorException if a tutor with the primary key could not be found
	 */
	@Override
	public Tutor remove(long tutorId) throws NoSuchTutorException {
		return remove((Serializable)tutorId);
	}

	/**
	 * Removes the tutor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tutor
	 * @return the tutor that was removed
	 * @throws NoSuchTutorException if a tutor with the primary key could not be found
	 */
	@Override
	public Tutor remove(Serializable primaryKey) throws NoSuchTutorException {
		Session session = null;

		try {
			session = openSession();

			Tutor tutor = (Tutor)session.get(TutorImpl.class, primaryKey);

			if (tutor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTutorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tutor);
		}
		catch (NoSuchTutorException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Tutor removeImpl(Tutor tutor) {
		tutor = toUnwrappedModel(tutor);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tutor)) {
				tutor = (Tutor)session.get(TutorImpl.class,
						tutor.getPrimaryKeyObj());
			}

			if (tutor != null) {
				session.delete(tutor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tutor != null) {
			clearCache(tutor);
		}

		return tutor;
	}

	@Override
	public Tutor updateImpl(Tutor tutor) {
		tutor = toUnwrappedModel(tutor);

		boolean isNew = tutor.isNew();

		TutorModelImpl tutorModelImpl = (TutorModelImpl)tutor;

		if (Validator.isNull(tutor.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			tutor.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (tutor.getCreateDate() == null)) {
			if (serviceContext == null) {
				tutor.setCreateDate(now);
			}
			else {
				tutor.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!tutorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tutor.setModifiedDate(now);
			}
			else {
				tutor.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (tutor.isNew()) {
				session.save(tutor);

				tutor.setNew(false);
			}
			else {
				tutor = (Tutor)session.merge(tutor);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!TutorModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { tutorModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					tutorModelImpl.getUuid(), tutorModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] {
					tutorModelImpl.getGroupId(), tutorModelImpl.getTrainingId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((tutorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tutorModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { tutorModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((tutorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tutorModelImpl.getOriginalUuid(),
						tutorModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						tutorModelImpl.getUuid(), tutorModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((tutorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tutorModelImpl.getOriginalGroupId(),
						tutorModelImpl.getOriginalTrainingId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
					args);

				args = new Object[] {
						tutorModelImpl.getGroupId(),
						tutorModelImpl.getTrainingId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
					args);
			}
		}

		entityCache.putResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
			TutorImpl.class, tutor.getPrimaryKey(), tutor, false);

		clearUniqueFindersCache(tutorModelImpl, false);
		cacheUniqueFindersCache(tutorModelImpl);

		tutor.resetOriginalValues();

		return tutor;
	}

	protected Tutor toUnwrappedModel(Tutor tutor) {
		if (tutor instanceof TutorImpl) {
			return tutor;
		}

		TutorImpl tutorImpl = new TutorImpl();

		tutorImpl.setNew(tutor.isNew());
		tutorImpl.setPrimaryKey(tutor.getPrimaryKey());

		tutorImpl.setUuid(tutor.getUuid());
		tutorImpl.setTutorId(tutor.getTutorId());
		tutorImpl.setGroupId(tutor.getGroupId());
		tutorImpl.setCompanyId(tutor.getCompanyId());
		tutorImpl.setUserId(tutor.getUserId());
		tutorImpl.setUserName(tutor.getUserName());
		tutorImpl.setCreateDate(tutor.getCreateDate());
		tutorImpl.setModifiedDate(tutor.getModifiedDate());
		tutorImpl.setTutorName(tutor.getTutorName());
		tutorImpl.setTutorEmail(tutor.getTutorEmail());
		tutorImpl.setTrainingId(tutor.getTrainingId());

		return tutorImpl;
	}

	/**
	 * Returns the tutor with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tutor
	 * @return the tutor
	 * @throws NoSuchTutorException if a tutor with the primary key could not be found
	 */
	@Override
	public Tutor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTutorException {
		Tutor tutor = fetchByPrimaryKey(primaryKey);

		if (tutor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTutorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tutor;
	}

	/**
	 * Returns the tutor with the primary key or throws a {@link NoSuchTutorException} if it could not be found.
	 *
	 * @param tutorId the primary key of the tutor
	 * @return the tutor
	 * @throws NoSuchTutorException if a tutor with the primary key could not be found
	 */
	@Override
	public Tutor findByPrimaryKey(long tutorId) throws NoSuchTutorException {
		return findByPrimaryKey((Serializable)tutorId);
	}

	/**
	 * Returns the tutor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tutor
	 * @return the tutor, or <code>null</code> if a tutor with the primary key could not be found
	 */
	@Override
	public Tutor fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
				TutorImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Tutor tutor = (Tutor)serializable;

		if (tutor == null) {
			Session session = null;

			try {
				session = openSession();

				tutor = (Tutor)session.get(TutorImpl.class, primaryKey);

				if (tutor != null) {
					cacheResult(tutor);
				}
				else {
					entityCache.putResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
						TutorImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
					TutorImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tutor;
	}

	/**
	 * Returns the tutor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tutorId the primary key of the tutor
	 * @return the tutor, or <code>null</code> if a tutor with the primary key could not be found
	 */
	@Override
	public Tutor fetchByPrimaryKey(long tutorId) {
		return fetchByPrimaryKey((Serializable)tutorId);
	}

	@Override
	public Map<Serializable, Tutor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Tutor> map = new HashMap<Serializable, Tutor>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Tutor tutor = fetchByPrimaryKey(primaryKey);

			if (tutor != null) {
				map.put(primaryKey, tutor);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
					TutorImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Tutor)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TUTOR_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Tutor tutor : (List<Tutor>)q.list()) {
				map.put(tutor.getPrimaryKeyObj(), tutor);

				cacheResult(tutor);

				uncachedPrimaryKeys.remove(tutor.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TutorModelImpl.ENTITY_CACHE_ENABLED,
					TutorImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the tutors.
	 *
	 * @return the tutors
	 */
	@Override
	public List<Tutor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Tutor> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Tutor> findAll(int start, int end,
		OrderByComparator<Tutor> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Tutor> findAll(int start, int end,
		OrderByComparator<Tutor> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Tutor> list = null;

		if (retrieveFromCache) {
			list = (List<Tutor>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TUTOR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TUTOR;

				if (pagination) {
					sql = sql.concat(TutorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Tutor>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Tutor>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the tutors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Tutor tutor : findAll()) {
			remove(tutor);
		}
	}

	/**
	 * Returns the number of tutors.
	 *
	 * @return the number of tutors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TUTOR);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TutorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tutor persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TutorImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TUTOR = "SELECT tutor FROM Tutor tutor";
	private static final String _SQL_SELECT_TUTOR_WHERE_PKS_IN = "SELECT tutor FROM Tutor tutor WHERE tutorId IN (";
	private static final String _SQL_SELECT_TUTOR_WHERE = "SELECT tutor FROM Tutor tutor WHERE ";
	private static final String _SQL_COUNT_TUTOR = "SELECT COUNT(tutor) FROM Tutor tutor";
	private static final String _SQL_COUNT_TUTOR_WHERE = "SELECT COUNT(tutor) FROM Tutor tutor WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tutor.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tutor exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Tutor exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TutorPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}