package alarm.reminder.handler;

import alarm.reminder.domain.WeekPlan;
import alarm.reminder.service.WeekPlanService;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.DayOfWeek;

@Component
public class WeekPlanHandler {

    private final WeekPlanService weekPlanService;

    public WeekPlanHandler(WeekPlanService weekPlanService) {
        this.weekPlanService = weekPlanService;
    }

    public Mono<WeekPlan> save(WeekPlan weekPlan) {
        return weekPlanService.save(weekPlan);
    }

    public Flux<WeekPlan> getAll() {
        return weekPlanService.getAll();
    }

    public Flux<WeekPlan> getByGoal(String goal) {
        return weekPlanService.getByGoal(goal);
    }

    public Flux<WeekPlan> getByDayOfWeek(DayOfWeek dayOfWeek) {
        return weekPlanService.getByDayOfWeek(dayOfWeek);
    }

    public Flux<WeekPlan> findWeekPlansByIsDoneAndGoalDateBefore() {
        return weekPlanService.findWeekPlansByIsDoneAndGoalDateBefore(false);
    }

    public Flux<WeekPlan> findWeekPlansByIsDoneAndGoalDateAfter() {
        return weekPlanService.findWeekPlansByIsDoneAndGoalDateAfter(true);
    }
}
