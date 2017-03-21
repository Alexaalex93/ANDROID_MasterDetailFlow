package com.example.cice.masterdetailflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {


    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    static {
        //Añado los elementos que necesite
        addItem(new DummyItem("1", "Google", "http://www.google.es"));
        addItem(new DummyItem("2", "Amazon", "http://www.amazon.com"));
        addItem(new DummyItem("3", "Marca", "http://www.marca.es"));
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {

        public String id;
        public String website_name;
        public String website_url;

        public DummyItem (String id, String website_name, String website_url){
            this.id = id;
            this.website_name = website_name;
            this.website_url = website_url;

        }


        @Override
        public String toString() {
            return website_name;
        }
    }
}
