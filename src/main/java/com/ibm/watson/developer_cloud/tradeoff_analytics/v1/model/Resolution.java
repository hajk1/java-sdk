/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.watson.developer_cloud.tradeoff_analytics.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.watson.developer_cloud.util.GsonSingleton;

/**
 * The Class Resolution.
 */
public class Resolution {

	/** The solutions. */
	private List<Solution> solutions = new ArrayList<Solution>();

	/**
	 * Gets the solutions.
	 *
	 * @return     The solutions
	 */
	public List<Solution> getSolutions() {
		return solutions;
	}

	/**
	 * Sets the solutions.
	 *
	 * @param solutions     The solutions
	 */
	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " "
				+ GsonSingleton.getGson().toJson(this);
	}

	/**
	 * With solutions.
	 * 
	 * @param solutions
	 *            the solutions
	 * @return the resolution
	 */
	public Resolution withSolutions(List<Solution> solutions) {
		this.solutions = solutions;
		return this;
	}

}
