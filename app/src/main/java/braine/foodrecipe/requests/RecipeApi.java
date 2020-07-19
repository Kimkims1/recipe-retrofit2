package braine.foodrecipe.requests;

import braine.foodrecipe.response.RecipeSearchResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public
interface RecipeApi {

    //SEARCH
    @GET("api/search")
    Call<RecipeSearchResponse> searchResponse(
            @Query("key") String key,
            @Query("q") String query,
            @Query("page") String page
    );
}
