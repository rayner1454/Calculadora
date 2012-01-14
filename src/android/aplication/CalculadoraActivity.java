package android.aplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
public class CalculadoraActivity extends Activity {
    private EditText et1,et2;
    private TextView tv3;
    private RadioButton r1,r2,r3,r4;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
        r3=(RadioButton)findViewById(R.id.r3);
        r4=(RadioButton)findViewById(R.id.r4);
    }
    public void operar(View view)
    {
    	String val1=et1.getText().toString();
    	String val2=et2.getText().toString();
    	double n1=Double.parseDouble(val1);
    	double n2=Double.parseDouble(val2);
    	if(r1.isChecked()==true)
    	{
    		double suma=n1+n2;
    		String resu=String.valueOf(suma);
    		tv3.setText(resu);
    	}else
    	{
    		if(r2.isChecked()==true)
    		{
    			double resta=n1-n2;
        		String resu=String.valueOf(resta);
        		tv3.setText(resu);
    		}
    		else
    			if(r3.isChecked()==true)
        		{
        			double multi=n1*n2;
            		String resu=String.valueOf(multi);
            		tv3.setText(resu);
        		}else
        		{if(r4.isChecked()==true)
        		{
        			double div=n1/n2;
            		String resu=String.valueOf(div);
            		tv3.setText(resu);
        		}
        			
        		}
    	}
    	}
}