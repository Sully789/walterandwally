/*
Sean O'Sullivan K00180620 Walter and Wally Project

This Activity is where the user can view the Leaderboard
Currently only works locally with SQLite
*/

package com.example.sean.walterandwally;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LeaderboardActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editName, editScore, editTime, editHealth;
    Button btnAdd,btnDelete,btnModify,btnView,btnViewAll,btnShowInfo;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        Context context = this;
        String msg = "See how you stack up against other players.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();

        editName=(EditText)findViewById(R.id.editName);
        editScore =(EditText)findViewById(R.id.editScore);
        editTime =(EditText)findViewById(R.id.editTime);
        editHealth =(EditText)findViewById(R.id.editHealth);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnDelete=(Button)findViewById(R.id.btnDelete);
        btnModify=(Button)findViewById(R.id.btnModify);
        btnView=(Button)findViewById(R.id.btnView);
        btnViewAll=(Button)findViewById(R.id.btnViewAll);
        btnShowInfo=(Button)findViewById(R.id.btnShowInfo);
        btnAdd.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnModify.setOnClickListener(this);
        btnView.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnShowInfo.setOnClickListener(this);
        db=openOrCreateDatabase("walterandwallydb", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS player(name VARCHAR, score VARCHAR, time VARCHAR, health VARCHAR);");
    }
    public void onClick(View view)
    {
        if(view==btnAdd)
        {
            if(editName.getText().toString().trim().length()==0||
                    editScore.getText().toString().trim().length()==0||
                    editTime.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter all values");
                return;
            }
            db.execSQL("INSERT INTO player VALUES('"+editName.getText()+"','"+ editScore.getText()+
                    "','"+ editTime.getText()+"','"+ editHealth.getText()+"');");
            showMessage("Success", "Record added");
            clearText();
        }
        if(view==btnDelete)
        {
            if(editName.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM player WHERE name='"+editName.getText()+"'", null);
            if(c.moveToFirst())
            {
                db.execSQL("DELETE FROM player WHERE name='"+editName.getText()+"'");
                showMessage("Success", "Record Deleted");
            }
            else
            {
                showMessage("Error", "Invalid Name");
            }
            clearText();
        }
        if(view==btnModify)
        {
            if(editName.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM player WHERE name='"+editName.getText()+"'", null);
            if(c.moveToFirst())
            {
                db.execSQL("UPDATE player SET score='"+ editScore.getText()+"',time='"+ editTime.getText()+
                        "','"+ editHealth.getText()+"' WHERE name='"+editName.getText()+"'");
                showMessage("Success", "Record Modified");
            }
            else
            {
                showMessage("Error", "Invalid Name");
            }
            clearText();
        }
        if(view==btnView)
        {
            if(editName.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter Name");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM player WHERE name='"+editName.getText()+"'", null);
            if(c.moveToFirst())
            {
                editScore.setText(c.getString(1));
                editTime.setText(c.getString(2));
                editHealth.setText(c.getString(3));
            }
            else
            {
                showMessage("Error", "Invalid Name");
                clearText();
            }
        }
        if(view==btnViewAll)
        {
            Cursor c=db.rawQuery("SELECT * FROM player", null);
            if(c.getCount()==0)
            {
                showMessage("Error", "No records found");
                return;
            }
            StringBuffer buffer=new StringBuffer();
            while(c.moveToNext())
            {
                buffer.append("Name: "+c.getString(0)+"\n");
                buffer.append("Score: "+c.getString(1)+"\n");
                buffer.append("Time: "+c.getString(1)+"\n");
                buffer.append("Health: "+c.getString(2)+"\n\n");
            }
            showMessage("Leaderboard", buffer.toString());
        }
        if(view==btnShowInfo)
        {
            showMessage("Walter and Wally App", "Developed by Sean");
        }
    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void clearText()
    {
        editName.setText("");
        editScore.setText("");
        editTime.setText("");
        editHealth.setText("");
        editName.requestFocus();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}