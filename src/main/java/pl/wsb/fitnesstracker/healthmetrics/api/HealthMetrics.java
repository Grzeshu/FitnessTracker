//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pl.wsb.fitnesstracker.healthmetrics.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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





    @Nullable
    public Long getId() { return this.id; }

}
