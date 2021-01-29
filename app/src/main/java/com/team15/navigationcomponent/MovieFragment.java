package com.team15.navigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MovieFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Bundle bundle = new Bundle();
        bundle.putString("text", "test");

        final NavController navController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);
        view.findViewById(R.id.button).setOnClickListener(v -> {
            navController.navigate(R.id.action_menu_movie_to_movieDetailsFragment, bundle);
        });
    }
}