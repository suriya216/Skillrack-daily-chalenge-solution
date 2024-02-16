        try{
            PreparedStatement pstmt=conn.prepareStatement("select id, brandname, modelname, price from mobile order by brandname");
            ResultSet res=null;
            res=pstmt.executeQuery();
            while(res.next()){
                System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
