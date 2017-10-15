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
 * Provides the remote service utility for Training. This utility wraps
 * {@link training.book.sb.service.impl.TrainingServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Vishal Kumar Nalla
 * @see TrainingService
 * @see training.book.sb.service.base.TrainingServiceBaseImpl
 * @see training.book.sb.service.impl.TrainingServiceImpl
 * @generated
 */
@ProviderType
public class TrainingServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link training.book.sb.service.impl.TrainingServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<training.book.sb.model.Training> getTrainings(
		long groupId) {
		return getService().getTrainings(groupId);
	}

	public static TrainingService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TrainingService, TrainingService> _serviceTracker =
		ServiceTrackerFactory.open(TrainingService.class);
}