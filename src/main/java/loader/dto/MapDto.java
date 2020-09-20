package loader.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MapDto {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    private int id;
    @JacksonXmlProperty(localName = "abscissa", isAttribute = true)
    private int abscissa;
    @JacksonXmlProperty(localName = "ordinate", isAttribute = true)
    private int ordinate;
    @JacksonXmlProperty(localName = "width", isAttribute = true)
    private int width;
    @JacksonXmlProperty(localName = "height", isAttribute = true)
    private int height;
    @JacksonXmlProperty(localName = "date", isAttribute = true)
    private String date;
    @JacksonXmlProperty(localName = "subscriber", isAttribute = true)
    private int subscriber;
    @JacksonXmlProperty(localName = "canFight", isAttribute = true)
    private int canFight;
    @JacksonXmlProperty(localName = "backgroundNum", isAttribute = true)
    private int backgroundNum;
    @JacksonXmlProperty(localName = "ambianceId", isAttribute = true)
    private int ambianceId;
    @JacksonXmlProperty(localName = "musicId", isAttribute = true)
    private int musicId;
    @JacksonXmlProperty(localName = "bOutdoor", isAttribute = true)
    private boolean bOutdoor;
    @JacksonXmlProperty(localName = "capabilities", isAttribute = true)
    private int capabilities;
    @JacksonXmlProperty(localName = "data")
    private DataDto data;
    @JacksonXmlProperty(localName = "key")
    private KeyDto key;
    @JacksonXmlProperty(localName = "trigger")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<TriggerDto> triggers = new ArrayList<>();
    @JacksonXmlProperty(localName = "startCells")
    @JacksonXmlElementWrapper(useWrapping = false, localName = "startCells")
    private List<StartCellsDto> startCells = new ArrayList<>();


}
