package poi;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.br.amerex.AmerexConfig;

public class ExcelDownloadUtils {
	
	public static void getExcelDownLoad(ArrayList<List<String>> finalList, OutputStream out, AmerexConfig config) throws Exception{
		try{
			PoiExcelUtil xls=new PoiExcelUtil("mergedData",config);
			int row=0;
			for (List<String> list : finalList) {
				xls.createCell(row++,(ArrayList<String>) list);
			}
			//xls.saveToStream(new FileOutputStream("merged.xlsx"));
			xls.saveToStream(out);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}