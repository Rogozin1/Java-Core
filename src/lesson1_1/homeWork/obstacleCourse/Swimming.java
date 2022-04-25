package lesson1_1.homeWork.obstacleCourse;

import lesson1_1.homeWork.team.TeamMember;

public class Swimming extends Obstacle {
    public Swimming(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.swimm(super.getDifficulty());
    }
}
