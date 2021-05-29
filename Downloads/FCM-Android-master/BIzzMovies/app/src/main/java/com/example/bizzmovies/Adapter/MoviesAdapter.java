package com.example.bizzmovies.Adapter;

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
import com.pickanddrop.dto.BankProfileDTO;
import com.pickanddrop.dto.DeliveryDTO;
import com.pickanddrop.utils.AppConstants;
import com.pickanddrop.utils.AppSession;
import com.pickanddrop.utils.ImageViewCircular;
import com.pickanddrop.utils.OnItemClickListener;
import com.pickanddrop.utils.Utilities;

import java.util.ArrayList;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<AllBankDetilas.ViewHolder> implements AppConstants {

    private RequestOptions requestOptions;
    List<BankProfileDTO.Datup> datadriver;
    private Context context;
    private AppSession appSession;
    private OnItemClickListener.OnItemClickCallback onItemClickCallback;
    private Utilities utilities;
    private ArrayList<DeliveryDTO.Data> deliveryDTOArrayList;
    private String buttonname;

    public MoviesAdapter(Context context, List<BankProfileDTO.Datup> datadriver){
        this.datadriver=datadriver;
        this.context = context;
        this.onItemClickCallback = onItemClickCallback;
        this.buttonname=buttonname;
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
                .inflate(R.layout.driver_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.ivedit.setText(buttonname);

viewHolder.ivedit.setVisibility(View.GONE);
        viewHolder.divername.setText("Account Name" + " - " + datadriver.get(position).getAccount_name());//account name
        viewHolder.driveremail.setText("Account Number" + " - " + datadriver.get(position).getAccount_number());//account number
        viewHolder.mobilemno.setText("Swift Code" + " - " + datadriver.get(position).getSwift_code());//shit code
            viewHolder.status.setText("Routing Number" + " - " + datadriver.get(position).getRouting_number());//routing number
            viewHolder.driver_assined.setText("Bank Address" + " - " + datadriver.get(position).getAddress());//local addres
       viewHolder. tvvdriver.setText("Driver Name" + " - " + datadriver.get(position).getFname() +" "+ datadriver.get(position).getLname());//local addres
        if (datadriver.get(position).getProfile_image()!=null&&datadriver.get(position).getProfile_image().replace("localhost", "192.168.1.32") != null) {
           Glide.with(context)
                   .setDefaultRequestOptions(requestOptions)
                   .load(datadriver.get(position).getProfile_image().replace("localhost", "192.168.1.32"))
                   .into(viewHolder.ivProfile);
       } else {
          System.out.println("akdjf");
       }
    }

    @Override
    public int getItemCount() {
        return datadriver.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {
        private TextView divername,driveremail,mobilemno,status,driver_assined,ivedit,tvvdriver;
        private ImageViewCircular ivProfile;
        //   private ImageView ivedit;
        public ViewHolder( View itemView) {
            super(itemView);

            divername=(TextView)itemView.findViewById(R.id.tv_drive_nametext);
            tvvdriver=(TextView)itemView.findViewById(R.id.tv_drivernamee);
            driveremail   =(TextView)itemView.findViewById(R.id.tv_driver_emailtext);
            mobilemno=(TextView)itemView.findViewById(R.id.tv_driver_mobiletext);
            status=(TextView)itemView.findViewById(R.id.tv_driver_statustext);
            driver_assined=(TextView)itemView.findViewById(R.id.tv_driver_assined) ;
            ivProfile=(ImageViewCircular)itemView.findViewById(R.id.iv_profile);
            ivedit=(TextView) itemView.findViewById(R.id.iv_edit);

    }
}

}
