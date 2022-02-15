package mongo.service;


import mongo.dto.UserDto;
import mongo.model.User;
import mongo.repository.UserDocument;
import mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceMongoDB
        implements UserService
{
    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public UserDocument create(UserDocument user) {
        return userRepository.save(user);
    }

    @Override
    public UserDocument findById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<UserDocument> all()
    {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteById( String id )
    {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public UserDocument update(UserDto userDto, String id) {
        if ( userRepository.existsById(id ))
        {
            UserDocument userDoc = userRepository.findById(id).get();
            userDoc.update( userDto );
            return userDoc;
        }
        else
        {
            return null;
        }
    }

}