//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pl.wsb.fitnesstracker.healthmetrics.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import pl.wsb.fitnesstracker.user.api.User;

import java.sql.Date;

@Entity
@Table(
        name = "healthmetrics"
)
public class HealthMetrics {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    @Nullable
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="date", nullable = false)
    private Date date;

    @Column(name="weight", nullable = true)
    private double weight;

    @Column(name="height", nullable = true)
    private double height;

    @Column(name="heartRate", nullable = true)
    private double heartRate;



    @Nullable
    public Long getId() { return this.id; }
}
