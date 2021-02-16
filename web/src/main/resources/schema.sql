create table if not exists users
(
    user_id   varchar(32)
        constraint users_id_pkey primary key,
    bio       varchar(550),
    birthday  timestamp with time zone not null,
    name      varchar(40)              not null,
    gender    smallint                 not null,
    job       varchar(100),
    school    varchar(100),
    city      varchar(30),
    interests varchar(100)
);

create table if not exists spotify
(
    user_id varchar(32)
        constraint spotify_user_id_pkey primary key,
    artist  varchar(32),
    album   varchar(64)
);