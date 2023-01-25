create table week_Plan
(
    id   bigserial primary key,
    goal varchar(1024),
    day_of_week varchar(1024),
    is_done BOOLEAN,
    goal_date date
);

insert into week_Plan (id, goal, day_of_week, is_done, goal_date) values (1, 'go to the gym', 'MONDAY', false, '2023-02-01');
insert into week_Plan (id, goal, day_of_week, is_done, goal_date) values (2, 'eat less', 'MONDAY', false, '2023-02-01');