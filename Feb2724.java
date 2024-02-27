        String query1="insert into student(id, name, physics, maths, chemistry)values(?, ?, ?, ?, ?)";
        try{
        PreparedStatement stmt=conn.prepareStatement(query1);
            stmt.setInt(1, 1);
            stmt.setString(2, "Student1");
            stmt.setInt(3, 85);
            stmt.setInt(4, 95);
            stmt.setInt(5, 89);
            stmt.executeUpdate();
            stmt.setInt(1, 2);
            stmt.setString(2, "Student2");
            stmt.setInt(3, 91);
            stmt.setInt(4, 96);
            stmt.setInt(5, 93);
            stmt.executeUpdate();
    }catch(SQLException e){
        e.printStackTrace();
    }
