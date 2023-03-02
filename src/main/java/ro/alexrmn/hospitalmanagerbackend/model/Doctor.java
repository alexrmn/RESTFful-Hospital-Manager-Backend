package ro.alexrmn.hospitalmanagerbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@Entity
@Table(name = "doctors")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Doctor extends User{

    @ManyToOne
    private Specialty specialty;
}
