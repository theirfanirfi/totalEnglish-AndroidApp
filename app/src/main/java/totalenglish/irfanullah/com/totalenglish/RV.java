package totalenglish.irfanullah.com.totalenglish;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RV extends RecyclerView.Adapter<RV.MyViewHolder> implements View.OnClickListener {
    private Context context;
    private String[] mData;

    public RV(String[] data, Context context)
    {
        this.context = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public RV.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle,viewGroup,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RV.MyViewHolder myViewHolder, int i) {
        String name = mData[i];
        myViewHolder.textView.setText(name);

    }

    @Override
    public int getItemCount() {
        return this.mData.length;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context,"working", Toast.LENGTH_LONG).show();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txt);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),textView.getText().toString(), Toast.LENGTH_LONG).show();
                }
            });

        }


    }
}
