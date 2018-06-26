/*
 *
 * Copyright © 2018  深圳市电子商务安全证书管理有限公司(SZCA,深圳CA) 版权所有
 * Copyright © 2018  SZCA. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.bcia.javachain.ca.szca.publicweb.api;

import com.google.gson.JsonObject;

public class ApiCaInfo {
	private com.google.gson.JsonObject json = new JsonObject(); 
	
	public JsonObject toJsonObject() {
		json.addProperty("CAName", caname);
		json.addProperty("CAChain",cachain);
		json.addProperty("Cert",cert);
		if(serverInfo!=null)
			json.add("ServerInfo",serverInfo);
		return json;
	}
	
	private String cert="";
	private String cachain="";
	private String caname="";
	private JsonObject serverInfo  ;
	 
	public String getCachain() {
		return cachain;
	}
	public void setCachain(String cachain) {
		this.cachain = cachain;
	}
	public String getCaname() {
		return caname;
	}
	public void setCaname(String caname) {
		this.caname = caname;
	}
	public String getCert() {
		return cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
	}
	 
	public void setServerInfo(JsonObject serverInfo) {
		this.serverInfo = serverInfo;
	}
	
	 
	  
	   
}
