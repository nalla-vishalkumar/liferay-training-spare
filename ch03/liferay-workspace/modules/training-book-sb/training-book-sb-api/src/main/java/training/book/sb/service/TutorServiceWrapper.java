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
 * Provides a wrapper for {@link TutorService}.
 *
 * @author Vishal Kumar Nalla
 * @see TutorService
 * @generated
 */
@ProviderType
public class TutorServiceWrapper implements TutorService,
	ServiceWrapper<TutorService> {
	public TutorServiceWrapper(TutorService tutorService) {
		_tutorService = tutorService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tutorService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<training.book.sb.model.Tutor> getTutors(
		long groupId, long trainingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tutorService.getTutors(groupId, trainingId);
	}

	@Override
	public TutorService getWrappedService() {
		return _tutorService;
	}

	@Override
	public void setWrappedService(TutorService tutorService) {
		_tutorService = tutorService;
	}

	private TutorService _tutorService;
}