package com.example.tp1_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import static com.example.tp1_1.data.Country.countries;

public class DetailFragment extends Fragment {


    int[] img = {R.drawable.ic_flag_of_france_320px,
            R.drawable.ic_flag_of_germany_320px,
            R.drawable.ic_flag_of_spain_320px,
            R.drawable.ic_flag_of_south_africa_320px,
            R.drawable.ic_flag_of_the_united_states_320px,
            R.drawable.ic_flag_of_japan_320px,
            R.drawable.ic_flag_of_china_320px,
            R.drawable.ic_flag_of_india_320px,
            R.drawable.ic_flag_of_brasil_320px
    };

    TextView itemDetailCountry;
    ImageView itemDetailFlag;
    TextView itemDetailCapital;
    TextView itemDetailLanguage;
    TextView itemDetailCurrency;
    TextView itemDetailPop;
    TextView itemDetailArea;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        itemDetailCountry = view.findViewById(R.id.item_detail_country);
        itemDetailFlag = view.findViewById(R.id.item_detail_flag);
        itemDetailCapital = view.findViewById(R.id.item_detail_capital);
        itemDetailLanguage = view.findViewById(R.id.item_detail_language);
        itemDetailCurrency = view.findViewById(R.id.item_detail_currency);
        itemDetailPop = view.findViewById(R.id.item_detail_pop);
        itemDetailArea = view.findViewById(R.id.item_detail_area);

        DetailFragmentArgs args = null;
        if (getArguments() != null) {
            args = DetailFragmentArgs.fromBundle(getArguments());
        }

        if (args != null) {
            itemDetailCountry.setText(countries[args.getCountryId()].getName());
            itemDetailCapital.setText(countries[args.getCountryId()].getCapital());
            itemDetailFlag.setImageResource(img[args.getCountryId()]);
            itemDetailLanguage.setText(countries[args.getCountryId()].getLanguage());
            itemDetailCurrency.setText(countries[args.getCountryId()].getCurrency());
            String tmp1 = "" + countries[args.getCountryId()].getPopulation();
            itemDetailPop.setText(tmp1);
            String tmp2 = countries[args.getCountryId()].getArea() + " Km²";
            itemDetailArea.setText(tmp2);
        }

        view.findViewById(R.id.button_detail_back).setOnClickListener(view1 -> NavHostFragment.findNavController(DetailFragment.this)
                .navigate(R.id.action_SecondFragment_to_FirstFragment));
    }
}