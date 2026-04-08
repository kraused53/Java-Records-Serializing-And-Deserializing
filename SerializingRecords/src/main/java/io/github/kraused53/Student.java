package io.github.kraused53;

public record Student(
        String firstName,
        String lastName,
        int SID,
        String userName,
        String address,
        String city,
        String state,
        String zipCode,
        String phoneNumber
) {
    public boolean equal( Student other ) {
        return this.SID == other.SID;
    }

    
}
