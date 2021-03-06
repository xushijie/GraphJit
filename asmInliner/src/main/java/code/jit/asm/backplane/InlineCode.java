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

/**
 * 
 */
package code.jit.asm.backplane;

/**
 * @author shijiex
 *
 */
public enum InlineCode {
	/**
	 *  Merge methods from multiple class into one. It only 
	 *  1) Method inline, 
	 *  2) GetField Instruction removal 
	 *  3) NO field member removal.
	 */
	METHOD_INLINE,
	
	/**
	 *  1) Removal Class's field member
	 *  2) Merge Callee's function. 
	 *  3) GetField and putField instructions.  
	 */
	CLASS_INLINE
}
