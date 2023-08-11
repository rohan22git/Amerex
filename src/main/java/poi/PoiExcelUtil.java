package poi;



import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import com.br.amerex.AmerexConfig;



public class PoiExcelUtil  {
	
	private Workbook wb;
	private Sheet sheet;
	AmerexConfig config;
	public PoiExcelUtil(String sheetName, AmerexConfig config)
	{
		wb = new SXSSFWorkbook(100);
		sheet = wb.createSheet(sheetName);
		sheet.setDisplayGridlines(true);
		this.config=config;
	}
	public void createCell(int rowPos, ArrayList<String> l) throws Exception {
		try
		{
			int headCount=config.getHeaderCount()-1,brokerCount=config.getBrokerCount()-1;
			int brokerCounter=-1;
			Row row = createRow(sheet,rowPos,true);
			for(int i = 0;i<l.size();i++){
				Cell cell = row.createCell(i);
				if(brokerCounter>=brokerCount) {
					brokerCounter=-1;
				}
				if(i>headCount) {
					brokerCounter++;
				}
				if(config.getNumberColsList().contains(i) || config.getNumberColsBrokerList().contains(brokerCounter)) {
					try {
						cell.setCellValue(Double.parseDouble(l.get(i)));
					}catch (Exception e) {
						cell.setCellValue(l.get(i));
					}
				}else {
					cell.setCellValue(l.get(i));
				}
				cell=null;
			}
			row=null;
		} catch(Exception ex){
			ex.printStackTrace();
			throw ex;
		}
	}
	private Row createRow(Sheet sheet, int rowPos,boolean getExisting){
		if (getExisting && sheet.getRow(rowPos)!=null )
			return sheet.getRow(rowPos);
		else
			return sheet.createRow(rowPos);
	}
	public void saveToStream(OutputStream stream) throws IOException{
		try{
			wb.write(stream);
		} catch(IOException ex){
			ex.printStackTrace();
			throw ex;
		}
	}
}