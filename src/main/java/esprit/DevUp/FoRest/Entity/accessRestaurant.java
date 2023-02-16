package esprit.DevUp.FoRest.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class accessRestaurant implements Serializable {

private Date dateStart;
private Date dateEnd;
private Boolean payment;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="accessRestaurant")
    private Set<User> users;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="restaurant")
    private Set<Restaurant> restaurants;
    @Id
    private Integer idaccess;

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Getter
    @Setter
    @Table(name = "creno")
    public static class Creno implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idCreno")
        int idCreno;
        @Temporal(TemporalType.DATE)
        Date dateDebut;
        @Temporal(TemporalType.DATE)
        Date dateFin;
        int Occurence;

        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "idEvent", nullable = false)
        @JsonIgnore
        private Event event;

    }

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Getter
    @Setter
    @Table(name = "event")
    public static class Event implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int idEvent;
        @Enumerated(EnumType.STRING)
        public location location;
        String name;
        String objectif;
        @Enumerated(EnumType.STRING)
        public state state;
        public String description;
        //
    //    @OneToMany(cascade = CascadeType.ALL, mappedBy ="invite")
    //    private Set<invite> invites;


    }

    @Entity
    @Table(name="invite")
    public static class invite implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int idInvite ;
        String fullName ;
        int phoneNumber ;
        String email ;




    }

    public enum location {
        RESTAURANT_HALL , REUNION_HALL , EVENT_HALL1 ,EVENT_HALL2
    }

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Getter
    @Setter
    @Table(name = "plannification")
    public static class Plannification implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int idPlan;
        @Temporal(TemporalType.DATE)
        Date dateP;
        @JsonFormat(pattern = "HH:mm:ss")
        private LocalTime startDate;
        @JsonFormat(pattern = "HH:mm:ss")
        private LocalTime endDate;
        private Integer occurrence;

    }

    public static class Reminder {
    }

    public enum state {
    VALIDATED , DENIED , PENDING , DONE
    }
}
