package com.linguamaestra.verbmaster;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import org.w3c.dom.Text;

public class ChooseLanguageDialogFragment extends DialogFragment {

    private Button frenchButton;
    private Button spanishButton;
    private Button portugueseButton;
    private Button italianButton;
    private Text chooseLanguageText;

    /**
     * Inflates the chooseLanguageDialogFragment's layout
     * @param inflater layout inflater
     * @param container view group to attach the fragment to
     * @param savedInstaceState previously saved state of the fragment
     * @return the view to display
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState){
        try{
            return inflater.inflate(R.layout.choose_language_fragment, container, false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public void onViewCreated(View view, Bundle savedInstanceState){
        try{
            super.onViewCreated(view, savedInstanceState);
            frenchButton = (Button)view.findViewById(R.id.frenchSelected);
            spanishButton = (Button)view.findViewById(R.id.spanishSelected);
            portugueseButton = (Button)view.findViewById(R.id.portugueseSelected);
            italianButton = (Button)view.findViewById(R.id.italianSelected);
            setupListeners();



        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void setupListeners(){
        ChooseLanguageListener listener = new ChooseLanguageListener();
        frenchButton.setOnClickListener(listener);
        spanishButton.setOnClickListener(listener);
        portugueseButton.setOnClickListener(listener);
        italianButton.setOnClickListener(listener);
    }



    private class ChooseLanguageListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            //((Button)view).getId();
            System.out.println("setting language");
            dismiss();
        }

    }
}
