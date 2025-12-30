package com.vbs.demo.LoginDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TransactionDto {
    double amount;
    int id;
}
