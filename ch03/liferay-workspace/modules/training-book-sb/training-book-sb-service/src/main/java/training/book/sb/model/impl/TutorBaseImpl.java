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

package training.book.sb.model.impl;

import aQute.bnd.annotation.ProviderType;

import training.book.sb.model.Tutor;
import training.book.sb.service.TutorLocalServiceUtil;

/**
 * The extended model base implementation for the Tutor service. Represents a row in the &quot;TB_Tutor&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TutorImpl}.
 * </p>
 *
 * @author Vishal Kumar Nalla
 * @see TutorImpl
 * @see Tutor
 * @generated
 */
@ProviderType
public abstract class TutorBaseImpl extends TutorModelImpl implements Tutor {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tutor model instance should use the {@link Tutor} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TutorLocalServiceUtil.addTutor(this);
		}
		else {
			TutorLocalServiceUtil.updateTutor(this);
		}
	}
}