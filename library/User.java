package library;

public class User extends Book{
String userName;
int UserId;
String userContactNo;
String dateOfIssue,dateOfReturn;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
public String getUserContactNo() {
	return userContactNo;
}
public void setUserContactNo(String userContactNo) {
	this.userContactNo = userContactNo;
}
public String getDateOfIssue() {
	return dateOfIssue;
}
public void setDateOfIssue(String dateOfIssue) {
	this.dateOfIssue = dateOfIssue;
}
public String getDateOfReturn() {
	return dateOfReturn;
}
public void setDateOfReturn(String dateOfReturn) {
	this.dateOfReturn = dateOfReturn;
}

}
