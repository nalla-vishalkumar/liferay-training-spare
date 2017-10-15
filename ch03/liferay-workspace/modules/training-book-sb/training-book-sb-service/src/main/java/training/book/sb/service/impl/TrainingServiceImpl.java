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

import training.book.sb.model.Training;
import training.book.sb.service.base.TrainingServiceBaseImpl;

/**
 * The implementation of the training remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link training.book.sb.service.TrainingService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see TrainingServiceBaseImpl
 * @see training.book.sb.service.TrainingServiceUtil
 */
public class TrainingServiceImpl extends TrainingServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link training.book.sb.service.TrainingServiceUtil} to access the training remote service.
	 */
    
    public List<Training> getTrainings(long groupId) {
        System.out.println("getTrainings -------------> called");
        return null;
    }
}