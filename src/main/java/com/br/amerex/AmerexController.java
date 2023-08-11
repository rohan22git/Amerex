package com.br.amerex;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.br.amerex.tfinterface.entities.SourceSystem;

import poi.ExcelDownloadUtils;

@Controller
public class AmerexController {

	
	@Autowired
	JdbcTemplate jdbc;
	
	@GetMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("amerexConfig",new AmerexConfig());
		return "AmerexMerge.html";
	}
	
	@GetMapping(value = "/br")
	public String br(Model model) {
		return "SourceSystem.html";
	}
	
	@GetMapping(value = "/Spring")
	public String spring() {
		return "Spring";
	}
	
	
	@GetMapping(value = "/sourceSystem")
	public ResponseEntity<List<SourceSystem>> sourceSystem(Model model) {
		List<SourceSystem> ss = jdbc.query("select source_system,feed_active from source_system ",new BeanPropertyRowMapper<>(SourceSystem.class));
		Map<String, Object> data = new HashMap<>();
		  data.put("name", "John");
		  data.put("age", 30);
		  return ResponseEntity.ok(ss);
	}
	@PostMapping(value = "/updateSourceSystem")
	public ResponseEntity<String> updateSourceSystem(Model model, SourceSystem ss) {
		jdbc.update("update source_system set feed_active =? where source_system= ? ", ss.getFeed_active(),ss.getSource_system());
		System.out.println(model);
		return ResponseEntity.ok("");
	}
	
	@PostMapping(value = "/upload")
	public void upload(MultipartFile file1, MultipartFile file2 , HttpServletResponse resp , AmerexConfig config) {
		config.setUp();
		Path tmpP=Paths.get(System.getProperty("user.dir")+"/src/main/resources/tmp");
		Path tf1=null,tf2=null;
		try {
			tf1 = Files.createTempFile(tmpP, "header", ".txt");
			tf2 = Files.createTempFile(tmpP, "split", ".txt");
			InputStream i1= file1.getInputStream();
			Files.write(tf1, StreamUtils.copyToByteArray(file1.getInputStream()) , StandardOpenOption.CREATE);
			Files.write(tf2, StreamUtils.copyToByteArray(file2.getInputStream()) , StandardOpenOption.CREATE);
			ArrayList<List<String>> list = MergeData.Merge(tf1, tf2,config);
		    resp.setContentType("application/vnd.ms-excel");
		    resp.setHeader("Content-Disposition", "attachment; filename=mergedData.xlsx");
			try {
				ExcelDownloadUtils.getExcelDownLoad(list, resp.getOutputStream(),config);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				Files.deleteIfExists(tf1);
				Files.deleteIfExists(tf2);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//return "upload.html";
	}
	
}
