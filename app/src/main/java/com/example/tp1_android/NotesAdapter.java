package com.example.tp1_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NotesAdapter extends ArrayAdapter<Notes> {
    public NotesAdapter(Context context, List<Notes> notes) {
        super(context, 0, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.notes_line, parent, false);
        }

        Notes notes = getItem(position);

        TextView validationView = convertView.findViewById(R.id.txt_validation);
        validationView.setText("Validation: " + notes.getValidation());

        TextView matiereView = convertView.findViewById(R.id.txt_matiere);
        matiereView.setText("Matiere: " + notes.getMatiere());

        TextView noteView = convertView.findViewById(R.id.txt_note);
        noteView.setText("Note: " + notes.getNote());

        return convertView;
    }
}
