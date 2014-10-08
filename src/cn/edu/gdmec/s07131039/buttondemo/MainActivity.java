package cn.edu.gdmec.s07131039.buttondemo;

import android.location.GpsStatus.Listener;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements Listener{
    TextView myTextView;
    EditText myEditText;
    Button myBtu;
    ImageButton myImageBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myTextView = (TextView) findViewById(R.id.textView1);
		myEditText =(EditText) findViewById(R.id.editText1);
		myTextView.setText("hehehehehehe");
		myEditText.setText("xixixixixixi");
		myBtu = (Button) findViewById(R.id.button1);
		myBtu.setOnClickListener(buttonlister);
		myImageBtn = (ImageButton) findViewById(R.id.imageButton1);
		myImageBtn.setImageResource(R.drawable.sss);
	
	}
   Button.OnClickListener buttonlister = new Button.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		myTextView.setText("you have clicked the button");
		
	}
};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public void onGpsStatusChanged(int event) {
		// TODO Auto-generated method stub
		
	}

}
