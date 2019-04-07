package org.lasencinas.regEx;

import java.util.HashMap;
import java.util.Map;

public class RegularExpressions {

    /* ---- Properties ---- */
    private Map<String, String> regularExpressions = null;


    /* ---- Constructor ---- */
    public RegularExpressions() {
        this.regularExpressions = new HashMap<>();
    }


    /* ---- Getters ----- */
    public Map<String, String> getRegularExpressions() {
        return regularExpressions;
    }


    /* ---- Behaviours ---- */
    public void addRegExpression(String identifier, String regEx) {
        getRegularExpressions().putIfAbsent(identifier, regEx);
    }

    public String takeOutRegExpression(String identifier) {
        String regEx = getRegularExpressions().get(identifier);
        return regEx;
    }

    public int getSize() {
        return getRegularExpressions().size();
    }
}
