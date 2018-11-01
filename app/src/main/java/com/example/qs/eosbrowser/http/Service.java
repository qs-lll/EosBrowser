package com.example.qs.eosbrowser.http;

import com.example.qs.eosbrowser.http.bean.ReqAction;
import com.example.qs.eosbrowser.http.bean.ResAction;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Service {
  @POST("v1/history/get_actions")
  Call<ResAction> getActions(@Body ReqAction reqAction);
}