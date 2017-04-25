package spittr;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {
    private Long id;

    @NotNull
    @Size(min = 5, max = 16)
    private String username;

    @NotNull
    @Size(min = 5, max = 16)
    private String password;

    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30)
    private String lastName;

    public Spitter() {}

    public Spitter(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Spitter(Long id, String username, String password, String firstName, String lastName) {
        this(username, password, firstName, lastName);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, new String[]{"id"});
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, new String[]{"id"});
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
