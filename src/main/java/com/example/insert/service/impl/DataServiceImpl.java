package com.example.insert.service.impl;

import com.example.insert.dto.DataDTO;
import com.example.insert.mapper.primary.PrimaryMapper;
import com.example.insert.mapper.secondary.SecondaryMapper;
import com.example.insert.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    PrimaryMapper primaryMapper;

    @Autowired
    SecondaryMapper secondaryMapper;

    @Override
    public List<DataDTO> selectDataList() {
        return primaryMapper.selectDataList();
    }

    @Override
    public int insertDataList(List<DataDTO> list) {
        return secondaryMapper.insertDataList(list);
    }

}
