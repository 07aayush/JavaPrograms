package com.bl.DesignPatterns;

import java.sql.Connection;

public class TestFacadePattern {

	public static void main(String[] args) {

		String tableName = "employee";
		//generating reports without using facade pattern
		Connection con = MySqlHelper.getMySqlDbConnection();
		MySqlHelper helper = new MySqlHelper();
		helper.generateMySqlHTMLReport(tableName, con);

		Connection con1 =OracleHelper.getMyOracleConnection();
		OracleHelper helper1 = new OracleHelper();
		helper1.generateMyOraclePDFReport(tableName, con1);

		//generating reports using  facade pattern
		
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.HTML, tableName);
	
	}

}
