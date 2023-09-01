// MyUserService.java

package application.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import application.model.User;

public class MyUserService {
	public static MyUserService getInstance() {
	
	return new MyUserService();
}

private static Map<String, User> STORAGE_MAP = new HashMap<String, User>();         

public Map<String, User> addUser(User user) {
	Objects.nonNull(user.getUserId());
	
	STORAGE_MAP.put(user.getUserId(), user);
	
	return STORAGE_MAP;
	}
}