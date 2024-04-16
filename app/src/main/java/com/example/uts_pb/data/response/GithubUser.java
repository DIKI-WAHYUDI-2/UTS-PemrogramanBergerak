package com.example.uts_pb.data.response;

import com.google.gson.annotations.SerializedName;

public class GithubUser {
    @SerializedName("login")
    private String username;
    @SerializedName("avatar_url")
    private String avatarUrl;
    private String name;
    private String bio;

    public String getUsername() {
        return username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}

