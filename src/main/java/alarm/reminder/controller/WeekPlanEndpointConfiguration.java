package alarm.reminder.controller;

import alarm.reminder.domain.WeekPlan;
import alarm.reminder.handler.WeekPlanHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.reactive.function.server.*;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class WeekPlanEndpointConfiguration {

    @Bean
    RouterFunction<ServerResponse> routes(WeekPlanHandler weekPlanHandler) {
        return RouterFunctions
                .resources("/templates/static/index.html", new ClassPathResource("/templates/static/index.html"))
                .andRoute(RequestPredicates.GET("/weekPlans"), req -> ok().body(weekPlanHandler.getAll(), WeekPlan.class))
                .andRoute(RequestPredicates.GET("/weekPlans/goal"), req -> ok().body(weekPlanHandler.getByGoal(req.queryParam("goal").orElse("")), WeekPlan.class))
                .andRoute(RequestPredicates.POST("/weekPlan"), req -> ok().body(req.bodyToMono(WeekPlan.class).flatMap(weekPlanHandler::save), WeekPlan.class));
    }
}
