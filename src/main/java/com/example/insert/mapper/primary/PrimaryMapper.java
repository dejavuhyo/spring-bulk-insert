package com.example.insert.mapper.primary;

import com.example.insert.dto.DataDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PrimaryMapper {

    List<DataDTO> selectDataList();
}
