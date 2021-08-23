package utilities;

//import pojos.Country;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.Assert;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class ExcelUtil {
//
//    private Workbook workBook;
//    private Sheet workSheet;
//    private String path;
//
//    public ExcelUtil(String path, String sheetName) {//This Constructor is to open and access the excel file
//        this.path = path;
//        try {
//            // Opening the Excel file
//            FileInputStream fileInputStream = new FileInputStream(path);
//            // accessing the workbook
//            workBook = WorkbookFactory.create(fileInputStream);
//            //getting the worksheet
//            workSheet = workBook.getSheet(sheetName);
//            //asserting if sheet has data or not
//            Assert.assertNotNull(workSheet, "Worksheet: \"" + sheetName + "\" was not found\n");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    //===============Getting the number of columns in a specific single row=================
//    public int columnCount() {
//        //getting how many numbers in row 1
//        return workSheet.getRow(0).getLastCellNum();
//    }
//    //===============how do you get the last row number?Index start at 0.====================
//    public int rowCount() {
//        return workSheet.getLastRowNum() + 1; }//adding 1 to get the actual count
//
//    //==============When you enter row and column number, then you get the data==========
//    public String getCellData(int rowNum, int colNum) {
//        Cell cell;
//        try {
//            cell = workSheet.getRow(rowNum).getCell(colNum);
//            String cellData = cell.toString();
//            return cellData;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    //============getting all data into two dimentional array and returning the data===
//    public String[][] getDataArray() {
//        String[][] data = new String[rowCount()][columnCount()];
//        for (int i = 0; i < rowCount(); i++) {
//            for (int j = 0; j < columnCount(); j++) {
//                String value = getCellData(i, j);
//                data[i][j] = value;
//            }
//        }
//        return data;
//    }
//
//    //This will get the list of the data in the excel file
//    //This is a list of map. This takes the data as string and will return the data as a Map of String
//    public List<Map<String, String>> getDataList() {
//
//        // getting all columns
//        List<String> columns = getColumnsNames();
//        // method will return this
//        List<Map<String, String>> data = new ArrayList<>();
//
//        for (int i = 1; i < rowCount(); i++) {
//            // get each row
//            Row row = workSheet.getRow(i);
//            // creating map of the row using the column and value
//            // key=column, value=cell
//            Map<String, String> rowMap = new HashMap<String, String>();
//            for (Cell cell : row) {
//                int columnIndex = cell.getColumnIndex();
//                rowMap.put(columns.get(columnIndex), cell.toString());
//            }
//            data.add(rowMap);
//        }
//
//        return data;
//    }
//    //==============going to the first row and reading each row one by one==================//
//    public List<String> getColumnsNames() {
//        List<String> columns = new ArrayList<>();
//        for (Cell cell : workSheet.getRow(0)) {
//            columns.add(cell.toString());
//        }
//        return columns;
//    }
//
//    //=========When you enter the row and column number, returning the value===============//
//    public void setCellData(String value, int rowNum, int colNum) {
//        Cell cell;
//        Row row;
//        try {
//            row = workSheet.getRow(rowNum);
//            cell = row.getCell(0);
//            if (cell == null) {//if there is no value, create a cell.
//                cell = row.createCell(0);
//                cell.setCellValue(value);
//            } else {
//                cell.setCellValue(value);
//            }
//            FileOutputStream fileOutputStream = new FileOutputStream(path);
//            workBook.write(fileOutputStream);
//            fileOutputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void setSheetData(List <Country>  countries, String path , String sheetName){
//
//        for (int i = 0; i < countries.size(); i++) {
//
//            setCellData(countries.get(i).getName(),1, i);
//            String value = ""+countries.get(i).getId();
//            setCellData(value,2, i);
//
//        }
//
//    }
//
//    public void setHeaders(List <String> headers){
//        HSSFWorkbook workbook = new HSSFWorkbook();
//        HSSFSheet sheet = workbook.createSheet("country2");
//
//        Row header = sheet.createRow(0);
//        header.createCell(0).setCellValue(headers.get(0));
//        header.createCell(1).setCellValue(headers.get(1));
//
//    }
//
//    public void setCellData(String value, String columnName, int row) {
//        int column = getColumnsNames().indexOf(columnName);
//        setCellData(value, row, column);
//    }
//
//
//    public static void main(String[] args) throws IOException {
//
//
//        String path = "C:\\Users\\sam\\IdeaProjects\\GMIBank\\src\\test\\resources\\test_data\\CountryData.xlsx";
////        ExcelUtil excelUtil = new ExcelUtil(path, "country");
//        // ExcelUtil excelUtil = new ExcelUtil();
//        List <String> list = new ArrayList<>();
//        list.add("Name");
//        list.add("id");
//        //  excelUtil.setHeaders(list);
////        excelUtil.setCellData("CountryName", 4,4);
//
//        List <Country> countries = new ArrayList<>();
//
//
//
//        Country country = new Country();
//
//        country.setName("Name");
//        country.setId(123);
//
//
//        Country country2 = new Country();
//
//        country2.setName("USA");
//        country2.setId(12348);
//
//
//        Country country3 = new Country();
//
//        country3.setName("Germany");
//        country3.setId(23456);
//
//        countries.add(country);
////        countries.add(country2);
////        countries.add(country3);
////        excelUtil.setSheetData(countries, path,"country" );
//
//
////        NiceExcelWriterExample excelWriter = new NiceExcelWriterExample();
//
//
//        String excelFilePath = "NiceJavaBooks.xls";
//
//        //  excelUtil.writeExcel(countries, path);
//
//    }
//
//    private Workbook getWorkbook(String excelFilePath)
//            throws IOException {
//        Workbook workbook = null;
//
//        if (excelFilePath.endsWith("xlsx")) {
//            workbook = new XSSFWorkbook();
//        } else if (excelFilePath.endsWith("xls")) {
//            workbook = new HSSFWorkbook();
//        } else {
//            throw new IllegalArgumentException("The specified file is not Excel file");
//        }
//
//        return workbook;
//    }
//
//
//    private void writeBook(Country aBook, Row row) {
//        Cell cell = row.createCell(1);
//        cell.setCellValue(aBook.getName());
//
//        cell = row.createCell(2);
//        cell.setCellValue(aBook.getId());
//
//    }
//
//    public void writeExcel(List<Country> listBook, String excelFilePath) throws IOException {
//        Workbook workbook = new HSSFWorkbook();
//        Sheet sheet = workbook.createSheet();
//
//        int rowCount = 0;
//
//        for (Country aBook : listBook) {
//            Row row = sheet.createRow(++rowCount);
//            writeBook(aBook, row);
//        }
//
//        try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
//            workbook.write(outputStream);
//        }
//    }
//
//    private void createHeaderRow(Sheet sheet) {
//
//        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
//        Font font = sheet.getWorkbook().createFont();
//        font.setBold(true);
//        font.setFontHeightInPoints((short) 16);
//        cellStyle.setFont(font);
//
//        Row row = sheet.createRow(0);
//        Cell cellTitle = row.createCell(1);
//
//        cellTitle.setCellStyle(cellStyle);
//        cellTitle.setCellValue("Title");
//
//        Cell cellAuthor = row.createCell(2);
//        cellAuthor.setCellStyle(cellStyle);
//        cellAuthor.setCellValue("Author");
//
//        Cell cellPrice = row.createCell(3);
//        cellPrice.setCellStyle(cellStyle);
//        cellPrice.setCellValue("Price");
//    }
//}
