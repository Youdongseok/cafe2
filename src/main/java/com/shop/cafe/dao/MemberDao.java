package com.shop.cafe.dao;

import java.sql.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.shop.cafe.dto.Member;
import com.shop.cafe.dto.Product;

public class MemberDao {
	
	
		@Value("${spring.datasource.driver-class-name}")
		private String DB_DRIVER;
		
		@Value("${spring.datasource.url}")
		private String DB_URL;
		
		@Value("${spring.datasource.username}")
		private String DB_USER;
		
		@Value("${spring.datasource.password}")
		private String DB_PW;
		
		public void insertMember(Member m) throws Exception {
			
			String sql="insert into menber(nickname, pwd, email) valuse(?,?,?)";
			Class.forName(DB_DRIVER);
			try(
					Connection con = DriverManager.getConnection(DB_URL, DB_USER,DB_PW);
					PreparedStatement stmt=con.prepareStatement(sql);
					){
				stmt.setString(1, m.getNickname());
				stmt.setString(2, m.getPwd());
				stmt.setString(3, m.getEmail());
				stmt.executeUpdate("");
			}
			
			
	}
}
