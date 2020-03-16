package test.test.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.github.tools.annotations.api.FunctionDescriber;

import test.test.models.User;

@Mapper
public interface UserMapper {

	  @Insert("INSERT INTO user(name, pwd, age) VALUES(#{name}," + "#{pwd}, #{age})")
	  
	  @FunctionDescriber(shortName = "创建用户")
	  public void addUser(User user);
	
	  @Select("select * from user where name=#{name}")
	  
	  @FunctionDescriber(shortName = "根据name查询用户")
	  public User getUser(String name);

}

