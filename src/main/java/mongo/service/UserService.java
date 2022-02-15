package mongo.service;

import mongo.dto.UserDto;
import mongo.model.User;
import mongo.repository.UserDocument;

import java.util.List;

public interface UserService
{
    UserDocument create( UserDocument user );

    UserDocument findById( String id );

    List<UserDocument> all();

    boolean deleteById( String id );

    UserDocument update(UserDto userDto, String id );
}