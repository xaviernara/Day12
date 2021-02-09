package com.example.myapplication.repo;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.CountryRecyclerBinding;
import com.example.myapplication.view.MainActivity;
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou;
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYouListener;

import java.util.List;

public class CountryAdapter {

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

    public static class CountryAdaptor extends RecyclerView.Adapter<CountryAdaptor.CountryViewHolder> {

        private final List<CountryResponse> countryResponsesList;
        CountryRecyclerBinding binding;

        public CountryAdaptor(List<CountryResponse> countryResponsesList) {
            this.countryResponsesList = countryResponsesList;
        }


        /**
         * Called when RecyclerView needs a new {@link ViewHolder} of the given type to represent
         * an item.
         * <p>
         * This new ViewHolder should be constructed with a new View that can represent the items
         * of the given type. You can either create a new View manually or inflate it from an XML
         * layout file.
         * <p>
         * The new ViewHolder will be used to display items of the adapter using
         * {@link #onBindViewHolder(ViewHolder, int, List)}. Since it will be re-used to display
         * different items in the data set, it is a good idea to cache references to sub views of
         * the View to avoid unnecessary {@link View#findViewById(int)} calls.
         *
         * @param parent   The ViewGroup into which the new View will be added after it is bound to
         *                 an adapter position.
         * @param viewType The view type of the new View.
         * @return A new ViewHolder that holds a View of the given view type.
         * @see #getItemViewType(int)
         * @see #onBindViewHolder(ViewHolder, int)
         */
        @NonNull
        @Override
        public CountryAdaptor.CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        /*
         * Called by RecyclerView to display the data at the specified position. This method should
         * update the contents of the {@link ViewHolder#itemView} to reflect the item at the given
         * position.
         * <p>
         * Note that unlike {@link ListView}, RecyclerView will not call this method
         * again if the position of the item changes in the data set unless the item itself is
         * invalidated or the new position cannot be determined. For this reason, you should only
         * use the <code>position</code> parameter while acquiring the related data item inside
         * this method and should not keep a copy of it. If you need the position of an item later
         * on (e.g. in a click listener), use {@link ViewHolder#getAdapterPosition()} which will
         * have the updated adapter position.
         * <p>
         * Override {@link #onBindViewHolder(ViewHolder, int, List)} instead if Adapter can
         * handle efficient partial bind.
         *
         * @param holder   The ViewHolder which should be updated to represent the contents of the
         *                 item at the given position in the data set.
         * @param position The position of the item within the adapter's data set.
         */
        @Override
        public void onBindViewHolder(@NonNull CountryAdaptor.CountryViewHolder holder, int position) {

            holder.setCapital(countryResponsesList.get(position).getCapitalCity().getCapital());



        }

        /**
         * Returns the total number of items in the data set held by the adapter.
         *
         * @return The total number of items in this adapter.
         */
        @Override
        public int getItemCount() {
            return 0;
        }



        //---------------------- View holder class--------------------------

        public static class CountryViewHolder extends RecyclerView.ViewHolder{

            CountryRecyclerBinding binding;


            public CountryViewHolder(@NonNull CountryRecyclerBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }


            //loading SVG's in Android with Glide
            //https://reposhub.com/android/imageview/corouteam-GlideToVectorYou.html
            public void setImageUrl(String imageUrl){

                //GlideToVectorYou.justLoadImage(activity, IMAGE_URI, targetImageView)

                //GlideToVectorYou.justLoadImage(, imageUrl, binding.flagImage);
                GlideToVectorYou
                        .init()
                        .with(binding.getRoot().getContext())
                        .withListener(new GlideToVectorYouListener() {
                            @Override
                            public void onLoadFailed() {
                                Toast.makeText(binding.getRoot().getContext(), "Load failed", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onResourceReady() {
                                Toast.makeText(binding.getRoot().getContext(), "Image ready", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .load(Uri.parse(imageUrl), binding.flagImage);

            }

            public void setName(String name){
                binding.nameText.setText(name);
            }

            public void setCurrency(String currency){
                binding.currenyText.setText(currency);
            }

            public void setLanguage(String language){
                binding.languageText.setText(language);
            }

            public void setCapital(String capital){

                binding.captialText.setText(capital);
            }

            public void setRegion(String region){

                binding.regionText.setText(region);
            }








        }
    }
}

/*
*
*
*
* */
