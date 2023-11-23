package guru.springframework.sfgpetclinic.fauxspring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rami SAHRAOUI on 23/11/2023
 */
public class ModelMapImpl implements Model {

    private final Map<String, Object> map = new HashMap<>();
    @Override
    public void addAttribute(String key, Object o) {
        map.put(key, o);
    }

    @Override
    public void addAttribute(Object o) {

    }

    public Map<String, Object> getMap() {
        return map;
    }
}
