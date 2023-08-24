package open3111.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ServiceRequest {

    private int jurisdictionId;
    private String serviceCode;
    private String location;
    private String attribute;

    //Optional Arguments
    private String lattitude;
    private String longitude;
    private String addresString;
    private int addresId;
    private String email;
    private String deviceId;
    private int accountId;
    private String firstName;
    private String lastName;
    private String phone;
    private String description;
    private String mediaUrl;

}
