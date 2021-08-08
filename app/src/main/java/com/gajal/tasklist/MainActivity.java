package com.gajal.tasklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<rvmodal> rvmodels=new ArrayList<>();
    ApiInterface apiInterface;
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        retrofit=ApiInstance.getInstance(); //syntax
        apiInterface=retrofit.create(ApiInterface.class); //initialize apiinterace using retrofit

        fetchData();

    }

    private void fetchData() {

        apiInterface.readData().enqueue(new Callback<readResponce>() {
            @Override
            public void onResponse(Call<readResponce> call, Response<readResponce> response) {
                Toast.makeText(MainActivity.this, "net connected", Toast.LENGTH_SHORT).show();
                try {
                    if (response!=null) //kuch nhi aaya
                    {
                        if (response.body().getStatus().equals("1")){
                            setAdapter(response.body().getData());
                        }

                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<readResponce> call, Throwable t) //failure case
            {
                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void setAdapter(List<rvmodal> data) {
        rvadapter adapter=new rvadapter(data,this);
        recyclerView.setAdapter(adapter);
    }
}