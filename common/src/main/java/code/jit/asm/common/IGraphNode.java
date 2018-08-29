/*******************************************************************************
 * Copyright (c) 2018 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package code.jit.asm.common;


public interface IGraphNode {
	public  int getSize();
	public  int getInvocationCount();
	public  Blob get(String clsName, String mhName, String desc,  boolean initInstance);
	
	public void cacheData(Object object);
	public Object getCacheData();
}
