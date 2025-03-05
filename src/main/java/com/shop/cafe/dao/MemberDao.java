package com.shop.cafe.dao;

import java.sql.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.shop.cafe.dto.Member;

@Repository
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
        // 오타 수정: valuse -> VALUES, menber -> member
        String sql = "INSERT INTO member (nickname, pwd, email) VALUES (?, ?, ?)";
        
        Class.forName(DB_DRIVER);
        
        try (
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
            PreparedStatement stmt = con.prepareStatement(sql);
        ) {
            // PreparedStatement를 사용하여 값 설정
            stmt.setString(1, m.getNickname());
            stmt.setString(2, m.getPwd());
            stmt.setString(3, m.getEmail());
            
            // 쿼리 실행 및 결과 출력
            int i = stmt.executeUpdate();
            System.out.println(i + "행이 삽입되었습니다.");
        }
    }
}
