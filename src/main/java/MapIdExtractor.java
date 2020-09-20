import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import json.model.PosMapId;
import loader.MapsLoader;
import loader.dto.MapsDto;
import lombok.SneakyThrows;

import java.io.File;

public class MapIdExtractor {

    @SneakyThrows
    public static void main(String[] args) {
        MapsDto mapsDto = MapsLoader.loadMapsData();
        PosMapId posMapId = new PosMapId();
        mapsDto.getMaps().stream().filter(m -> m.getBackgroundNum() != 0).forEach(mapDto -> {
            String pos = mapDto.getAbscissa() + "," + mapDto.getOrdinate();
            if (posMapId.getPosMapId().containsKey(pos)) {
                System.out.println("Map id " + mapDto.getId() + " already registered for pos : " + pos);
                System.out.println("Map id registered " + posMapId.getPosMapId().get(pos) + " already registered for pos : " + pos);
                if (mapDto.getId() < Integer.parseInt(posMapId.getPosMapId().get(pos))) { //smaller id wins
                    System.out.println("Map id " + mapDto.getId() + " will be registered instead for : " + pos);
                    posMapId.getPosMapId().put(pos, String.valueOf(mapDto.getId()));
                }
            } else {
                posMapId.getPosMapId().put(pos, String.valueOf(mapDto.getId()));
            }
        });
        new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT).writeValue(new File("posmapsid.json"), posMapId);
    }

}
