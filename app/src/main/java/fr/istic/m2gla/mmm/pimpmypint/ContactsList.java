package fr.istic.m2gla.mmm.pimpmypint;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

/**
 * Created by guerin on 24/03/16.
 */
public class ContactsList extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup,Bundle bundle){
        View view=layoutInflater.inflate(R.layout.fragment_contact,viewGroup,false);

        Button button=(Button)view.findViewById(R.id.button);
        button.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {

    }
}
