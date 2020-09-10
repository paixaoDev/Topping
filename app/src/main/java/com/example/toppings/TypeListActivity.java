package com.example.toppings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

import developer.adapters.SimpleListAdapter;
import developer.models.TypeModel;
import developer.utils.MergeToppingList;
import developer.vmodels.TypeViewModel;

public class TypeListActivity extends MainActivity {

    private ViewHolder mHolder;
    private TypeViewModel mTypeViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_list);
        mHolder = new ViewHolder();

        //Log.d("Test", "result:" + Arrays.toString(new MergeToppingList().rotacaoEsquerda(new int[]{1, 2, 3, 4, 5}, 2)));
        Log.d("Test", "result:" + new MergeToppingList().listarCarros());

    }

    @Override
    public void bindViewModel() {
        super.bindViewModel();
        mTypeViewModel = new ViewModelProvider(this).get(TypeViewModel.class);
        mTypeViewModel.getToppingData().observe(this, this::showToppingList);

    }

    @Override
    public void unBindViewModel() {
        super.unBindViewModel();
        mTypeViewModel.getToppingData().removeObserver(this::showToppingList);
    }


    public void showToppingList(List<TypeModel> list){
        SimpleListAdapter adapter = new SimpleListAdapter(activity, list);
        mHolder.recyclerView.setAdapter(adapter);
        mHolder.recyclerView.setLayoutManager(new LinearLayoutManager(activity, RecyclerView.VERTICAL, false));
    }

    class ViewHolder {
        RecyclerView recyclerView;
        public ViewHolder (){
            recyclerView = findViewById(R.id.recycler_list);
        }
    }
}