package com.example.uts_pb.data.retrofit;

import com.example.uts_pb.data.response.GithubSearchResponse;
import com.example.uts_pb.data.response.GithubUser;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Authorization: token <MY_TOKEN>"})
    @GET("search/users")
    Call<GithubSearchResponse> searchUsers(@Query("q") String query);

    @Headers({"Authorization: token <MY_TOKEN>"})
    @GET("users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);


}
