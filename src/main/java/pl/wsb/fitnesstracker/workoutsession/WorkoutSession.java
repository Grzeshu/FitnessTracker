package pl.wsb.fitnesstracker.workoutsession;

// TODO: Define the Event entity with appropriate fields and annotations
import jakarta.persistence.*;
import pl.wsb.fitnesstracker.training.api.Training;

@Entity
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double startLatitude;
    private Double startLongitude;

    private Double endLatitude;
    private Double endLongitude;

    private Double altitude;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    // getters/setters
}
