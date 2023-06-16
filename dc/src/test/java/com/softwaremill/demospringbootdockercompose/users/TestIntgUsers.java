package com.softwaremill.demospringbootdockercompose.users;

import com.softwaremill.demospringbootdockercompose.AbstTestIntg;
import com.softwaremill.demospringbootdockercompose.domain.users.User;
import com.softwaremill.demospringbootdockercompose.infrastructure.users.api.Users;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public final class TestIntgUsers extends AbstTestIntg
{
    @Test
    void shouldReturnSavedUser()
    {
	User lToBeSavedUser = new User(UUID.randomUUID().toString(), "username");
	usersRepository.save(lToBeSavedUser);

	Users lFetchedUsers = testRestTemplate.getForObject("/api/users", Users.class);
	assertThat(lFetchedUsers).isEqualTo(new Users(List.of(lToBeSavedUser)));
    }
}
