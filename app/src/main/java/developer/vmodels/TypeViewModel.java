package developer.vmodels;

import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import developer.models.TypeModel;
import developer.models.TypeParentModel;
import developer.models.utils.ErrorModel;
import developer.models.utils.MessageModel;
import developer.repository.MainRepository;
import developer.repository.TypeRepository;
import developer.utils.MergeToppingList;

public class TypeViewModel extends ViewModel {

    MutableLiveData<List<TypeParentModel>> mParentType;
    MutableLiveData<List<TypeModel>> mTypeTopping;

    public LiveData<List<TypeModel>> getToppingData (){
        if(mTypeTopping == null){
            mTypeTopping = new MutableLiveData<>();
            getTypeParent();
        }
        return mTypeTopping;
    }

    private void getTypeParent (){
        new TypeRepository().getTypeList(new MainRepository.AsyncResponse<List<TypeParentModel>>() {
            @Override
            public void onSucess(List<TypeParentModel> response) {
                if(mParentType == null){
                    mParentType = new MutableLiveData<>();
                }

                mParentType.postValue(response);
                mTypeTopping.postValue(new MergeToppingList().merge(response));
            }

            @Override
            public void onMessage(MessageModel message) {
                //Deixei nulo por saber que nesse caso não irei receber esse tipo de valor
            }

            @Override
            public void onError(ErrorModel error) {
                //Deixei nulo por saber que nesse caso não irei receber esse tipo de valor
            }
        });
    }
}
