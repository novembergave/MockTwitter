package com.novembergave.apps.mocktwitter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by novembergave on 05/08/2017.
 */

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.TweetViewHolder> {

    private List<TweetObject> list;


    public class TweetViewHolder extends RecyclerView.ViewHolder {
        TextView accountName, accountHandle, time, message;
        ImageView verifiedAccount;

        public TweetViewHolder(View view) {
            super(view);
            accountName = (TextView) view.findViewById(R.id.list_account_name);
            accountHandle = (TextView) view.findViewById(R.id.list_account_handle);
            time = (TextView) view.findViewById(R.id.list_time);
            message = (TextView) view.findViewById(R.id.list_item_main_text);
            verifiedAccount = (ImageView) view.findViewById(R.id.list_verified_icon);

        }
    }


    public TweetAdapter(List<TweetObject> list) {
        this.list = list;
    }

    @Override
    public TweetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new TweetViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TweetViewHolder holder, int position) {
        TweetObject tweetObject = list.get(position);
        holder.accountName.setText(tweetObject.getAccountName());
        holder.accountHandle.setText(tweetObject.getAccountHandle());
        holder.verifiedAccount.setVisibility(tweetObject.isAccountVerification() ? View.VISIBLE : View.INVISIBLE);
        String time = String.valueOf(tweetObject.getTimeDifference()) + "ms";
        holder.time.setText(time);
        holder.message.setText(tweetObject.getMessage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
