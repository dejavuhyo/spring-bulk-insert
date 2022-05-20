package com.example.insert.mapper.secondary;

import com.example.insert.dto.DataDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SecondaryMapper {

    int insertDataList(List<DataDTO> list);
}
