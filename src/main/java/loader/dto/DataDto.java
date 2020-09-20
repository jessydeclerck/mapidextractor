package loader.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class DataDto {

    @JacksonXmlProperty(localName = "value", isAttribute = true)
    private String value;

}
