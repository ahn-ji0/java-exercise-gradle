package week4.day2;

public class SeoulHospital {
    private String id;
    private String address;
    private String district;
    private String type;
    private int er;
    private String name;
    private String subdivision;

    public SeoulHospital(String id, String address, String district, String type, int er, String name, String subdivision){
        this.id = id;
        this.address = address;
        this.district = district;
        this.type = type;
        this.er = er;
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getType() {
        return type;
    }

    public int getEr() {
        return er;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
