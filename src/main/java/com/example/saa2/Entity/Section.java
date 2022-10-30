package com.example.saa2.Entity;

import com.example.saa2.Entity.Interfaces.ItemType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Section
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private TestResponse testResponse;

    @Transient
    private List<ItemType> itemTypes;

    public void addItem(ItemType itemType)
    {
        this.itemTypes.add(itemType);
    }

    public List<ItemType> getItems()
    {
        return this.itemTypes;
    }
}
