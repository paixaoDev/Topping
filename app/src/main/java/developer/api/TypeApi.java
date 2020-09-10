package developer.api;

import java.util.List;

import developer.models.TypeParentModel;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TypeApi {

    @GET("teste.json")
    Call<List<TypeParentModel>> getTypeJsonData();
}
