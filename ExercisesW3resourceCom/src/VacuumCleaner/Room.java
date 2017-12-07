package VacuumCleaner;

public class Room {

    private boolean conditionIsClean=false;
    private String name;
    private String stateBefore;
    private String stateAfter;

    public String getState() {
        return stateBefore;
    }

    public void setState(String state) {
        this.stateBefore = state;
        this.stateBefore=conditionIsClean?"don't need cleaning. it is neat":"is dirty, cleaning will start";
    }

    public Room() {
    }

    public boolean getConditionIsClean() {
                return conditionIsClean;
    }

    public void setConditionIsClean(boolean conditionIsClean) {
        this.conditionIsClean = conditionIsClean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
