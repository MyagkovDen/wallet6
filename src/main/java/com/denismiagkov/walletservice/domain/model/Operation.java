package com.denismiagkov.walletservice.domain.model;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * Класс описывает действие игрока в системе. Служит для целей аудита
 * */
public class Operation {
    /**
     * Тип действия
     * @see OperationType
     * */
    private  OperationType type;
    /**
     * Дата и время совершения действия
     * */
    private Timestamp time;
    /**
     * Игрок, выполнивший действие
     * */
    private int playerId;
    /***
     * Статус успеха действия {@link OperationStatus}
     * */
    private OperationStatus status;

    /**
     * Конструктор класса
     * */
    public Operation(OperationType type, Timestamp time, int playerId, OperationStatus status) {
        this.type = type;
        this.time = time;
        this.playerId = playerId;
        this.status = status;
    }

    /**
     * Метод возвращает тип совершенного действия
     * */
    public OperationType getType() {
        return type;
    }


    public void setType(OperationType type) {
        this.type = type;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public OperationStatus getStatus() {
        return status;
    }

    public void setStatus(OperationStatus status) {
        this.status = status;
    }

    /**
     * Метод toString()
     * */
    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", time=" + time +
                ", player='" + playerId + " " + //player.getLastName() + '\'' +
                ", status=" + status +
                '}' + "\n";
    }

    /**
     * Метод equals()
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation = (Operation) o;
        return type == operation.type && Objects.equals(time, operation.time) && Objects.equals(playerId, operation.playerId) && status == operation.status;
    }

    /**
     * Метод hashcode()
     * */
    @Override
    public int hashCode() {
        return Objects.hash(type, time, playerId, status);
    }

    public void setId(int playerId) {
    }
}