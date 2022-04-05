package ca.tcemap.tcetrains.resources;

import ca.tcemap.tcetrains.objects.Train;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/trains")
public class TrainCatalogResource {

    @RequestMapping("/{trainId}")
    public HashMap<String, Train> getTrainCatalog(@PathVariable("trainId") String lineNumber) {
        if(lineNumber.equalsIgnoreCase("one")) {
            HashMap<String, Train> trainMap = new HashMap<>();
            trainMap.put("wb1", new Train("wb102","bayview","bessarion", false, true));
            trainMap.put("wb2", new Train("wb103","bessarion","leslie", true, false));
            trainMap.put("wb3", new Train("wb104","leslie","don_mills", false, true));
            trainMap.put("wb4", new Train("wb105","don_mills","null", true, true));
            return trainMap;
        }
        else {
            return new HashMap<>();
        }
    }
}
