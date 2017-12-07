package VacuumCleaner;

public class Cleaner {
    private boolean toClean;

    public void setToClean(boolean toClean) {
        this.toClean = toClean;
    }

    String stateClean=toClean?"":"\tcleaning complete";
}
