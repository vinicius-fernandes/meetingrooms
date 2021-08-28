package com.digital.crud.saladereuniao.model;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name="meetingroom")
public class Room {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="date",nullable = false)
    private String date;
    @Column(name="startHour",nullable = false)
    private String startHour;
    @Column(name="endHour",nullable = false)
    private String endHour;
    @Override
    public String toString(){
        return "Room[id="+id+",name="+name+",starHour="+startHour+",endHour="+endHour+"]";
    }

}
