package upvpnpro.innovinc.club;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import upvpnpro.innovinc.club.adapter.VpnListAdapter;
import upvpnpro.innovinc.club.model.VpnCountryList;
import upvpnpro.innovinc.club.network.DataServices;
import upvpnpro.innovinc.club.network.RetrofitClientInstance;

public class CountryListActivity extends AppCompatActivity {

    List<VpnCountryList> vpnCountryLists;
    Context context;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);
        context = getApplicationContext();

        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        DataServices services = retrofit.create(DataServices.class);
        Call<List<VpnCountryList>> getCountrylist = services.getCountryList(101);
        getCountrylist.enqueue(new Callback<List<VpnCountryList>>() {
            @Override
            public void onResponse(Call<List<VpnCountryList>> call, Response<List<VpnCountryList>> response) {
                vpnCountryLists = response.body();
                recyclerView.setLayoutManager(new LinearLayoutManager(CountryListActivity.this));
                VpnListAdapter vpnListAdapter = new VpnListAdapter(vpnCountryLists, context);
                recyclerView.setAdapter(vpnListAdapter);
            }

            @Override
            public void onFailure(Call<List<VpnCountryList>> call, Throwable t) {

            }
        });
    }
}