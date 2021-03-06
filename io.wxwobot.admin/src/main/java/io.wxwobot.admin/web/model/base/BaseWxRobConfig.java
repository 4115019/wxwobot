package io.wxwobot.admin.web.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWxRobConfig<M extends BaseWxRobConfig<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setUniqueKey(java.lang.String uniqueKey) {
		set("unique_key", uniqueKey);
		return (M)this;
	}
	
	public java.lang.String getUniqueKey() {
		return getStr("unique_key");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public M setToFriend(java.lang.Boolean toFriend) {
		set("to_friend", toFriend);
		return (M)this;
	}
	
	public java.lang.Boolean getToFriend() {
		return get("to_friend");
	}

	public M setToGroup(java.lang.Boolean toGroup) {
		set("to_group", toGroup);
		return (M)this;
	}
	
	public java.lang.Boolean getToGroup() {
		return get("to_group");
	}

	public M setDefaultFriend(java.lang.Boolean defaultFriend) {
		set("default_friend", defaultFriend);
		return (M)this;
	}
	
	public java.lang.Boolean getDefaultFriend() {
		return get("default_friend");
	}

	public M setDefaultGroup(java.lang.Boolean defaultGroup) {
		set("default_group", defaultGroup);
		return (M)this;
	}
	
	public java.lang.Boolean getDefaultGroup() {
		return get("default_group");
	}

	public M setFromOut(java.lang.Boolean fromOut) {
		set("from_out", fromOut);
		return (M)this;
	}
	
	public java.lang.Boolean getFromOut() {
		return get("from_out");
	}

	public M setEnable(java.lang.Boolean enable) {
		set("enable", enable);
		return (M)this;
	}
	
	public java.lang.Boolean getEnable() {
		return get("enable");
	}

}
