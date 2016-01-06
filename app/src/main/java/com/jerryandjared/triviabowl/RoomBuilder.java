package com.jerryandjared.triviabowl;

public class RoomBuilder {
    private int latency;
    private int numberOfTeams;
    private int playersPerTeam;
    private String roomName;
    private boolean canBuzzMultipleTimes;
    private int pointsCorrect;
    private boolean speedPointsEnabled;
    private boolean bonusQuestionsEnabled;
    private int bonusPointsCorrect;

    public RoomBuilder setLatency(int latency) {
        this.latency = latency;
        return this;
    }

    public RoomBuilder setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
        return this;
    }

    public RoomBuilder setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
        return this;
    }

    public RoomBuilder setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    public RoomBuilder setCanBuzzMultipleTimes(boolean canBuzzMultipleTimes) {
        this.canBuzzMultipleTimes = canBuzzMultipleTimes;
        return this;
    }

    public RoomBuilder setPointsCorrect(int pointsCorrect) {
        this.pointsCorrect = pointsCorrect;
        return this;
    }

    public RoomBuilder setSpeedPointsEnabled(boolean speedPointsEnabled) {
        this.speedPointsEnabled = speedPointsEnabled;
        return this;
    }

    public RoomBuilder setBonusQuestionsEnabled(boolean bonusQuestionsEnabled) {
        this.bonusQuestionsEnabled = bonusQuestionsEnabled;
        return this;
    }

    public RoomBuilder setBonusPointsCorrect(int bonusPointsCorrect) {
        this.bonusPointsCorrect = bonusPointsCorrect;
        return this;
    }

    public Room createRoom() {
        return new Room(latency, numberOfTeams, playersPerTeam, roomName, canBuzzMultipleTimes, pointsCorrect, speedPointsEnabled, bonusQuestionsEnabled, bonusPointsCorrect);
    }
}