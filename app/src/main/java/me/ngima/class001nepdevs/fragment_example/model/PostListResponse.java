
package me.ngima.class001nepdevs.fragment_example.model;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;

public class PostListResponse {

    @SerializedName("data")
    public List<PostModel> mData;
    @SerializedName("message")
    public String mMessage;
    @SerializedName("success")
    public Boolean mSuccess;
    
    public static PostListResponse parseFromJson(String json){
        try{
            return new Gson().fromJson(json, PostListResponse.class);
        }catch (JsonSyntaxException e){

            return null;
        }
    }
}
