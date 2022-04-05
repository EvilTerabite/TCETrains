package ca.tcemap.tcetrains.objects;

public class Train {
    private String trainId;
    private String lastStation;
    private String nextStation;
    private boolean atStation;
    private boolean isDelayed;

    public Train(String trainId, String lastStation, String nextStation, boolean atStation, boolean isDelayed) {
        this.trainId = trainId;
        this.lastStation = lastStation;
        this.nextStation = nextStation;
        this.atStation = atStation;
        this.isDelayed = isDelayed;
    }

    public String getLastStation() {
        return lastStation;
    }

    public void setLastStation(String lastStation) {
        this.lastStation = lastStation;
    }

    public String getNextStation() {
        return nextStation;
    }

    public void setNextStation(String nextStation) {
        this.nextStation = nextStation;
    }

    public boolean isAtStation() {
        return atStation;
    }

    public void setAtStation(boolean atStation) {
        this.atStation = atStation;
    }

    public boolean isDelayed() {
        return isDelayed;
    }

    public void setDelayed(boolean delayed) {
        isDelayed = delayed;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
}
