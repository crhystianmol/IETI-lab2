package mongo.repository;

import mongo.dto.UserDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class UserDocument
{
    @Id
    String id;

    String name;

    @Indexed( unique = true )
    String email;

    String lastName;

    Date createdAt;

    public UserDocument(UserDto dto)
    {
        name = dto.getName();
        lastName = dto.getLastName();
        email = dto.getEmail();
    }

    /**
     * get field @Id
     *
     * @return id @Id

     */
    public String getId() {
        return this.id;
    }

    /**
     * set field @Id
     *
     * @param id @Id

     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field @Indexed( unique = true )
     *
     * @return email @Indexed( unique = true )
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * set field @Indexed( unique = true )
     *
     * @param email @Indexed( unique = true )

     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get field
     *
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * set field
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get field
     *
     * @return createdAt
     */
    public Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * set field
     *
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void update(UserDto userDto) {
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
    }
}
