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

package training.book.sb.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Training service. Represents a row in the &quot;TB_Training&quot; database table, with each column mapped to a property of this class.
 *
 * @author Vishal Kumar Nalla
 * @see TrainingModel
 * @see training.book.sb.model.impl.TrainingImpl
 * @see training.book.sb.model.impl.TrainingModelImpl
 * @generated
 */
@ImplementationClassName("training.book.sb.model.impl.TrainingImpl")
@ProviderType
public interface Training extends TrainingModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link training.book.sb.model.impl.TrainingImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Training, Long> TRAINING_ID_ACCESSOR = new Accessor<Training, Long>() {
			@Override
			public Long get(Training training) {
				return training.getTrainingId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Training> getTypeClass() {
				return Training.class;
			}
		};
}