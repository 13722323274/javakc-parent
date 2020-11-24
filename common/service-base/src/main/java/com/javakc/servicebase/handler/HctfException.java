package com.javakc.servicebase.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HctfException extends RuntimeException {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 异常信息
     */
    private String msg;

}
