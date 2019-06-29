package org.techtown.diary;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView ivname, ivnumber;

    public PostViewHolder(View itemView) {
        super(itemView);
        ivname= itemView.findViewById(R.id.name);
        ivnumber= itemView.findViewById(R.id.phonenumber);
    }
}

