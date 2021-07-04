package com.idfc.bank.JaxRxMVC;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.idfc.bo.PolicyBo;

import com.idfc.dao.PolicyDAO;
import com.idfc.dao.PolicyDAOImpl;
import com.idfc.vo.PolicyVO;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("cancellation")
public class ControllerImpl {

    
   @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<PolicyBo> getIt(PolicyVO vo ) {
    	
    	
    	
    	System.out.println("voData"+vo.getPolicyNumber());
    	System.out.println("voData"+vo.getDcnNumber());
    	System.out.println("voData"+vo.getEndormsnetNumber());
    	
    	
    	List<PolicyBo> list;
    	PolicyDAO dao = new PolicyDAOImpl();
    	list=dao.selectDB();
    	
    	
    	
    	
    	
    	
    	
    	
        return list;
    }
}
