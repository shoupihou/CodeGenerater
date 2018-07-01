package com.lee.codeGen.model;

/**
 * 基础配置类
 * @author Administrator
 *
 */
public class Config {
	//数据库方言
	private String sqlDialect;
	//数据连接
	private String sqlCon;
	//用户名
	private String sqlUser;
	//密码
	private String sqlPwd;
	//表名
	private String tabName;
	//子表
	private String subTable;
	//包名
	private String packageName;

	public String getSqlDialect() {
		return sqlDialect;
	}

	public void setSqlDialect(String sqlDialect) {
		this.sqlDialect = sqlDialect;
	}

	public String getSqlCon() {
		return sqlCon;
	}

	public void setSqlCon(String sqlCon) {
		this.sqlCon = sqlCon;
	}

	public String getSqlUser() {
		return sqlUser;
	}

	public void setSqlUser(String sqlUser) {
		this.sqlUser = sqlUser;
	}

	public String getSqlPwd() {
		return sqlPwd;
	}

	public void setSqlPwd(String sqlPwd) {
		this.sqlPwd = sqlPwd;
	}

	public String getTabName() {
		return tabName;
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	public String getSubTable() {
		return subTable;
	}

	public void setSubTable(String subTable) {
		this.subTable = subTable;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	
	

}
