/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.wsrp.service;

import com.liferay.portal.kernel.util.BooleanWrapper;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.LongWrapper;
import com.liferay.portal.kernel.util.NullWrapper;

/**
 * <a href="WSRPConsumerRegistrationLocalServiceClp.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class WSRPConsumerRegistrationLocalServiceClp
	implements WSRPConsumerRegistrationLocalService {
	public WSRPConsumerRegistrationLocalServiceClp(
		ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.liferay.wsrp.model.WSRPConsumerRegistration addWSRPConsumerRegistration(
		com.liferay.wsrp.model.WSRPConsumerRegistration wsrpConsumerRegistration)
		throws com.liferay.portal.SystemException {
		Object paramObj0 = ClpSerializer.translateInput(wsrpConsumerRegistration);

		if (wsrpConsumerRegistration == null) {
			paramObj0 = new NullWrapper(
					"com.liferay.wsrp.model.WSRPConsumerRegistration");
		}

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("addWSRPConsumerRegistration",
					new Object[] { paramObj0 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.wsrp.model.WSRPConsumerRegistration)ClpSerializer.translateOutput(returnObj);
	}

	public com.liferay.wsrp.model.WSRPConsumerRegistration createWSRPConsumerRegistration(
		long consumerRegistrationId) {
		Object paramObj0 = new LongWrapper(consumerRegistrationId);

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("createWSRPConsumerRegistration",
					new Object[] { paramObj0 });
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.wsrp.model.WSRPConsumerRegistration)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteWSRPConsumerRegistration(long consumerRegistrationId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		Object paramObj0 = new LongWrapper(consumerRegistrationId);

		try {
			_classLoaderProxy.invoke("deleteWSRPConsumerRegistration",
				new Object[] { paramObj0 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.PortalException) {
				throw (com.liferay.portal.PortalException)t;
			}

			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deleteWSRPConsumerRegistration(
		com.liferay.wsrp.model.WSRPConsumerRegistration wsrpConsumerRegistration)
		throws com.liferay.portal.SystemException {
		Object paramObj0 = ClpSerializer.translateInput(wsrpConsumerRegistration);

		if (wsrpConsumerRegistration == null) {
			paramObj0 = new NullWrapper(
					"com.liferay.wsrp.model.WSRPConsumerRegistration");
		}

		try {
			_classLoaderProxy.invoke("deleteWSRPConsumerRegistration",
				new Object[] { paramObj0 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException {
		Object paramObj0 = ClpSerializer.translateInput(dynamicQuery);

		if (dynamicQuery == null) {
			paramObj0 = new NullWrapper(
					"com.liferay.portal.kernel.dao.orm.DynamicQuery");
		}

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("dynamicQuery",
					new Object[] { paramObj0 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<Object>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException {
		Object paramObj0 = ClpSerializer.translateInput(dynamicQuery);

		if (dynamicQuery == null) {
			paramObj0 = new NullWrapper(
					"com.liferay.portal.kernel.dao.orm.DynamicQuery");
		}

		Object paramObj1 = new IntegerWrapper(start);

		Object paramObj2 = new IntegerWrapper(end);

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("dynamicQuery",
					new Object[] { paramObj0, paramObj1, paramObj2 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<Object>)ClpSerializer.translateOutput(returnObj);
	}

	public com.liferay.wsrp.model.WSRPConsumerRegistration getWSRPConsumerRegistration(
		long consumerRegistrationId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		Object paramObj0 = new LongWrapper(consumerRegistrationId);

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("getWSRPConsumerRegistration",
					new Object[] { paramObj0 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.PortalException) {
				throw (com.liferay.portal.PortalException)t;
			}

			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.wsrp.model.WSRPConsumerRegistration)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<com.liferay.wsrp.model.WSRPConsumerRegistration> getWSRPConsumerRegistrations(
		int start, int end) throws com.liferay.portal.SystemException {
		Object paramObj0 = new IntegerWrapper(start);

		Object paramObj1 = new IntegerWrapper(end);

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("getWSRPConsumerRegistrations",
					new Object[] { paramObj0, paramObj1 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.wsrp.model.WSRPConsumerRegistration>)ClpSerializer.translateOutput(returnObj);
	}

	public int getWSRPConsumerRegistrationsCount()
		throws com.liferay.portal.SystemException {
		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("getWSRPConsumerRegistrationsCount",
					new Object[0]);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public com.liferay.wsrp.model.WSRPConsumerRegistration updateWSRPConsumerRegistration(
		com.liferay.wsrp.model.WSRPConsumerRegistration wsrpConsumerRegistration)
		throws com.liferay.portal.SystemException {
		Object paramObj0 = ClpSerializer.translateInput(wsrpConsumerRegistration);

		if (wsrpConsumerRegistration == null) {
			paramObj0 = new NullWrapper(
					"com.liferay.wsrp.model.WSRPConsumerRegistration");
		}

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("updateWSRPConsumerRegistration",
					new Object[] { paramObj0 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.wsrp.model.WSRPConsumerRegistration)ClpSerializer.translateOutput(returnObj);
	}

	public void addConsumerRegistration(java.lang.String consumerName,
		boolean status, java.lang.String registrationHandle,
		java.lang.String registrationData,
		java.lang.String lifetimeTerminationTime, java.lang.String producerKey)
		throws com.liferay.portal.SystemException {
		Object paramObj0 = ClpSerializer.translateInput(consumerName);

		if (consumerName == null) {
			paramObj0 = new NullWrapper("java.lang.String");
		}

		Object paramObj1 = new BooleanWrapper(status);

		Object paramObj2 = ClpSerializer.translateInput(registrationHandle);

		if (registrationHandle == null) {
			paramObj2 = new NullWrapper("java.lang.String");
		}

		Object paramObj3 = ClpSerializer.translateInput(registrationData);

		if (registrationData == null) {
			paramObj3 = new NullWrapper("java.lang.String");
		}

		Object paramObj4 = ClpSerializer.translateInput(lifetimeTerminationTime);

		if (lifetimeTerminationTime == null) {
			paramObj4 = new NullWrapper("java.lang.String");
		}

		Object paramObj5 = ClpSerializer.translateInput(producerKey);

		if (producerKey == null) {
			paramObj5 = new NullWrapper("java.lang.String");
		}

		try {
			_classLoaderProxy.invoke("addConsumerRegistration",
				new Object[] {
					paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
					paramObj5
				});
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public com.liferay.wsrp.model.WSRPConsumerRegistration getConsumerRegistration(
		java.lang.String registrationHandle, java.lang.String producerKey)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		Object paramObj0 = ClpSerializer.translateInput(registrationHandle);

		if (registrationHandle == null) {
			paramObj0 = new NullWrapper("java.lang.String");
		}

		Object paramObj1 = ClpSerializer.translateInput(producerKey);

		if (producerKey == null) {
			paramObj1 = new NullWrapper("java.lang.String");
		}

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("getConsumerRegistration",
					new Object[] { paramObj0, paramObj1 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.PortalException) {
				throw (com.liferay.portal.PortalException)t;
			}

			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.wsrp.model.WSRPConsumerRegistration)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<com.liferay.wsrp.model.WSRPConsumerRegistration> getConsumerRegistrations(
		java.lang.String producerKey) throws com.liferay.portal.SystemException {
		Object paramObj0 = ClpSerializer.translateInput(producerKey);

		if (producerKey == null) {
			paramObj0 = new NullWrapper("java.lang.String");
		}

		Object returnObj = null;

		try {
			returnObj = _classLoaderProxy.invoke("getConsumerRegistrations",
					new Object[] { paramObj0 });
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.SystemException) {
				throw (com.liferay.portal.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.wsrp.model.WSRPConsumerRegistration>)ClpSerializer.translateOutput(returnObj);
	}

	private ClassLoaderProxy _classLoaderProxy;
}