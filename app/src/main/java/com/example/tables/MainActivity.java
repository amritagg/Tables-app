package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTable(View view){

        EditText tableNumber = findViewById(R.id.table_number);
        String tableString = String.valueOf(tableNumber.getText());

        EditText tableQuantity = findViewById(R.id.table_quantity);
        String quantityString = String.valueOf(tableQuantity.getText());

        String table = "";

        if( !tableString.isEmpty() && !quantityString.isEmpty()){
            int numberOfTable = Integer.parseInt(String.valueOf(tableNumber.getText()));
            int tableUpto = Integer.parseInt(String.valueOf(tableQuantity.getText()));

            for(int i = 1;  i <= tableUpto; i++){
                table += numberOfTable + " X " + i + " = " + numberOfTable*i + "\n";
            }

            TextView tableView = findViewById(R.id.table);
            tableView.setText(table);

        }else if(tableString.isEmpty() && !quantityString.isEmpty()){
            Toast.makeText(this, "You need to add the value of the Table", Toast.LENGTH_SHORT).show();
        }else if(!tableString.isEmpty()){
            Toast.makeText(this, "You need to add the value Upto which you want your Table", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "You need to add the details for the Table", Toast.LENGTH_SHORT).show();
        }

    }
}