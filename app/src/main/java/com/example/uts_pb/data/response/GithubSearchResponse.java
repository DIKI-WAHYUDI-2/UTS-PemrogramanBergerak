package com.example.uts_pb.data.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GithubSearchResponse {
    @SerializedName("items")
    private List<GithubUser> users;

    public List<GithubUser> getUsers() {
        return users;
    }
}
