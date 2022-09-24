package com.example.saa2.Entity;

import javax.persistence.*;

@Entity
public class Option
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int option_id;

    @Column(length = 1000)
    private String value;

    @ManyToOne
    private Item item;

    public Option()
    {

    }

    public Option(int option_id, String value, Item item) {
        this.option_id = option_id;
        this.value = value;
        this.item = item;
    }

    public int getOption_id() {
        return option_id;
    }

    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
