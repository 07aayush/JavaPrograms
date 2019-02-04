package com.bl.DesignPatterns;

import java.sql.Connection;

public class HelperFacade {

	public static enum DBTypes{
		MYSQL,ORACLE;
	}
	
	public static enum ReportTypes{
		HTML,PDF;
	}
	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
		Connection con = null;
		switch (dbType){
		case MYSQL: 
			con = MySqlHelper.getMySqlDbConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			switch(reportType){
			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			}
			break;
		case ORACLE: 
			con = OracleHelper.getMyOracleConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch(reportType){
			case HTML:
				oracleHelper.genetateMyOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateMyOraclePDFReport(tableName, con);
				break;
			}
			break;
		}
		
	}
	
	

}
