package com.codefactory.reserva_b.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "scale")
public class Scale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_scale")
    private BigInteger idScale;

    @Column(name = "id_flight", nullable = false)
    private BigInteger flight;  // Relación con Passenger

    @Column(name = "id_city", nullable = false)
    private BigInteger idCity;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrivalTime;

    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departureTime;

    @Column(name = "layover_duration", nullable = false)
    private LocalTime layoverDuration;

    // Constructor
    public Scale(BigInteger idScale, BigInteger flight, BigInteger idCity, LocalDateTime arrivalTime,
                 LocalDateTime departureTime, LocalTime layoverDuration) {
        this.idScale = idScale;
        this.flight = flight;
        this.idCity = idCity;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.layoverDuration = layoverDuration;
    }

    public Scale() {

    }

    // Getters y Setters


    public BigInteger getIdScale() {
        return idScale;
    }

    public void setIdScale(BigInteger idScale) {
        this.idScale = idScale;
    }

    public BigInteger getFlight() {
        return flight;
    }

    public void setFlight(BigInteger flight) {
        this.flight = flight;
    }

    public BigInteger getIdCity() {
        return idCity;
    }

    public void setIdCity(BigInteger idCity) {
        this.idCity = idCity;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getLayoverDuration() {
        return layoverDuration;
    }

    public void setLayoverDuration(LocalTime layoverDuration) {
        this.layoverDuration = layoverDuration;
    }

    // equals, hashCode y toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scale booking)) return false;
        return Objects.equals(idScale, booking.idScale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idScale);
    }

    @Override
    public String toString() {
        return "Scale{" +
                "idScale=" + idScale +
                ", flight=" + flight +
                ", idCity=" + idCity +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", layoverDuration=" + layoverDuration +
                '}';
    }
}
