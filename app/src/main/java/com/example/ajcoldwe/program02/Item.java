package com.example.ajcoldwe.program02;

/**
 * Created by Alexander J Coldwell on 10/15/2017.
 */



public class Item {
    private String name;
    private String description;

    public static final Item[] items = {
            new Item("iBuyPower Keyboard",
                    "-Standard desktop keyboard\n-USB Powered" +
                            "\n-Price: $75.22"),
            new Item("LG - 27UD69P-W 27in IPS LED 4K UHD FreeSync Monitor",
                    "-4K Ultra HD 3840 x 2160 resolution" +
                            "\n-5 ms response time" +
                            "\n-ENERGY STAR Certified" +
                            "\n-Price: $429.99"),
            new Item("INTEL® CORE i7-8700 PROCESSOR",
                    "-Cores: 6\n-Processor Base Frequency: 3.20 GHz" +
                            "\n-Cache: 12 MB\n-Max Memory Size (dependent on memory type): 64 GB" +
                            "\n-Price: $319.99"),
            new Item("HP Pavilion Power - 15-cb041nr",
                    "-Windows 10 Home 64\n-7th Generation Intel® Core i7 processor" +
                            "\n-12 GB memory; 1 TB HDD storage" +
                            "\n-NVIDIA® GeForce® GTX 1050 (2 GB GDDR5 dedicated)" +
                            "\n-Price: $1,999.98")
    };

    //Each Workout has a name and description
    private Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}