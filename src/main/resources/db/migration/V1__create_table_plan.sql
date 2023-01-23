create table weekPlan
(
    id   bigserial primary key,
    goal varchar(1024),
    createDate date,
    alarmDate date,
    dayOfWeek varchar(1024),
    isDone BOOLEAN
)