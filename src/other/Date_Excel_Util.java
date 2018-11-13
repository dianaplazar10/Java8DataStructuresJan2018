package other;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Date_Excel_Util {
    
    public Timestamp getTimestampfromStringDate(String sinceDate){ 
        sinceDate=sinceDate+" 00:00:00";
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss:SSS");//"MM/dd/yyyy");
        //Date date = null;
        if(sinceDate.isEmpty() || sinceDate.equalsIgnoreCase(""))
            return null;
        Timestamp timestamp = Timestamp.valueOf(sinceDate);
        return timestamp;
    }
    
    public long getMillisecondsfrmStrDate(String sinceDate){ 
        DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");//"MM/dd/yyyy");
        Date date = null;
        long milliseconds=0L;
        try {
            if(sinceDate.isEmpty() || sinceDate.equalsIgnoreCase(""))
                return 0l;
            date = formatter.parse(sinceDate);
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            milliseconds = calendar.getTimeInMillis();
            
        } catch (ParseException e) {
            System.out.println(e);
        }
        return (date == null ? 0l : milliseconds); 
    }
    
    public Date getDateFrmStrDate(String sinceDate){ 
        DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");//"MM/dd/yyyy");
        Date date = null;
        try {
            if(sinceDate.isEmpty() || sinceDate.equalsIgnoreCase(""))
                return null;
            date = formatter.parse(sinceDate);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return (date == null ? null : date); 
    }
    
    public File writeStudentsListToExcel(List<HashMap<String,String>> vehrecordsList){
        
        String rtnImgsFolder = "";
        try {
            rtnImgsFolder = new File("").getCanonicalFile().getPath() + File.separator +"WebContent";
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        File path = new File(rtnImgsFolder);
        File file1  = new File(path + File.separator + "report.xlsx");
        if(!(file1==null)) file1.delete();
        File file  = new File(path + File.separator + "report.xlsx");
                // Using XSSF for xlsx format, for xls use HSSF
                XSSFWorkbook workbook = new XSSFWorkbook();
                Sheet vehiclesSheet = workbook.createSheet("VehReturnRecords");
                vehiclesSheet = createHeader(vehiclesSheet);
                int rowIndex = 1;
                if(vehrecordsList.isEmpty()) return null;
                for(HashMap<String,String> vehrecord : vehrecordsList){
                    Row row = vehiclesSheet.createRow(rowIndex++);
                    int cellIndex = 0;
                    //first place in row is name
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("vehicle_number"));
                    //second place in row is marks in maths
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("battery"));
                    //third place in row is marks in Science
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("keys"));
                    //fourth place in row is marks in English
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("charger"));
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("return_condition"));
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("received_on"));
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("returnDate"));
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("notes"));
                    row.createCell(cellIndex++).setCellValue(vehrecord.get("image_links"));
                }
                //write this workbook in excel file.
                try {
                    FileOutputStream fos = new FileOutputStream(file);
                    file.createNewFile(); 
                    workbook.write(fos);
                    fos.close();
                    //System.out.println(FILE_PATH + " is successfully written");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return file;
        }

    /**
     * @param vehiclesSheet
     * @return
     */
    private static Sheet createHeader(Sheet vehiclesSheet) {
        int rowIndex = 0;
        Row rowheader = vehiclesSheet.createRow(rowIndex++);
        int cellHeaderIndex = 0;
        rowheader.createCell(cellHeaderIndex++).setCellValue("vehicle_number");
        rowheader.createCell(cellHeaderIndex++).setCellValue("battery");
        rowheader.createCell(cellHeaderIndex++).setCellValue("keys");
        rowheader.createCell(cellHeaderIndex++).setCellValue("charger");
        rowheader.createCell(cellHeaderIndex++).setCellValue("return_condition");
        rowheader.createCell(cellHeaderIndex++).setCellValue("received_on");
        rowheader.createCell(cellHeaderIndex++).setCellValue("returnDate");
        rowheader.createCell(cellHeaderIndex++).setCellValue("notes");
        rowheader.createCell(cellHeaderIndex++).setCellValue("image_links");
        return vehiclesSheet;
    }
    
    /**
     * @param rtnDte
     * String.valueOf(date) below returns the date in yyyy-mm-dd format,
     * Hence parsing it to have mm-dd part followed by year part
     * @return
     */
    String timeStampToStr(Timestamp rtnDte) { 
        Date date=rtnDte;
        String yrPart = String.valueOf(date).substring(0,4);
        String mmPart = String.valueOf(date).substring(5,7);
        String ddPart = String.valueOf(date).substring(8,10);
        String dateStr = mmPart+"/"+ddPart + "/"+yrPart;
        return dateStr;
    }

}
