package alarm.reminder.repo;

import alarm.reminder.domain.WeekPlan;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.time.DayOfWeek;
import java.time.LocalDate;

public interface WeekPlanRepository extends ReactiveCrudRepository<WeekPlan, Long> {

    Flux<WeekPlan> findWeekPlansByDayOfWeek(DayOfWeek dayOfWeek);

    Flux<WeekPlan> findWeekPlansByGoal(String goal);

    Flux<WeekPlan> findWeekPlansByIsDoneAndGoalDateBefore(Boolean isDone, LocalDate goalDate);

    Flux<WeekPlan> findWeekPlansByIsDoneAndGoalDateAfter(Boolean isDone, LocalDate goalDate);
}
