package mongo.service;

import mongo.dto.UserDto;
import mongo.model.User;
import mongo.repository.UserDocument;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class UserServiceHashMap
        implements UserService
{

    private final HashMap<String, User> usersMap = new HashMap<>();


    @Override
    public UserDocument create(UserDocument user) {
        return null;
    }

    @Override
    public UserDocument findById( String id )
    {

        return null;
    }

    @Override
    public List<UserDocument> all()
    {
        return null;
    }

    @Override
    public boolean deleteById( String id )
    {
        return usersMap.remove( id ) != null;
    }

    @Override
    public UserDocument update( UserDto userDto, String id )
    {

        return null;
    }


}
