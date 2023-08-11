package com.tfinterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.br.amerex.tfinterface.entities.TFInterfaceBean;

@Controller
public class TFInterface {

	
	@Autowired
	JdbcTemplate jdbc;
	
	@GetMapping(value = "/interface")
	public String home2(Model model) {
		model.addAttribute("defaultTranID", "RP0030600296321");
		System.out.println("interface was called");
		return "tfinterface.html";
	}
	
	@GetMapping(value = "/interfaceFetch")
	public ResponseEntity<List<TFInterfaceBean>> interfaceFetch(String tran_id){
		Object[] params= {tran_id};
		List<TFInterfaceBean> x=jdbc.query("select * from tf_interface where trade_ref = ?",params , new BeanPropertyRowMapper<>(TFInterfaceBean.class));
		return ResponseEntity.ok(x);
	}
	
}
