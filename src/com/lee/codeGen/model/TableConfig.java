package com.lee.codeGen.model;
import java.util.List;

/**
 * ±Ì≈‰÷√
 * @author Administrator
 *
 */
public class TableConfig {
	
	
	private String tabName;
	
	private List<ColumnConfig> columns;

	public String getTabName() {
		return tabName;
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	public List<ColumnConfig> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnConfig> columns) {
		this.columns = columns;
	}
	
	
	

}
