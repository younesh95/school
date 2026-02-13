package tn.m104.rh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer rollNumber;
    String name;
    String address;
    Double percentage;

}
//Commentaire pour  vérifier le premeir commit de modif
// update 06/02 : verficaiton de l'utilisation  de la création d'une branche et d'une modificaiton du code
// update 13/02 : Commentaire pour vérfier le fait que Jenkins effecture une rebuild  suite à une modfication du code 