package upvpnpro.innovinc.club.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import upvpnpro.innovinc.club.model.VpnCountryList;

public interface DataServices {
    @GET("vpnapi/content.php")
    Call<List<VpnCountryList>> getCountryList(@Query("typereq") int typereq);
}
