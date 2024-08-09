package com.workintech.fswebs18challengemaven.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="card",schema="fsweb")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private long id;

    @Column(name="value")
    private Integer value;

    @Column(name="type")
    @Enumerated(value = EnumType.STRING)
    private Type type;

    @Column(name="color")
    @Enumerated(value = EnumType.STRING)
    private Color color;


}
