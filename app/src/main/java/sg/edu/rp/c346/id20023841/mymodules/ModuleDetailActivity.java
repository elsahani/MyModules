package sg.edu.rp.c346.id20023841.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvName,tvCode,tvyear,tvsem,tvmodcredit,tvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("Module");

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvyear = findViewById(R.id.textViewYear);
        tvsem = findViewById(R.id.textViewSem);
        tvmodcredit = findViewById(R.id.textViewCredit);
        tvv = findViewById(R.id.textViewVenue);

        if(moduleSelected.equals("C203")){
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Web App Development in php");
            tvyear.setText("Semester: 2021");
            tvsem.setText("Semester: 1");
            tvmodcredit.setText("Module Credit: 4");
            tvv.setText("Venue: W67L");
        }

        else if(moduleSelected.equals("C228")){
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Android Programming");
            tvyear.setText("Semester: 2021");
            tvsem.setText("Semester: 1");
            tvmodcredit.setText("Module Credit: 4");
            tvv.setText("Venue: E62E");
        }

        else if(moduleSelected.equals("C328")){
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Intelligent Network");
            tvyear.setText("Semester: 2021");
            tvsem.setText("Semester: 1");
            tvmodcredit.setText("Module Credit: 4");
            tvv.setText("Venue: E62C");
        }

        else if(moduleSelected.equals("C331")){
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Digital Security and Forensics");
            tvyear.setText("Semester: 2021");
            tvsem.setText("Semester: 1");
            tvmodcredit.setText("Module Credit: 4");
            tvv.setText("Venue: E62C");
        }

        else if(moduleSelected.equals("C346")){
            tvCode.setText("Module Code: " + moduleSelected);
            tvName.setText("Module Name: Mobile App Development");
            tvyear.setText("Semester: 2021");
            tvsem.setText("Semester: 1");
            tvmodcredit.setText("Module Credit: 4");
            tvv.setText("Venue: E62C");
        }



    }
}