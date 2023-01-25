package alarm.reminder.controller;

import alarm.reminder.domain.WeekPlan;
import alarm.reminder.service.WeekPlanService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("old/style/weekPlans")
public class WeekPlanController {

    private final WeekPlanService weekPlanService;

    public WeekPlanController(WeekPlanService weekPlanService) {
        this.weekPlanService = weekPlanService;
    }

    @GetMapping
    private Flux<WeekPlan> getAll() {
        return weekPlanService.getAll();
    }

    @PostMapping
    private Mono<WeekPlan> save(@RequestBody WeekPlan weekPlan) {
        return weekPlanService.save(weekPlan);
    }

    //write getter methods for all fields

    @GetMapping("/goal")
    private Flux<WeekPlan> getByGoal(@RequestParam String goal) {
        return weekPlanService.getByGoal(goal);
    }
}
