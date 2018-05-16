package com.Tests;
/** Updates user records. */
public class UserRecordUpdater {
  String database_address;

  public UserRecordUpdater(String databaseAddress) {
    this.database_address = databaseAddress;
  }

  /* Updates user record with new data provided by a user */
  public void updateUser(String userId, String address, String email) {
    Database database = new Database(this.database_address);
    User userX = database.getUserById(userId);
    User userY = new User(userId, email, address);
    if (userX == userY) {
      // Skipping the update if nothing has really changed.
      return;
    }
    updateUser2(userX);
  }

  public void updateUser2(User user) {
    Database database = new Database(this.database_address);
    String sql = "UPDATE User set email = '" + user.email + "' address = '" + 
        user.address + "' where userId = '" + user.userId + "'";
    database.executeSqlUpdate(sql);
  }

}

/** Represents a user from the database. */
class User {
  String userId; String email; String address;
  public User(String theUserId, String theAddress, String theEmail) {
    this.userId = theUserId;
    this.email=theEmail;
    this.address=theAddress;
  }
}