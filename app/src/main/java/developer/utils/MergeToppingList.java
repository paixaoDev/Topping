package developer.utils;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import developer.models.TypeModel;
import developer.models.TypeParentModel;

public class MergeToppingList {

    public List<TypeModel> merge (List<TypeParentModel> parentModels){
        List<TypeModel> result = new ArrayList<>();
        for(TypeParentModel parent: parentModels){
            if(parent.getTopping() != null && parent.getTopping().size() > 0){
                result.addAll(parent.getTopping());
            }
        }
        return result;
    }
}
