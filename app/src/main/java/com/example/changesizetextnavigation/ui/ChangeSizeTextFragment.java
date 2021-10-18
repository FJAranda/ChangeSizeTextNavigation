package com.example.changesizetextnavigation.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.changesizetextnavigation.R;
import com.example.changesizetextnavigation.data.model.Message;
import com.example.changesizetextnavigation.databinding.FragmentChangeSizeTextBinding;
import com.example.changesizetextnavigation.databinding.FragmentViewMessageBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChangeSizeTextFragment# newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChangeSizeTextFragment extends Fragment {

    public static final String TAG = "ChangeSizeTextFragment";
    private FragmentChangeSizeTextBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentChangeSizeTextBinding.inflate(inflater, container, false);
        return binding.getRoot();


    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnSend.setOnClickListener(v -> {

            //Si estamos desde un fragment se accede al navcontroller con la siguiente llamada.
            //NavHostFragment.findNavController(this).navigate(R.id.action_changeSizeTextFragment_to_viewMessageFragment);

            //Pasar la informacion mediante un bundle como argumento
            /*Bundle bundle = new Bundle();
            Message message = new Message(binding.edMessage.getText().toString(), binding.skSize.getProgress());
            bundle.putSerializable("message", message);
            NavHostFragment.findNavController(this).navigate(R.id.action_changeSizeTextFragment_to_viewMessageFragment, bundle);*/

            Message message = new Message(binding.edMessage.getText().toString(), binding.skSize.getProgress());
            //Creamos la accion y le asignamos el objeto
            ChangeSizeTextFragmentDirections.ActionChangeSizeTextFragmentToViewMessageFragment action = ChangeSizeTextFragmentDirections.actionChangeSizeTextFragmentToViewMessageFragment(message);
            //Añadimos el action al nav controlles
            NavHostFragment.findNavController(this).navigate(action);
        });
        Log.d(TAG,"ChangeSizeTextFragment -> onViewCreated()");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Usando el componente navigation esto no es necesario
        //setRetainInstance(true);
        Log.d(TAG,"ChangeSizeTextFragment -> onCreate()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        Log.d(TAG,"ChangeSizeTextFragment -> onAttach()");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        Log.d(TAG,"ChangeSizeTextFragment -> onDestroyView()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,"ChangeSizeTextFragment -> onDetach()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"ChangeSizeTextFragment -> onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"ChangeSizeTextFragment -> onPause()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ChangeSizeTextFragment -> onDestroy()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"ChangeSizeTextFragment -> onStart()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"ChangeSizeTextFragment -> onStop()");
    }
}