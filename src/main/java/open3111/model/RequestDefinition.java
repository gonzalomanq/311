package open3111.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RequestDefinition {

    private String serviceDefinition;
    private String serviceCode;
    private String variable;
    private String code;
    private String dataType;
    private boolean required;
    private String datatypeDescription;
    private int order;
    private String description;
    private String key;
    private String name;

}
