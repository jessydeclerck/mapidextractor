package loader.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class TriggerDto {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    private int id;

    @JacksonXmlProperty(localName = "cell", isAttribute = true)
    private int cell;

    @JacksonXmlProperty(localName = "next_map", isAttribute = true)
    private int nextMap;

    @JacksonXmlProperty(localName = "next_cell", isAttribute = true)
    private int nextCell;

}
