package com.example.onlineLearning.service.impl;

import com.example.onlineLearning.dao.StudentMapper;
import com.example.onlineLearning.domain.Student;
import com.example.onlineLearning.models.ExcelUtil;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 作者
 * @Date: 2022/11/18/18:03
 * @Description: 致敬
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public ServiceResponse<Boolean> importStudentData(InputStream inputStream, String originalFilename) {
        try {
            List<List<Object>> rowList = new ArrayList<List<Object>>();
            Workbook workbook = ExcelUtil.getWorkbook(inputStream, originalFilename);
            if (null == workbook) {
                throw new Exception("创建excel失败！");
            }
            Sheet sheet = null;
            Row row = null;
            Cell cell = null;

            // 获取excel中所有的sheet
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

                sheet = workbook.getSheetAt(i);

                if (sheet == null) {
                    continue;
                }

                // 获取表格中每一行的数据(在我传入的excel中,第一行是标题,所以数据从第二行开始获取)
                int rowNum = sheet.getFirstRowNum() + 1;

                for (int j = rowNum; j <= sheet.getLastRowNum(); j++) {

                    // 每行中的列集合
                    List<Object> cellList = new ArrayList<>();

                    // 获取一行
                    row = sheet.getRow(j);

                    // 去除空行
                    if(row == null){
                        continue;
                    }

                    // 获取一行中所有的列

                    System.out.println(row.getLastCellNum());

                    for (int k = row.getFirstCellNum(); k < row.getLastCellNum(); k++) {
                        cell = row.getCell(k);

                        // 判断遍历列的时候是否有null值
                        Object cellValue  = ExcelUtil.getCellValue(cell);
                        // 校验每列数据是否符合规则,只有全部符合的数据,才能被加入数据库。
                        // 本次excel表格中数据的规则是：每行的前十二列不能为空。
                        if(k < 12){
                            // 判断是否有空值，若有空值这不保存该行
                            if(cellValue == null || "".equals(cellValue)){
                                // 清空cellList，并跳出循环
                                cellList = null;
                                break;
                            }
                            // 判断是否有空值，若有空值这不保存该行

                            System.out.println(cellValue);
                        }
                        cellList.add(cellValue);

                    }
                    // 通过了验证，把该行数据插入集合
                    if(!CollectionUtils.isEmpty(cellList)){
                        rowList.add(cellList);
                    }
                }
            }
            if(CollectionUtils.isEmpty(rowList)){
                return ServiceResponse.buildErrorResponse(1,"您的表中没有数据或者数据不符合校验规则，请检查!");
            }
            List<Student> resultList = new ArrayList<Student>();
            for (int i = 0; i < rowList.size(); i++) {
                System.out.println(rowList.get(i));
                //还存在一些问题，就是从表格中获取的数据怎么转化long和date数据类型
                Student student=new Student(String.valueOf(rowList.get(i).get(0)),String.valueOf(rowList.get(i).get(1)),(long)1,null, null,(long) 1);
                resultList.add(student);
            }
            int insertSuccessCount=studentMapper.insertStudentData(resultList);
            if(insertSuccessCount>0){
                return ServiceResponse.buildSuccessResponse(true);
            }else{
                return ServiceResponse.buildErrorResponse(1, "Error when importStudentData.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return ServiceResponse.buildErrorResponse(1, "Error when importStudentData." );
        }

    }
}
