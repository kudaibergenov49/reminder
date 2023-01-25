package alarm.reminder.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serial;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class WeekPlan implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String goal;
    private DayOfWeek dayOfWeek;
    private Boolean isDone;
    private LocalDate goalDate;
}
