package com.example.insert.service;

import com.example.insert.dto.DataDTO;

import java.util.List;

public interface DataService {

    List<DataDTO> selectDataList();

    int insertDataList(List<DataDTO> list);

}
