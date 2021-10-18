package com.example.changesizetextnavigation.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.changesizetextnavigation.R;
import com.example.changesizetextnavigation.data.model.Message;
import com.example.changesizetextnavigation.databinding.FragmentViewMessageBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewMessageFragment# newInstance} factory method to
 * create an instance of this fragment.
 */
public class ViewMessageFragment extends Fragment {

    public static final String TAG = "ViewMessageFragment";
    private FragmentViewMessageBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentViewMessageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*Message message = (Message) getArguments().getSerializable("message");*/
        //Recoge el objeto enviado con safe args
        Message message = ViewMessageFragmentArgs.fromBundle(getArguments()).getMessage();
        binding.tvMessage.setText(message.getMessage());
        binding.tvMessage.setTextSize(message.getSize());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}