package lesson1_1.homeWork.obstacleCourse;


import lesson1_1.homeWork.team.TeamMember;

public class Cross extends Obstacle {

    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }

}
