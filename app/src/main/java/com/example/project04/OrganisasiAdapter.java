package com.example.project04;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;





    public class OrganisasiAdapter extends RecyclerView.Adapter<OrganisasiAdapter.OrganisasiViewHolder> {
        private ArrayList<Organisasi> dataList;
        public OrganisasiAdapter(ArrayList<Organisasi> dataList) {
            this.dataList = dataList;
        }
        @NonNull
        @Override
        public OrganisasiAdapter.OrganisasiViewHolder
        onCreateViewHolder(@NonNull
                                   ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.arknight, parent, false);
            return new OrganisasiViewHolder(view);
        }
        public void onBindViewHolder(OrganisasiViewHolder holder, int position) {
            holder.Gambar.setImageResource(dataList.get(position).getGambar());
            holder.txtOrganisasi.setText(dataList.get(position).getOrganisasi());
            holder.txtNegara.setText(dataList.get(position).getNegara());
            holder.txtUnit.setText(dataList.get(position).getUnit());
        }
        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }
        public class OrganisasiViewHolder extends RecyclerView.ViewHolder{
            private TextView txtOrganisasi, txtNegara, txtUnit;
            private ImageView Gambar;
            public OrganisasiViewHolder(View itemView) {
                super(itemView);
                Gambar = (ImageView) itemView.findViewById(R.id.gambar);
                txtOrganisasi = (TextView)itemView.findViewById(R.id.txt_organisasi);
                txtNegara = (TextView) itemView.findViewById(R.id.txt_negara);
                txtUnit = (TextView) itemView.findViewById(R.id.txt_unit);
            }

    }

}
