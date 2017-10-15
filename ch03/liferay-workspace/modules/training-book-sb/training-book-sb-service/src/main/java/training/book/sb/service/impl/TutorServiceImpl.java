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

package training.book.sb.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import training.book.sb.model.Tutor;
import training.book.sb.service.base.TutorServiceBaseImpl;

/**
 * The implementation of the tutor remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link training.book.sb.service.TutorService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see TutorServiceBaseImpl
 * @see training.book.sb.service.TutorServiceUtil
 */
public class TutorServiceImpl extends TutorServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link training.book.sb.service.TutorServiceUtil} to access the tutor remote service.
	 */
    
    public List<Tutor> getTutors(long groupId, long trainingId)
            throws SystemException {
        return tutorLocalService.getTutors(groupId, trainingId);
    }
}