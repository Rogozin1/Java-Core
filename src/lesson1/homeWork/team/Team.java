package lesson1.homeWork.team;


import lesson1.homeWork.Status;

public class Team {
    private TeamMember[] members;
    private final String nameTeam;

    public Team(String nameTeam, TeamMember... members) {
        this.members = members;
        this.nameTeam = nameTeam;
        System.out.println("Полосу препятствий преодолевала команда: " + nameTeam);
    }


    private void showResultMemberNoPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getNameTeamMember() + " Не прошел полосу препятствий");
    }

    private void showResultMemberPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getNameTeamMember() + " Успешно прошел полосу препятствий");
    }

    public TeamMember[] getMembers() {
        return members;
    }

    private void printDivider() {
        System.out.println("-----------------------------------------------------------");
    }
}
