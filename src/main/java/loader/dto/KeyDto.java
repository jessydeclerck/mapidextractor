package loader.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class KeyDto {
    @JacksonXmlProperty(localName = "value", isAttribute = true)
    private String value;
}
