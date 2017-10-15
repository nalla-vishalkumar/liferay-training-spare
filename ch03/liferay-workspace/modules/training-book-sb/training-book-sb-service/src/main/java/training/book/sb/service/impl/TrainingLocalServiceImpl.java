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

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import training.book.sb.exception.TrainingNameException;
import training.book.sb.model.Training;
import training.book.sb.service.base.TrainingLocalServiceBaseImpl;

/**
 * The implementation of the training local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link training.book.sb.service.TrainingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see TrainingLocalServiceBaseImpl
 * @see training.book.sb.service.TrainingLocalServiceUtil
 */
public class TrainingLocalServiceImpl extends TrainingLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Always use {@link
     * training.book.sb.service.TrainingLocalServiceUtil} to access the training
     * local service.
     */

    public List<Training> getTrainings(long groupId) throws SystemException {
        return trainingPersistence.findByGroupId(groupId);
    }
    
    public List<Training> getTrainings(long groupId, int start, int end, 
            OrderByComparator<Training> obc) {

            return trainingPersistence.findByGroupId(groupId, start, end, obc);
        }    

    public List<Training> getTrainings(long groupId, int start, int end)
            throws SystemException {
        return trainingPersistence.findByGroupId(groupId, start, end);
    }

    protected void validate(String trainingName) throws PortalException {
        if (Validator.isNull(trainingName)) {
            throw new TrainingNameException();
        }
    }
    
    public int getTrainingsCount(long groupId) {
        return trainingPersistence.countByGroupId(groupId);
    }

    public Training addTraining(long userId, String trainingName,
            String trainingDescription, ServiceContext serviceContext)
            throws SystemException, PortalException {
        long groupId = serviceContext.getScopeGroupId();

        User user = userPersistence.findByPrimaryKey(userId);

        Date now = new Date();

        validate(trainingName);

        long guestbookId = counterLocalService.increment();

        Training training = trainingPersistence.create(guestbookId);

        training.setUuid(serviceContext.getUuid());
        training.setUserId(userId);
        training.setGroupId(groupId);
        training.setCompanyId(user.getCompanyId());
        training.setUserName(user.getFullName());
        training.setCreateDate(serviceContext.getCreateDate(now));
        training.setModifiedDate(serviceContext.getModifiedDate(now));
        training.setTrainingName(trainingName);
        training.setTrainingDescription(trainingDescription);
        training.setExpandoBridgeAttributes(serviceContext);

        trainingPersistence.update(training);

        return training;
    }
}