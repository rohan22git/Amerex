package com.br.amerex;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MergeData {

	private static ArrayList<String[]> addToList(String s[]) {
		ArrayList<String[]> l = new ArrayList<String[]>();
		l.add(s);
		return l;
	}
	private static ArrayList<String[]> mergeValue(ArrayList<String[]> existing,ArrayList<String[]> newData) {
		existing.addAll(newData);
		return existing;
	}
	
	private static void copyBrokers(List<String> main, List<String[]> brokerList,AmerexConfig config) {
		for(String[] s:brokerList) {
			copyArrayToList(main,s,config.getIgnoreBrokerColsList());
		}
	}
	private static void copyArrayToList(List<String> main, String s[],List<Integer> ignore) {
		int i=0;
		for (String string : s) {
			if(!ignore.contains(i))
				main.add(string);
			i++;
		}
	}
	
	/*
	 * public static void main(String[] args) throws Exception { Path
	 * headerFile=Paths.get(System.getProperty("user.dir"),
	 * "src/main/resources/static","20220101_202201_header.txt"); Path
	 * brokerFile=Paths.get(System.getProperty("user.dir"),
	 * "src/main/resources/static","20220101_202201_splits.txt");
	 * //Merge(headerFile, brokerFile); }
	 */
	public static ArrayList<List<String>> Merge(Path headerFile, Path brokerFile, AmerexConfig config ) {
		ArrayList<List<String>> finalList=new ArrayList<List<String>>();
		try {
			Map<Object, String[]> headerData = Files.lines(headerFile).map(row->row.split(config.getSeperator())).collect(Collectors.toMap( a1 -> a1[config.getHeaderUniqueCol()] , Function.identity()));
			Map<Object, ArrayList<String[]>> brokerData = Files.lines(brokerFile).map(row->row.split(config.getSeperator())).collect(Collectors.toMap(a1 -> a1[config.getBrokerUniqueCol()], MergeData::addToList, MergeData::mergeValue ));
			
			Iterator<Entry<Object, String[]>> ref = headerData.entrySet().iterator();
			while(ref.hasNext()) {
				Entry<Object, String[]> next = ref.next();
				List<String> colData= new ArrayList<String>(); 
				copyArrayToList(colData,next.getValue(),config.getIgnoreHeaderColsList());
				copyBrokers( colData, brokerData.get(next.getKey()),config);
				brokerData.remove(next.getKey());
				//headerData.remove(next.getKey());
				finalList.add(colData);
			}
			System.gc();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return finalList;
	}
}
