package com.schilkroete.regloguse;

import com.schilkroete.regloguse.models.ServerRequest;
import com.schilkroete.regloguse.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("login_register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
