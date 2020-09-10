package developer.repository;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import developer.models.utils.ErrorModel;
import developer.models.utils.MessageModel;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainRepository {

    Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    OkHttpClient client = new OkHttpClient.Builder()
            //here we adding Interceptor for full level logging
            .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build();


    protected Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://sampletestingproject-4a8fc.web.app/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build();

    public interface AsyncResponse <T> {
        void onSucess (T response);
        void onMessage (MessageModel message);
        void onError (ErrorModel error);
    }
}
