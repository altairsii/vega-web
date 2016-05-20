package com.vega.web.turnkey.model;

/**
 * 配置信息操作类
 * @author wangyongbing
 *
 */
public class PConfig {

	/**
	 * id,自增主键
	 */
	private String id;

	/**
	 * 服务名称
	 */
	private String aliases;

	/**
	 * 配置名称
	 */
	private String propName;

	/**
	 * 版本号
	 */
	private String version;

	/**
	 * 配置属性名
	 */
	private String attrName;

	/**
	 * 配置属性值
	 */
	private String attrValue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAliases() {
		return aliases;
	}

	public void setAliases(String aliases) {
		this.aliases = aliases;
	}

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
}
