package lesson1.homeWork;

import lesson1.homeWork.obstacleCourse.Course;
import lesson1.homeWork.obstacleCourse.Cross;
import lesson1.homeWork.obstacleCourse.Swimming;
import lesson1.homeWork.team.Team;
import lesson1.homeWork.team.TeamMember;

public class People {

    public static void main(String[] args) {
        Team dreamTeam = new Team("СПАРТАК",
                new TeamMember("Вася", 6),
                new TeamMember("Петя", 6),
                new TeamMember("Маша", 6),
                new TeamMember("Даша" ,6));

        Course course = new Course(new Cross(5), new Swimming(5));
        course.doIt(dreamTeam);

    }
}
