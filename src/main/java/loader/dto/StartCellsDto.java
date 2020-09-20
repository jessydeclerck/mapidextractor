package loader.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class StartCellsDto {
    @JacksonXmlProperty(localName = "side", isAttribute = true)
    private int side;
    @JacksonXmlProperty(localName = "cells", isAttribute = true)
    private String cells;
}
