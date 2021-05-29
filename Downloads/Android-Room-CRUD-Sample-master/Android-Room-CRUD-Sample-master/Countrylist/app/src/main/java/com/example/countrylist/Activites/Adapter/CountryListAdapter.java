package com.example.countrylist.Activites.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.pickanddrop.R;
import com.pickanddrop.dto.VehicalListDtO;
import com.pickanddrop.utils.AppConstants;
import com.pickanddrop.utils.AppSession;
import com.pickanddrop.utils.ImageViewCircular;
import com.pickanddrop.utils.OnItemClickListener;
import com.pickanddrop.utils.Utilities;

import java.util.ArrayList;

public class CountryListAdapter extends RecyclerView.Adapter<VehicalListAdapter.ViewHolder> implements AppConstants {
    private RequestOptions requestOptions;
    ArrayList<VehicalListDtO.Data> datadriver;
    private Context context;
    private AppSession appSession;
    private OnItemClickListener.OnItemClickCallback onItemClickCallback;
    private Utilities utilities;
    private OnItemClickListener.OnItemClickCallback driverlistOnclick;

    private OnItemClickListener.OnItemClickCallback relesevehicalOnclick;

    public CountryListAdapter(Context context, ArrayList<VehicalListDtO.Data> datadriver, OnItemClickListener.OnItemClickCallback onItemClickCallback, OnItemClickListener.OnItemClickCallback driverlistOnclick, OnItemClickListener.OnItemClickCallback relesevehicalOnclick){
        this.datadriver=datadriver;
        this.context = context;
        this.onItemClickCallback = onItemClickCallback;
        this.driverlistOnclick=driverlistOnclick;
        this.relesevehicalOnclick=relesevehicalOnclick;

        requestOptions = new RequestOptions();
        requestOptions.centerCrop();
        requestOptions.override(150, 150);
        requestOptions.placeholder(R.drawable.user_praba);
        requestOptions.error(R.drawable.user_praba);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vehical_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        viewHolder.tvtypeof.setText(context.getString(R.string.vihical_type) + " - " + datadriver.get(position).getVehicle_type());
        viewHolder.tvplatenum.setText(context.getString(R.string.vihical_plateno) + " - " + datadriver.get(position).getVehicle_reg_no());
        if(datadriver.get(position).getDriver_name()!=null){
            viewHolder.tvDrivername.setText(context.getString(R.string.vihical_avali) + " - " + datadriver.get(position).getDriver_name());
        }
        if(datadriver.get(position).getIs_assign()!=null && datadriver.get(position).getIs_assign().equalsIgnoreCase("0")){

            viewHolder.tvassgindriver.setText(context.getString(R.string.vihical_status) + " - " + "Not assigned");

           // viewHolder.tvviewrelese.setTextColor(Color.BLACK);
            viewHolder.tvviewrelese.setAlpha(Float.parseFloat("0.1"));
            viewHolder.tvviewdrivers.setAlpha(Float.parseFloat("1"));
            viewHolder.tvviewrelese.setEnabled(false);
           // viewHolder.tvviewdrivers.setTextColor(Color.WHITE);

            viewHolder.tvviewdrivers.setEnabled(true);

        }else if( datadriver.get(position).getIs_assign()!=null && datadriver.get(position).getIs_assign().equalsIgnoreCase("1")){
            viewHolder.tvassgindriver.setText(context.getString(R.string.vihical_status) + " - " + " Assigned");

            viewHolder.tvviewrelese.setEnabled(true);
         //   viewHolder.tvviewrelese.setTextColor(Color.WHITE);
            viewHolder.tvviewdrivers.setAlpha(Float.parseFloat("0.1"));
            viewHolder.tvviewrelese.setAlpha(Float.parseFloat("1"));

           // viewHolder.tvviewdrivers.setTextColor(Color.BLACK);
            viewHolder.tvviewdrivers.setEnabled(false);

        }
        if (datadriver.get(position).getStatus() != null && datadriver.get(position).getStatus().equalsIgnoreCase("1")) {
            viewHolder.status.setText(context.getString(R.string.driver_status) + " - " +"Active");


        }else if (datadriver.get(position).getStatus() != null && datadriver.get(position).getStatus().equalsIgnoreCase("0")) {

            viewHolder.status.setText(context.getString(R.string.driver_status) + " - " +"Deactivate");
        }


        viewHolder.ivedit.setOnClickListener(new OnItemClickListener(position, onItemClickCallback));
//driverlist
        viewHolder.tvviewdrivers.setOnClickListener(new OnItemClickListener(position, driverlistOnclick));
//relese drier
      /*  if(datadriver.get(position).getMaster_driver_id().equals(datadriver.get(position).getSub_driver_id())){
            viewHolder.tvviewrelese.setVisibility(View.GONE);
        }else{
            viewHolder.tvviewrelese.setVisibility(View.VISIBLE);
            viewHolder.tvviewrelese.setOnClickListener(new OnItemClickListener(position, relesevehicalOnclick));
        }*/
        viewHolder.tvviewrelese.setOnClickListener(new OnItemClickListener(position, relesevehicalOnclick));


/*        if(datadriver.get(position).getVehicle_image().replace("localhost", "192.168.1.32")!=null) {*/

            Glide.with(context)
                    .setDefaultRequestOptions(requestOptions)
                    .load(datadriver.get(position).getVehicle_image())
                    .into(viewHolder.ivProfile);

            viewHolder.tvviewdrivers.setOnClickListener(new OnItemClickListener(position, driverlistOnclick));

    }


    @Override
    public int getItemCount() {
        return datadriver.size();
    }
    protected class ViewHolder extends RecyclerView.ViewHolder {
            private TextView tvtypeof,tvplatenum,tvDrivername,tvassgindriver,ivedit,tvviewdrivers,tvviewrelese,status;
        private ImageViewCircular ivProfile;
      //  private ImageView ivedit;
        public ViewHolder( View itemView) {
            super(itemView);
            tvtypeof=(TextView)itemView.findViewById(R.id.tv_vihical_typetext);
            tvplatenum=(TextView)itemView.findViewById(R.id.tv_vihical_platenotext);
            tvDrivername=(TextView)itemView.findViewById(R.id.tv_vehicaldrivername);
            ivProfile=(ImageViewCircular)itemView.findViewById(R.id.iv_profile);
            ivedit=(TextView)itemView.findViewById(R.id.iv_edit);
            status=(TextView)itemView.findViewById(R.id.tv_driver_statustext);
            tvassgindriver=(TextView)itemView.findViewById(R.id.tv_avalible);
            tvviewdrivers=(TextView)itemView.findViewById(R.id.view_drivers);
            tvviewrelese=(TextView)itemView.findViewById(R.id.view_relese);

        }
    }

}
