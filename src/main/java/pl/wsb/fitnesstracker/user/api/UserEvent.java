package pl.wsb.fitnesstracker.user.api;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.event.Event;

import java.time.LocalDateTime;

@Entity
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime registrationDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    // getters/setters
}