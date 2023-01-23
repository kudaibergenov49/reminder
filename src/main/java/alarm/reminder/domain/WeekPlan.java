package alarm.reminder.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class WeekPlan {

    @Id
    private Long id;

    private String goal;

    private LocalDate createDate;

    private LocalDateTime alarmDate;

    private DayOfWeek dayOfWeek;

    private Boolean isDone;
}
