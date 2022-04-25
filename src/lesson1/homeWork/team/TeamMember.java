package lesson1.homeWork.team;


import lesson1.homeWork.Status;

public class TeamMember {
    private Status status = Status.NoPassedDistance;
    private String nameTeamMember;
    private int power;

    public TeamMember(String nameTeamMember, int power) {
        this.nameTeamMember = nameTeamMember;
        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getNameTeamMember() {
        return nameTeamMember;
    }

    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," пробежал кросс");
        }
        else{
            changeStatus(Status.NoPassedDistance,"  не пробежал кросс");
        }
    }

    public void swimm(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," проплыл дистанцию");
        }
        else{
            changeStatus(Status.NoPassedDistance," не проплыл дистанцию");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(nameTeamMember + message);
    }

}
