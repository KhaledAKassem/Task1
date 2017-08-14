package es.esy.kassem.task1;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    TextView t1,t2,status,married;
    TextView oo,ooo,oooo,ooooo;
    Spinner s1,s2,s3;
    CheckBox ck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.text1);
        t2=(TextView) findViewById(R.id.text2);
        status=(TextView) findViewById(R.id.textView5);
        oo=(TextView) findViewById(R.id.oo);
        ooo=(TextView) findViewById(R.id.ooo);
        oooo=(TextView) findViewById(R.id.oooo);
        ooooo=(TextView) findViewById(R.id.ooooo);
        ck=(CheckBox) findViewById(R.id.checkBox2);
                      //Spinners
        s1=(Spinner) findViewById(R.id.spinner4);
        s2=(Spinner) findViewById(R.id.spinner5);
        s3=(Spinner) findViewById(R.id.spinner6);
        Typeface t= Typeface.createFromAsset(getAssets(),"fonts/andlso.ttf");
        t1.setTypeface(t);
        t2.setTypeface(t);
        status.setTypeface(t);
        List<String> days=new ArrayList<>();
        List<String> months=new ArrayList<>();
        List<String> years=new ArrayList<>();
        days.add("Days");days.add("2");days.add("3");
        days.add("4");days.add("5");days.add("6");
        days.add("7");days.add("8");days.add("9");
        days.add("10");days.add("11");days.add("12");
        days.add("13");days.add("14");days.add("15");
        days.add("16");days.add("17");days.add("18");
        days.add("19");days.add("20");days.add("21");
        days.add("22");days.add("23");days.add("24");
        days.add("25");days.add("26");days.add("27");
        days.add("28");days.add("29");days.add("30");
        //------------------------------------------------//
        months.add("months"); months.add("2"); months.add("3");
        months.add("4"); months.add("5"); months.add("6");
        months.add("7"); months.add("8"); months.add("9");
        months.add("10"); months.add("11"); months.add("12");
        //-------------------------------------------------//
        years.add("year");years.add("2001");years.add("2002");
        years.add("2003");years.add("2012");years.add("2013");
        years.add("2004");years.add("2011");years.add("2014");
        years.add("2005");years.add("2010");years.add("2015");
        years.add("2006");years.add("2009");years.add("2016");
        years.add("2007");years.add("2008");years.add("2017");
        //================================================///

        ArrayAdapter<String> dayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,days);
        ArrayAdapter<String> monthadapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,months);
        ArrayAdapter<String> yearadapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,years);
      s1.setAdapter(dayadapter);
        s2.setAdapter(monthadapter);
        s3.setAdapter(yearadapter);
        oo.setTypeface(t);
        ooo.setTypeface(t);
        oooo.setTypeface(t);
        ooooo.setTypeface(t);
        ck.setTypeface(t);






    }
}
