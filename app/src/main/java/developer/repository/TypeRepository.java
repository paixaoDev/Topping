package developer.repository;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import developer.api.TypeApi;
import developer.models.TypeParentModel;
import developer.models.utils.ErrorModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TypeRepository extends MainRepository{

    private AsyncResponse<List<TypeParentModel>> asyncResponse;

    public void getTypeList(AsyncResponse<List<TypeParentModel>> response){
        this.asyncResponse = response;
        getTypeList();
    }

    private void getTypeList (){
        TypeApi typeApi = retrofit.create(TypeApi.class);
        typeApi.getTypeJsonData().enqueue(new Callback<List<TypeParentModel>>() {
            @Override
            public void onResponse(@NotNull Call<List<TypeParentModel>> call, @NotNull Response<List<TypeParentModel>> response) {
                asyncResponse.onSucess(response.body());
            }

            @Override
            public void onFailure(Call<List<TypeParentModel>> call, Throwable t) {
                asyncResponse.onError(new ErrorModel(0, t.getMessage()));
            }
        });
    }
}
