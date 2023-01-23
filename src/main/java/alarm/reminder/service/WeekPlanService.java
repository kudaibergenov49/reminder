package alarm.reminder.service;

import alarm.reminder.domain.WeekPlan;
import alarm.reminder.repo.WeekPlanRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class WeekPlanService {

    private final WeekPlanRepository weekPlanRepository;

    public WeekPlanService(WeekPlanRepository weekPlanRepository) {
        this.weekPlanRepository = weekPlanRepository;
    }

    public Mono<WeekPlan> save(WeekPlan weekPlan) {
        return weekPlanRepository.save(weekPlan);
    }

    public Flux<WeekPlan> getAll() {
        return weekPlanRepository.findAll();
    }

    public Flux<WeekPlan> findWeekPlansByDayOfWeek(DayOfWeek dayOfWeek) {
        return weekPlanRepository.findWeekPlansByDayOfWeek(dayOfWeek);
    }

    public Flux<WeekPlan> f(LocalDate date) {
        return weekPlanRepository.findWeekPlansByAlarmDate(date);
    }
}
