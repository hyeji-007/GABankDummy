package com.example.projectdummy.productAndDeposit;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepositMapper {

    List<Long> selDemandDepositId();
    List<Long> selSavingDepositId();
}
