package com.vohizy.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
@Entity
@EqualsAndHashCode
@NoArgsConstructor

public class Groups {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 3)
    private String name;

    @Column
    private LocalDate creationDate;
}
