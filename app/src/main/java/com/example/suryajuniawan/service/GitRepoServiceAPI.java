package com.example.suryajuniawan.service;

import com.example.suryajuniawan.GitRepo;
import com.example.suryajuniawan.GitUsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface GitRepoServiceAPI {

    @GET("search/users")
    Call<GitUsersResponse> searchUsers(@Query("q") String query);

    @GET("users/{u}/repos")
    Call<List<GitRepo>> userRepositories(@Path("u") String login);
}
