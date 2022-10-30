package com.example.saa2.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Section
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int section_id;

    @ManyToOne
    private Test test;


    @OneToMany(mappedBy = "section")
    private List<Item> items;

    public Section()
    {

    }

    public Section(int section_id, Test test, List<Item> items) {
        this.section_id = section_id;
        this.test = test;
        this.items = items;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
