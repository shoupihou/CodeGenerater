package com.lee.codeGen.model;

/**
 * ����������
 * @author Administrator
 *
 */
public class Config {
	//���ݿⷽ��
	private String sqlDialect;
	//��������
	private String sqlCon;
	//�û���
	private String sqlUser;
	//����
	private String sqlPwd;
	//����
	private String tabName;
	//�ӱ�
	private String subTable;
	//����
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
