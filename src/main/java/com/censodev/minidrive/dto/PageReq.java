package com.censodev.minidrive.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageReq {
    private Integer page;
    private Integer limit;
    private String orderBy;
    private String order;
}
