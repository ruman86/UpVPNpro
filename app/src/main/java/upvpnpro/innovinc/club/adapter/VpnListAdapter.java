package upvpnpro.innovinc.club.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

import upvpnpro.innovinc.club.R;
import upvpnpro.innovinc.club.model.VpnCountryList;

public class VpnListAdapter extends RecyclerView.Adapter<VpnListAdapter.Viewholder> {

    private List<VpnCountryList> vpnCountryLists;
    private Context context;
    public VpnListAdapter(List<VpnCountryList> vpnCountryLists,Context context){
        this.vpnCountryLists = this.vpnCountryLists;
        this.context = context;
    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.countrylist, parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.tvCountryName.setText(vpnCountryLists.get(position).getNameofcntry());
        holder.tvConnectmsc.setText(vpnCountryLists.get(position).getIpaddr());
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(vpnCountryLists.get(position).getCntryflag())
                .placeholder((R.drawable.circuler_shape_bg)).error(R.drawable.circuler_shape_bg)
                .into(holder.flagimage);
    }

    @Override
    public int getItemCount() {
        return vpnCountryLists.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
        TextView tvCountryName, tvConnectmsc;
        ImageView flagimage;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            tvCountryName = itemView.findViewById(R.id.textCountryName);
            tvConnectmsc = itemView.findViewById(R.id.textCountryName);
            flagimage = itemView.findViewById(R.id.flagimage);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
