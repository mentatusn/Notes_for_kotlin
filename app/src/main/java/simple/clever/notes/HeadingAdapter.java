package simple.clever.notes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeadingAdapter extends RecyclerView.Adapter<HeadingAdapter.ViewHolder> {

    private String[] noteHead;

    public HeadingAdapter(String[] noteHead) {
        this.noteHead = noteHead;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeadingAdapter.ViewHolder holder, int position) {
    holder.getTextHead().setText(noteHead[position]);
    }

    @Override
    public int getItemCount() {
        return noteHead.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textHead;
        private TextView textTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            textHead = (TextView) textHead;
        }

        public TextView getTextHead() {
            return textHead;
        }

        public TextView getTextTime() {
            return textTime;
        }
    }
}
