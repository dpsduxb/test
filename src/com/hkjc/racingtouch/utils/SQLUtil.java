package com.hkjc.racingtouch.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQLUtil {

	String db_connect_string = "jdbc:sqlserver://localhost";
	String db_userid = "dpsduxb34";
	String db_password = "Srujana7890";

	public Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);

			System.out.println("connected to database successfully");
			return conn;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Map<String, Object>> parseResultSet(ResultSet rs) {
		ResultSetMetaData rsmd;
		try {
			rsmd = rs.getMetaData();
			// Iterate through the data in the result set and display it.

			List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
			while (rs.next()) {
				Map<String, Object> obj = null;
				int numColumns = rsmd.getColumnCount();

				obj = new HashMap<String, Object>();
				for (int i = 1; i < numColumns + 1; i++) {
					String column_name = rsmd.getColumnName(i);

					if (rsmd.getColumnType(i) == java.sql.Types.ARRAY) {
						obj.put(column_name, rs.getArray(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.BIGINT) {
						obj.put(column_name, rs.getInt(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.BOOLEAN) {
						obj.put(column_name, rs.getBoolean(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.BLOB) {
						obj.put(column_name, rs.getBlob(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.DOUBLE) {
						obj.put(column_name, rs.getDouble(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.FLOAT) {
						obj.put(column_name, rs.getFloat(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.INTEGER) {
						obj.put(column_name, rs.getInt(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.NVARCHAR) {
						obj.put(column_name, rs.getNString(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.VARCHAR) {
						obj.put(column_name, rs.getString(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.TINYINT
							|| rsmd.getColumnType(i) == java.sql.Types.BIT) {
						obj.put(column_name, rs.getInt(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.SMALLINT) {
						obj.put(column_name, rs.getInt(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.DATE) {
						obj.put(column_name, rs.getDate(column_name));
					} else if (rsmd.getColumnType(i) == java.sql.Types.TIMESTAMP) {
						obj.put(column_name, rs.getTimestamp(column_name));
					} else {
						obj.put(column_name, rs.getObject(column_name));
					}
				}
				lists.add(obj);
			}
			System.out.println(lists);
			return lists;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
