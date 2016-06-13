package jesus.mascotas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView dog,cat,turtle,fish;
    int doglike=0;
    int catlike;
    int turtlelike;
    int fishlike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miactionbar=(Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(miactionbar);
        dog=(TextView) findViewById(R.id.tvDog);
       cat=(TextView) findViewById(R.id.tvCat);
        turtle=(TextView) findViewById(R.id.tvTurtle);
        fish=(TextView) findViewById(R.id.tvFish);
        dogFAB();
        catFAB();
        turtleFAB();
        fishFAB();
    }
    public void dogFAB(){
        FloatingActionButton miFAB=(FloatingActionButton)findViewById(R.id.fabDog);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doglike=doglike+1;

                dog.setText("#"+doglike);
                Snackbar.make(v, getResources().getString(R.string.doglike),Snackbar.LENGTH_SHORT).show();
            }
        });
    }
    public void catFAB(){
        FloatingActionButton miFAB=(FloatingActionButton)findViewById(R.id.fabCat);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catlike=catlike+1;

                cat.setText("#"+catlike);
                Snackbar.make(v, getResources().getString(R.string.catlike),Snackbar.LENGTH_SHORT).show();
            }
        });
    }
    public void turtleFAB(){
        FloatingActionButton miFAB=(FloatingActionButton)findViewById(R.id.fabTurtle);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turtlelike=turtlelike+1;

                turtle.setText("#"+turtlelike);
                Snackbar.make(v, getResources().getString(R.string.turtlelike),Snackbar.LENGTH_SHORT).show();
            }
        });
    }
    public void fishFAB(){
        FloatingActionButton miFAB=(FloatingActionButton)findViewById(R.id.fabFish);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fishlike=fishlike+1;

                fish.setText("#"+fishlike);
                Snackbar.make(v, getResources().getString(R.string.fishlike),Snackbar.LENGTH_SHORT).show();
            }
        });
    }
    public void lanzarDog(View view) {
        Intent i = new Intent(this, Dog.class );
        startActivity(i);
    }
    public void lanzarCat(View view) {
        Intent i = new Intent(this, Cat.class );
        startActivity(i);
    }
    public void lanzarTurtle(View view) {
        Intent i = new Intent(this, Turtle.class );
        startActivity(i);
    }
    public void lanzarFish(View view) {
        Intent i = new Intent(this, Fish.class );
        startActivity(i);
    }
    public void lanzarfavoritos(View view) {
        Intent i = new Intent(this, favoritos.class );
        startActivity(i);
    }
}
