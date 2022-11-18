package com.example.onlineLearning.models;

import lombok.Data;

import java.util.HashMap;

@Data
public class ServiceResponse<TData>
{
    public static final int SUCCESS_CODE = 0;
    private int code;
    private boolean success;
    private TData data;
    private String message;
    private HashMap<String, Object> other;

    public ServiceResponse()
    {
    }

    public ServiceResponse(int code, boolean success, TData data, String message, HashMap<String, Object> other)
    {
        this.code = code;
        this.success = success;
        this.data = data;
        this.message = message;
        this.other = other;
    }

    public static <TData> ServiceResponse<TData> buildSuccessResponse(TData data)
    {
        return new ServiceResponse<TData>(0, true, data, "", null);
    }

    public static <TData> ServiceResponse<TData> buildSuccessResponse(TData data, String message)
    {
        return new ServiceResponse<TData>(0, true, data, message, null);
    }

    public static <TData> ServiceResponse<TData> buildErrorResponse(int code, String message)
    {
        return new ServiceResponse<TData>(code, false, null, message, null);
    }
}
