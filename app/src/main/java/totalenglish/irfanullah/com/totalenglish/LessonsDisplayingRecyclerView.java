package totalenglish.irfanullah.com.totalenglish;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LessonsDisplayingRecyclerView extends RecyclerView.Adapter<LessonsDisplayingRecyclerView.LessonsViewHolder> {

    private Context context;
    private List<Lessons> lessons;

    public LessonsDisplayingRecyclerView(Context context, List<Lessons> lessons) {
        this.context = context;
        this.lessons = lessons;
    }

    @NonNull
    @Override
    public LessonsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.lessons_row,viewGroup,false);
        LessonsViewHolder lessonsViewHolder = new LessonsViewHolder(view, this.lessons, this.context);
        return lessonsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LessonsViewHolder lessonsViewHolder, int i) {
        lessonsViewHolder.lessonTitle.setText(this.lessons.get(i).getLESSON_TITLE());
    }

    @Override
    public int getItemCount() {
        return this.lessons.size();
    }


    public static class LessonsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView lessonTitle;
        ConstraintLayout layout;
        List<Lessons> lessons;
        Context context;
        public LessonsViewHolder(@NonNull View itemView,List<Lessons> lessons, Context context) {
            super(itemView);
            this.lessons = lessons;
            this.context = context;
             lessonTitle = itemView.findViewById(R.id.lessonTitle);
             layout = itemView.findViewById(R.id.lessonRecycleViewLayout);
             layout.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int id = v.getId();
            String name = lessons.get(getLayoutPosition()).getLESSON_TITLE();
            if(id == R.id.lessonRecycleViewLayout)
            {
                Intent lessonDetail = new Intent(this.context,LessonDetail.class);
                this.context.startActivity(lessonDetail);
            }
        }
    }
}
