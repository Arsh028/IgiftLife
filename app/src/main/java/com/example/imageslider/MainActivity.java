package com.example.imageslider;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Slider Layout (starting here -->>>>>>>>

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(2);
        setSliderViews();

        //Slider Layout  (Ending here.........................)

        //Buttons OnClickListeners (Starting here  --->>>>>>>>>>>>>

        Button button1 = (Button) findViewById(R.id.organbutton);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)   {
                openMainActivity3();
            }
        });


        //Buttons OnClickListeners (Ending here ........................)


        FloatingActionButton fab1=findViewById(R.id.fab_action1);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://igiftlife.com/frequently-asked-questions/"));
                startActivity(browserIntent);
            }
        });

        FloatingActionButton fab2=findViewById(R.id.fab_action2);

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://igiftlife.com/"));
                startActivity(browserIntent);
            }
        });

        FloatingActionButton fab3=findViewById(R.id.fab_action3);

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://igiftlife.com/volunteer/"));
                startActivity(browserIntent);
            }
        });
    }


    private void setSliderViews()  {

        for(int i = 1 ; i <= 6 ; i++){

            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch(i)  {

                case 1:
                    sliderView.setDescription("Think about it!!");
                    sliderView.setImageDrawable(R.drawable.rsz_4billion);
                    break;

                case 2:
                    sliderView.setDescription("2nd Batch - SIMS");
                    sliderView.setImageDrawable(R.drawable.sims);
                    break;

                case 3:
                    sliderView.setDescription("3rd Batch - SCMS");
                    sliderView.setImageDrawable(R.drawable.scms);
                    break;

                case 4:
                    sliderView.setDescription("4th Batch - SIHS");
                    sliderView.setImageDrawable(R.drawable.sihs);
                    break;

                case 5:
                    sliderView.setDescription("5th Batch - SIT");
                    sliderView.setImageDrawable(R.drawable.sit2);
                    break;

                case 6:
                    sliderView.setDescription("6th Batch - BJ Medical College");
                    sliderView.setImageDrawable(R.drawable.bjmc);
                    break;

            }

            //This is for the Toast and the  Slider Image Description of the Image Slider

            /*sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderView.setDescription("setDescription " + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView)  {
                    Toast.makeText(MainActivity.this, "This is a slider" + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });  */

            sliderLayout.addSliderView(sliderView);
        }
    }


    public void openMainActivity3(){
        Intent intent = new Intent(this , MainActivity3.class);
        startActivity(intent);
    }

    public void brainbutton(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/y-ycVBrQW7E"));
        startActivity(browserIntent);
    }

    public void chatbutton(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://console.dialogflow.com/api-client/demo/embedded/igiftlife"));
        startActivity(browserIntent);
    }

    public void pledgebutton(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://igiftlife.com/register-for-organ-donation"));
        startActivity(browserIntent);
    }

    public void explore(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCPdI8ehOTCNEks1M0xsAEdA/playlists"));
        startActivity(browserIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
                if (item.getItemId() == R.id.item1) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/igiftlife/"));
                    startActivity(browserIntent);
                    return true;
                }
                else if (item.getItemId() == R.id.item2) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/igiftlife/"));
                    startActivity(browserIntent);
                    return true;
                }
                else if (item.getItemId() == R.id.item3) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://igiftlife.com/blog/"));
                    startActivity(browserIntent);
                    return true;
                }
                else if (item.getItemId() == R.id.item4) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://igiftlife.com/contact-us/"));
                    startActivity(browserIntent);
                    return true;
                }
                else if(item.getItemId() == R.id.item5){
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    return true;
                }


                return super.onOptionsItemSelected(item);

    }

}
