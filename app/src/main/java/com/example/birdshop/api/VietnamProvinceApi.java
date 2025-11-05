package com.example.birdshop.api;

import com.example.birdshop.model.VietnamProvinceResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * API interface cho VietnamProvince API từ vietnamlabs.com
 */
public interface VietnamProvinceApi {
    
    /**
     * Lấy tất cả tỉnh thành và phường xã
     * GET /api/vietnamprovince
     */
    @GET("/api/vietnamprovince")
    Call<VietnamProvinceResponse> getAllProvinces();
    
    /**
     * Lấy phường xã theo tỉnh
     * GET /api/vietnamprovince?province={tên_tỉnh}
     */
    @GET("/api/vietnamprovince")
    Call<VietnamProvinceResponse> getProvinceWards(
            @Query("province") String provinceName
    );
}

