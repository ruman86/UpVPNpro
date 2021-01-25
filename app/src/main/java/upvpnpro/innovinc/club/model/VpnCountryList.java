package upvpnpro.innovinc.club.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VpnCountryList {

    @SerializedName("srl")
    @Expose
    private String srl;
    @SerializedName("nameofcntry")
    @Expose
    private String nameofcntry;
    @SerializedName("ipaddr")
    @Expose
    private String ipaddr;
    @SerializedName("vpninfo")
    @Expose
    private String vpninfo;
    @SerializedName("vpnuses")
    @Expose
    private String vpnuses;
    @SerializedName("cntryflag")
    @Expose
    private String cntryflag;

    public String getSrl() {
        return srl;
    }

    public void setSrl(String srl) {
        this.srl = srl;
    }

    public String getNameofcntry() {
        return nameofcntry;
    }

    public void setNameofcntry(String nameofcntry) {
        this.nameofcntry = nameofcntry;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getVpninfo() {
        return vpninfo;
    }

    public void setVpninfo(String vpninfo) {
        this.vpninfo = vpninfo;
    }

    public String getVpnuses() {
        return vpnuses;
    }

    public void setVpnuses(String vpnuses) {
        this.vpnuses = vpnuses;
    }

    public String getCntryflag() {
        return cntryflag;
    }

    public void setCntryflag(String cntryflag) {
        this.cntryflag = cntryflag;
    }

}
