package bank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bank.dao.RegisterDao;
import bank.db.DbConnection;
import bank.model.Register;

public class RegisterDaoImpl implements RegisterDao{
	
	@Override
	public int create(List<Register> lst) {
		int i=0;
		DbConnection db=new DbConnection();
		Connection con=db.myConnection();
		Register robj=lst.get(0);
		lst=null;
		try {
			PreparedStatement pstate=
					con.prepareStatement("insert into register values(?,?,?,?,?)");
			pstate.setInt(1,robj.getRegNo());
			pstate.setString(2,robj.getCustName());
			pstate.setString(3,robj.getUserName());
			pstate.setString(4,robj.getPassword());
			pstate.setFloat(5,robj.getAccBal());
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			System.out.println("record save");
		}
		return i;
	}

	/*@Override
	public List<Register> retrive(int regNo) {	
		List<Register> lsrrec=null;
		int i=0;
		ResultSet rs=null;
		DbConnection db=new DbConnection();
		Connection con=db.myConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("select * from register where reg_no=?");
			pstate.setInt(1,regNo);
			rs=pstate.executeQuery();
			
			if(rs.next()) {
				Register robj=new Register(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5));
				lsrrec=new ArrayList<Register>();
				lsrrec.add(robj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lsrrec;
	}*/
	

}
