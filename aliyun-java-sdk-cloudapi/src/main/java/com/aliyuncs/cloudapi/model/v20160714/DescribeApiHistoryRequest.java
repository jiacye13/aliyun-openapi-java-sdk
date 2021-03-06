/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiHistoryRequest extends RpcAcsRequest<DescribeApiHistoryResponse> {
	
	public DescribeApiHistoryRequest() {
		super("CloudAPI", "2016-07-14", "DescribeApiHistory", "apigateway");
	}

	private String groupId;

	private String apiId;

	private String stageName;

	private String historyVersion;

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		putQueryParameter("GroupId", groupId);
	}

	public String getApiId() {
		return this.apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
		putQueryParameter("ApiId", apiId);
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
		putQueryParameter("StageName", stageName);
	}

	public String getHistoryVersion() {
		return this.historyVersion;
	}

	public void setHistoryVersion(String historyVersion) {
		this.historyVersion = historyVersion;
		putQueryParameter("HistoryVersion", historyVersion);
	}

	@Override
	public Class<DescribeApiHistoryResponse> getResponseClass() {
		return DescribeApiHistoryResponse.class;
	}

}
