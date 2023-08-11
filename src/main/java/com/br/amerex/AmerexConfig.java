package com.br.amerex;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class AmerexConfig {

	private String numberCols;
	private ArrayList<Integer> numberColsList=new ArrayList<>();
	
	private String numberColsBroker;
	private ArrayList<Integer> numberColsBrokerList=new ArrayList<>();
	
	private int headerCount,brokerCount;
	
	private String ignoreHeaderCols;
	private ArrayList<Integer> ignoreHeaderColsList=new ArrayList<>();
	private String ignoreBrokerCols;
	private ArrayList<Integer> ignoreBrokerColsList=new ArrayList<>();
	private String dateCols;
	private ArrayList<Integer> dateColsList=new ArrayList<>();
	private String seperator;
	private String uniqueCol;
	private int headerUniqueCol, brokerUniqueCol;

	AmerexConfig(){
		setNumberCols("28");
		setNumberColsBroker("10");
		setDateCols("1,3");
		setSeperator("\\|~\\|");
		setUniqueCol("8,7");
		headerCount=42;
		brokerCount=10;
	}
	
	
	public int getHeaderCount() {
		return headerCount;
	}


	public void setHeaderCount(int headerCount) {
		this.headerCount = headerCount;
	}


	public int getBrokerCount() {
		return brokerCount;
	}


	public void setBrokerCount(int brokerCount) {
		this.brokerCount = brokerCount;
	}


	public String getNumberColsBroker() {
		return numberColsBroker;
	}


	public void setNumberColsBroker(String numberColsBroker) {
		this.numberColsBroker = numberColsBroker;
		copyToList(numberColsBroker,numberColsBrokerList);
	}


	public ArrayList<Integer> getNumberColsBrokerList() {
		return numberColsBrokerList;
	}


	public void setNumberColsBrokerList(ArrayList<Integer> numberColsBrokerList) {
		this.numberColsBrokerList = numberColsBrokerList;
	}


	public String getNumberCols() {
		return numberCols;
	}

	public void setNumberCols(String numberCols) {
		this.numberCols = numberCols;
		copyToList(numberCols,numberColsList);
	}

	private void copyToList(String src,ArrayList<Integer> dest) {
		if(StringUtils.hasText(src)) {
			for (String s:src.split(",")) {
				dest.add(Integer.parseInt(s)-1);
			}
		}
	}
	public String getDateCols() {
		return dateCols;
	}

	public void setDateCols(String dateCols) {
		this.dateCols = dateCols;
		copyToList(dateCols,dateColsList);
	}

	public String getSeperator() {
		return seperator;
	}

	public void setSeperator(String seperator) {
		this.seperator = seperator;
	}

	public String getUniqueCol() {
		return uniqueCol;
	}

	public void setUniqueCol(String uniqueCol) {
		this.uniqueCol = uniqueCol;
		String s[]=uniqueCol.split(",");
		if(s.length==2) {
			headerUniqueCol=Integer.parseInt(s[0])-1;
			brokerUniqueCol=Integer.parseInt(s[1])-1;
		}
	}

	public String getIgnoreHeaderCols() {
		return ignoreHeaderCols;
	}

	public void setIgnoreHeaderCols(String ignoreHeaderCols) {
		this.ignoreHeaderCols = ignoreHeaderCols;
		copyToList(ignoreHeaderCols,ignoreHeaderColsList);
		
	}

	public String getIgnoreBrokerCols() {
		return ignoreBrokerCols;
	}

	public void setIgnoreBrokerCols(String ignoreBrokerCols) {
		this.ignoreBrokerCols = ignoreBrokerCols;
		copyToList(ignoreBrokerCols,ignoreBrokerColsList);
		
	}


	public ArrayList<Integer> getNumberColsList() {
		return numberColsList;
	}


	public void setNumberColsList(ArrayList<Integer> numberColsList) {
		this.numberColsList = numberColsList;
	}


	public ArrayList<Integer> getIgnoreHeaderColsList() {
		return ignoreHeaderColsList;
	}


	public void setIgnoreHeaderColsList(ArrayList<Integer> ignoreHeaderColsList) {
		this.ignoreHeaderColsList = ignoreHeaderColsList;
	}


	public ArrayList<Integer> getIgnoreBrokerColsList() {
		return ignoreBrokerColsList;
	}


	public void setIgnoreBrokerColsList(ArrayList<Integer> ignoreBrokerColsList) {
		this.ignoreBrokerColsList = ignoreBrokerColsList;
	}


	public ArrayList<Integer> getDateColsList() {
		return dateColsList;
	}


	public void setDateColsList(ArrayList<Integer> dateColsList) {
		this.dateColsList = dateColsList;
	}


	public int getHeaderUniqueCol() {
		return headerUniqueCol;
	}


	public void setHeaderUniqueCol(int headerUniqueCol) {
		this.headerUniqueCol = headerUniqueCol;
	}


	public int getBrokerUniqueCol() {
		return brokerUniqueCol;
	}


	public void setBrokerUniqueCol(int brokerUniqueCol) {
		this.brokerUniqueCol = brokerUniqueCol;
	}
	
	public void setUp() {
		int x=0;
		x=ignoreHeaderColsList.size();
		for(int i=0;i<numberColsList.size();i++) {
			numberColsList.set(i, numberColsList.get(i)-x);
		}
		x=ignoreBrokerColsList.size();
		for(int i=0;i<numberColsBrokerList.size();i++) {
			numberColsBrokerList.set(i, numberColsBrokerList.get(i)-x);
		}
	}
	
}
