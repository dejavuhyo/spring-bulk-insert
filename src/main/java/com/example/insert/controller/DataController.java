package com.example.insert.controller;

import com.example.insert.dto.DataDTO;
import com.example.insert.service.DataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DataController {

    @Resource
    private DataService dataService;

    @GetMapping("/data")
    public ResponseEntity data() {

        List<DataDTO> selectDataList = dataService.selectDataList();
        ArrayList<DataDTO> dataList = new ArrayList<DataDTO>();

        int count = 0;
        int insCount = 0;
        int selSize = selectDataList.size();

        for (DataDTO dataDTO : selectDataList) {
            DataDTO dto = new DataDTO();
            dto.setBizplCd(dataDTO.getBizplCd());
            dto.setBizplNm(dataDTO.getBizplNm());
            dto.setTelNo(dataDTO.getTelNo());

            dataList.add(dto);
            count++;

            if (insCount == 1000 || selSize - 1 == count) {
                dataService.insertDataList(dataList);
                dataList = new ArrayList<DataDTO>();
                insCount = 0;
            } else {
                insCount++;
            }
        }

        return new ResponseEntity(HttpStatus.OK);
    }
}
