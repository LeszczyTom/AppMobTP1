package com.example.tp1_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.tp1_1.data.Country.countries;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    int[] img = new int[]{R.drawable.ic_flag_of_france_320px,
            R.drawable.ic_flag_of_germany_320px,
            R.drawable.ic_flag_of_spain_320px,
            R.drawable.ic_flag_of_south_africa_320px,
            R.drawable.ic_flag_of_the_united_states_320px,
            R.drawable.ic_flag_of_japan_320px,
            R.drawable.ic_flag_of_china_320px,
            R.drawable.ic_flag_of_india_320px,
            R.drawable.ic_flag_of_brasil_320px};

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.itemCountry.setText(countries[i].getName());
        viewHolder.itemCapital.setText(countries[i].getCapital());
        viewHolder.itemFlag.setImageResource(img[i]);
    }

    @Override
    public int getItemCount() {
        return countries.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemFlag;
        TextView itemCountry;
        TextView itemCapital;

        ViewHolder(View itemView) {
            super(itemView);
            itemFlag = itemView.findViewById(R.id.item_flag);
            itemCountry = itemView.findViewById(R.id.item_country);
            itemCapital = itemView.findViewById(R.id.item_capital);

           itemView.setOnClickListener(v -> {

               int position = getAdapterPosition();
               ListFragmentDirections.ActionFirstFragmentToSecondFragment action = ListFragmentDirections.actionFirstFragmentToSecondFragment(position);
               Navigation.findNavController(v).navigate(action);

           });
        }
    }

}