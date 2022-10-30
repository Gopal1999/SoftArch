package com.example.saa2.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Item
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int item_id;

    @Column(length = 1000)
    private String question;

    @Column(length = 1000)
    private String answer;

    @OneToMany(mappedBy = "item")
    private List<Option> options;

    @OneToOne(mappedBy = "item")
    private ItemResponse itemResponse;

    @ManyToOne
    private Section section;


    public Item()
    {

    }

    public Item(int item_id, String question, String answer, List<Option> options, Section section) {
        this.item_id = item_id;
        this.question = question;
        this.answer = answer;
        this.options = options;
        this.section = section;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public ItemResponse getItemResponse() {
        return itemResponse;
    }

    public void setItemResponse(ItemResponse itemResponse) {
        this.itemResponse = itemResponse;
    }
}
