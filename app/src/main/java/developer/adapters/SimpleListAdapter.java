package developer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.toppings.R;

import java.util.List;

import developer.models.TypeModel;

public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.ViewHolder> {
    Context context;
    List<TypeModel> modelList;

    public SimpleListAdapter(Context context, List<TypeModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_simple_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TypeModel topping = modelList.get(position);
        holder.idText.setText(topping.getId());
        holder.typeText.setText(topping.getType());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView idText;
        TextView typeText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idText = itemView.findViewById(R.id.txt_id);
            typeText = itemView.findViewById(R.id.txt_type);
        }
    }
}
