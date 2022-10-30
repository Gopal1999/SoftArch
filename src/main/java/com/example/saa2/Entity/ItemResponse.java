package com.example.saa2.Entity;

import javax.persistence.*;

@Entity
public class ItemResponse
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int itemResponse_id;

    @OneToOne
    private Item item;

    @Column
    private int choice;

    @ManyToOne
    private TestResponse testResponse;

    public ItemResponse()
    {

    }

    public ItemResponse(int itemResponse_id, Item item, int choice, TestResponse testResponse) {
        this.itemResponse_id = itemResponse_id;
        this.item = item;
        this.choice = choice;
        this.testResponse = testResponse;
    }

    public int getItemResponse_id() {
        return itemResponse_id;
    }

    public void setItemResponse_id(int itemResponse_id) {
        this.itemResponse_id = itemResponse_id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public TestResponse getTestResponse() {
        return testResponse;
    }

    public void setTestResponse(TestResponse testResponse) {
        this.testResponse = testResponse;
    }
}
