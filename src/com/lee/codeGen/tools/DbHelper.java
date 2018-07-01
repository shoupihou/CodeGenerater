package com.lee.codeGen.tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lee.codeGen.model.ColumnConfig;
import com.lee.codeGen.model.Config;

/**
 * ���ݿ������
 * @author Administrator
 *
 */
public class DbHelper {
	
	private  Connection conection;
	Config config;

	public DbHelper(Config config)
	{
		
		this.config=config;
		if(config!=null)
		{
			initConnection();
		}else
		{
			throw new RuntimeException("you need to specify a profile!");
		}
	}

	
	/**
	 * ��ʼ������
	 */
	private void initConnection()
	{
		//��������
		try {
			
			if(config.getSqlDialect().equals("mysql"))
			{
				Class.forName("com.mysql.jdbc.Driver");
				
			}else if(config.getSqlDialect().equals("sqlserver"))
			{
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				
			}else if(config.getSqlDialect().equals("oracle"))
			{				
					Class.forName("oracle.jdbc.driver.OracleDriver");				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//��ȡ����
		
		try {
			conection=DriverManager.getConnection(config.getSqlCon(), config.getSqlUser(), config.getSqlPwd());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	/**
	 * �ر�����
	 */
	private void closeConnection()
	{
		if(conection!=null)
		{
			try {
				conection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	/**
	 * ��ȡ���ݿ�������
	 * @param tabName
	 * @return
	 */
	private List<ColumnConfig> getTableColumns(String tabName)
	{
		String sql="select * from "+tabName;
		
		PreparedStatement ps ;
		ResultSet rs;
		List<ColumnConfig> columns =new ArrayList<>();
		try {
			ps =conection.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData meta = rs.getMetaData();
		    int columeCount = meta.getColumnCount();
		    for (int i = 1; i < columeCount + 1; i++) {
		    	ColumnConfig cc =new ColumnConfig();
		    	cc.set_type(meta.getColumnTypeName(i));
		    	cc.setName(meta.getColumnName(i));
		    	columns.add(cc);
            }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return columns;
       
		
	}
	

}
