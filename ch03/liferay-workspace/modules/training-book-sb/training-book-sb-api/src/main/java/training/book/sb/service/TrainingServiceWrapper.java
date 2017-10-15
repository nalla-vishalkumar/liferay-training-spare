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
 * Provides a wrapper for {@link TrainingService}.
 *
 * @author Vishal Kumar Nalla
 * @see TrainingService
 * @generated
 */
@ProviderType
public class TrainingServiceWrapper implements TrainingService,
	ServiceWrapper<TrainingService> {
	public TrainingServiceWrapper(TrainingService trainingService) {
		_trainingService = trainingService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _trainingService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<training.book.sb.model.Training> getTrainings(
		long groupId) {
		return _trainingService.getTrainings(groupId);
	}

	@Override
	public TrainingService getWrappedService() {
		return _trainingService;
	}

	@Override
	public void setWrappedService(TrainingService trainingService) {
		_trainingService = trainingService;
	}

	private TrainingService _trainingService;
}